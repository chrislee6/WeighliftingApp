import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WeightCalculatorUI extends BaseUI
{
    private JFrame screen;
    private JLabel weight;
    private JLabel percent;
    private JLabel error;
    private JTextField weightTF;
    private JTextField percentTF;
    private JButton back;
    private JButton calculate;
    
    StringMethods sm = new StringMethods();
    PercentageCalculator pc = new PercentageCalculator();
    Button b = new Button();
    String goToUI="";
    int day;
    int week;
    int weightNum;
    int weightPercent;
    double percentage;
    boolean findweek = false;
    private boolean isNum1;
    private boolean isNum2;
    
    public WeightCalculatorUI(Person person, int day, int week)
    {
        super(person);
        this.day=day;
        this.week=week;
    }

    public void display()
    {
        screen = new JFrame("WeightLiftingApp");

        screen.setSize(500,500);
        screen.setDefaultCloseOperation(screen.EXIT_ON_CLOSE);
        screen.setLayout(new GridLayout(6,1,10,10));
        
        weight = new JLabel("Enter max weight");
        percent = new JLabel("Enter percentage");
        weightTF = new JTextField(10);
        percentTF = new JTextField(10);
        back = new JButton("Back");
        error = new JLabel();
        calculate = new JButton("Calculate");
        
        back.addActionListener(b);
        calculate.addActionListener(b);
        
        screen.add(weight);
        screen.add(weightTF);
        screen.add(percent);
        screen.add(percentTF);
        screen.add(calculate);
        screen.add(error);
        screen.add(back);
        
        screen.setVisible(true);
    }
    
    private class Button implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource()==calculate)
            {
                isNum1=sm.isStringANum(weightTF.getText());
                isNum2=sm.isStringANum(percentTF.getText());
                if (isNum1 && isNum2)
                {
                    weightNum=Integer.valueOf(weightTF.getText());
                    percentage=Double.parseDouble(percentTF.getText());
                    weightPercent = pc.percent(weightNum,percentage);
                    error.setText(Integer.toString(weightPercent));
                }
                else
                {
                    error.setText("Please enter a enter for weight and percent");
                }
            }
            if (e.getSource()==back)
            {
                
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
    
    public int getWeek()
    {
        return week;
    }
    
    public boolean findWeek()
    {
        return findweek;
    }
}
