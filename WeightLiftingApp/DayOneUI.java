import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;


public class DayOneUI extends BaseUI
{
    private JFrame screen;
    private JLabel titleDay;
    private JLabel titleWeek;
    private JLabel lowerBodyLabel;
    private JLabel lowerBodyLift;
    private JLabel upperBody1Label;
    private JLabel upperBody1Lift;
    private JLabel subset1Label;
    private JLabel subset1Lift;
    private JLabel upperBody2Label;
    private JLabel upperBody2Lift;
    private JLabel subset2Label;
    private JLabel subset2Lift;
    private JLabel core1Label;
    private JLabel core1Lift;
    private JLabel core2Label;
    private JLabel core2Lift;
    private JButton home;
    private JButton logOut;
    
    private Border border;
    String goToUI="";
    int week;
    
    Button b = new Button();
    
    public DayOneUI(Person person,int week)
    {
        super(person);
        this.week=week;
    }

    public void display()
    {
        screen = new JFrame();
        
        screen.setSize(500,500);
        screen.setDefaultCloseOperation(screen.EXIT_ON_CLOSE);
        screen.setLayout(new GridLayout(9,2,0,0));
        
        titleDay = new JLabel("Day 1 Workout", SwingConstants.CENTER);
        titleWeek = new JLabel("Week "+ week +" Workout", SwingConstants.CENTER);
        lowerBodyLabel = new JLabel("<html>FrontSquat<br>"+
                                       primaryLowerBodyLabel() +"</html>",
                                       SwingConstants.CENTER);
        lowerBodyLift = new JLabel("<html>"+primaryLowerBodyLift1()+"<br>"+ 
                                       primaryLowerBodyLift2()+"</html>"
                                       ,SwingConstants.CENTER);
        upperBody1Label = new JLabel("DB Chest Press", SwingConstants.CENTER);
        upperBody1Lift = new JLabel("4 x 6", SwingConstants.CENTER);
        subset1Label = new JLabel("SB Leg Curls", SwingConstants.CENTER);
        subset1Lift = new JLabel("3 x 10",SwingConstants.CENTER);
        upperBody2Label = new JLabel("Weighted Pull-ups", SwingConstants.CENTER);
        upperBody2Lift = new JLabel("4 x 5", SwingConstants.CENTER);
        subset2Label = new JLabel("Chest Supported T's", SwingConstants.CENTER);
        subset2Lift = new JLabel("3 x 10", SwingConstants.CENTER);
        core1Label = new JLabel("Deadbugs", SwingConstants.CENTER);
        core1Lift = new JLabel("2 x 10ea",SwingConstants.CENTER);
        core2Label = new JLabel("Anti-Band Rotation", SwingConstants.CENTER);
        core2Lift = new JLabel("2 x 10ea", SwingConstants.CENTER); 
        home = new JButton("Home");
        logOut = new JButton("Log Out");
        
        home.addActionListener(b);
        logOut.addActionListener(b);
        
        border = BorderFactory.createLineBorder(Color.black,1);
        titleDay.setBorder(border);
        titleWeek.setBorder(border);
        lowerBodyLabel.setBorder(border);
        lowerBodyLift.setBorder(border);
        upperBody1Label.setBorder(border);
        upperBody1Lift.setBorder(border);
        subset1Label.setBorder(border);
        subset1Lift.setBorder(border);
        upperBody2Label.setBorder(border);
        upperBody2Lift.setBorder(border);
        subset2Label.setBorder(border);
        subset2Lift.setBorder(border);
        core1Label.setBorder(border);
        core1Lift.setBorder(border);
        core2Label.setBorder(border);
        core2Lift.setBorder(border);
        
        screen.add(titleDay);
        screen.add(titleWeek);
        screen.add(lowerBodyLabel);
        screen.add(lowerBodyLift);
        screen.add(upperBody1Label);
        screen.add(upperBody1Lift);
        screen.add(subset1Label);
        screen.add(subset1Lift);
        screen.add(upperBody2Label);
        screen.add(upperBody2Lift);
        screen.add(subset2Label);
        screen.add(subset2Lift);
        screen.add(core1Label);
        screen.add(core1Lift);
        screen.add(core2Label);
        screen.add(core2Lift);
        screen.add(home);
        screen.add(logOut);
        
        screen.setVisible(true);
    }
    
    
    private class Button implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource()==home)
            {

            }
            if (e.getSource()==logOut)
            {
                screen.dispose();
                System.exit(0);
            }
        }
    }
    
    
    private String primaryLowerBodyLabel()
    {
        String s = "";
        if (week>4 && week <=8)
        {
            s="(+10 lbs)";
        }
        else if (week>8 && week <=12)
        {
            s="(+20 lbs)";
        }
        return s;
    }
    
    private String primaryLowerBodyLift1()
    {
        String s = "";
        if (week%4==1)
        {
            s = "5,5,5,5,5+";
        }
        else if (week%4==2)
        {
            s = "5,5,5,3,3+";
        }
        else if (week%4==3)
        {
            s = "5,5,5,3,1+";
        }
        else if (week%4==0)
        {
            s = "5,5,5";
        }
        return s;
    }
    
    private String primaryLowerBodyLift2()
    {
        String s = "";
        if (week%4==1)
        {
            s = "50,60,70,75,80";
        }
        else if (week%4==2)
        {
            s = "50,60,70,80,85";
        }
        else if (week%4==3)
        {
            s = "50,60,75,85,90";
        }
        else if (week%4==0)
        {
            s = "50,60,70";
        }
        return s;
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
