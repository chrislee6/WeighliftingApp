import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SettingsUI extends BaseUI
{
    private JFrame screen;
    private JLabel liftL;
    private JLabel weightL;
    private JLabel error;
    private JTextField liftTF;
    private JTextField weightTF;
    private JButton save;
    private JButton exit;

    StringMethods sm = new StringMethods();
    Button b = new Button();

    public int maxFS;
    public int maxHC;
    public int maxDL;

    String liftType;
    String weightNum;
    boolean weightIsNum;
    boolean isLift;
    String goToUI="";

    public SettingsUI(Person person)
    {
        super(person);
    }

    public void display()
    {
        screen = new JFrame("WeightLiftingApp");

        screen.setSize(500,500);
        screen.setDefaultCloseOperation(screen.EXIT_ON_CLOSE);
        screen.setLayout(new GridLayout(7,1,10,10));

        liftL = new JLabel("Enter a lift to change: Front Squat,Hang Clean, Deadlift");
        weightL = new JLabel("Enter weight");
        error = new JLabel();
        liftTF = new JTextField(10);
        weightTF = new JTextField(10);
        save = new JButton("Save");
        exit = new JButton("Exit");

        save.addActionListener(b);
        exit.addActionListener(b);

        screen.add(liftL);
        screen.add(liftTF);
        screen.add(weightL);
        screen.add(weightTF);
        screen.add(save);
        screen.add(exit);
        screen.add(error);

        screen.setVisible(true);
    }

    private class Button implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource()==save)
            {
                liftType = liftTF.getText();
                weightNum = weightTF.getText();
                weightIsNum = sm.isStringANum(weightNum);
                isLift = sm.isStringALift(liftType);

                if (weightIsNum && isLift)
                {
                    if (liftType.toLowerCase().equals("front squat"))
                    {
                        person.setMaxFS(Integer.valueOf(weightNum));
                    }
                    if (liftType.toLowerCase().equals("hang clean"))
                    {
                        person.setMaxHC(Integer.valueOf(weightNum));
                    }
                    if (liftType.toLowerCase().equals("deadlift"))
                    {
                        person.setMaxDL(Integer.valueOf(weightNum));
                    }
                }
                else if (!weightIsNum && isLift)
                {
                    error.setText("Please enter a number for weight");
                }
                else if (weightIsNum && !isLift)
                {
                    error.setText("Please choose one of the lifts listed");
                }
                else
                {
                    error.setText("Please enter a new number and lift");
                }
            }
            if (e.getSource()==exit)
            {
                goToUI="home";
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
