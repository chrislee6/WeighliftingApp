import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StartWorkoutUI extends BaseUI
{
    private JFrame screen;
    private JLabel dayL;
    private JLabel weekL;
    private JTextField dayTF;
    private JTextField weekTF;
    private JButton start;
    private JLabel error;
    private int day;
    private int week;
    private boolean dayIsNum;
    private boolean weekIsNum;
    StringMethods sm = new StringMethods();
    Button b = new Button();
    
    String goToUI="";

    public StartWorkoutUI(Person person)
    {
        super(person);
    }

    public void display()
    {
        screen = new JFrame("WeightLiftingApp");

        screen.setSize(500,500);
        screen.setDefaultCloseOperation(screen.EXIT_ON_CLOSE);
        screen.setLayout(new GridLayout(6,1,10,10));

        dayL = new JLabel("What day are you on?",JLabel.CENTER);
        weekL = new JLabel("What week are you on?",JLabel.CENTER);
        dayTF = new JTextField(10);
        weekTF = new JTextField(10);
        start = new JButton("Start Workout");
        error = new JLabel();

        start.addActionListener(b);

        screen.add(dayL);
        screen.add(dayTF);
        screen.add(weekL);
        screen.add(weekTF);
        screen.add(start);
        screen.add(error);

        screen.setVisible(true);
    }

    private class Button implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource()==start)
            {
                day=0;
                week=0;
                dayIsNum=sm.isStringANum(dayTF.getText());
                weekIsNum=sm.isStringANum(weekTF.getText());

                if (dayIsNum && weekIsNum)
                {
                    day = Integer.valueOf(dayTF.getText());
                    week = Integer.valueOf(weekTF.getText());
                }
                else
                {
                    error.setText("Please enter a number for day and week");
                }
                BuildProgram lift = new BuildProgram();
                lift.createWorkout(day,week);
                screen.setVisible(false);
            }
        }
    }

    public String goTo()
    {
        return goToUI;
    }
    
    public void reset()
    {
        goToUI="";
    }

}
