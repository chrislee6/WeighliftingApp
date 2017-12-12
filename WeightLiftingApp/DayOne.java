import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;


public class DayOne extends Workout
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
    private JButton finish;
    
    private Border borderLB1;
    
    
    Button b = new Button();
    
    
    public DayOne(int week)
    {
        super(week);        
    }

    public void display()
    {
<<<<<<< HEAD
        int maxFS;
        Scanner in = new Scanner(System.in);
        PercentageCalculator percentage = new PercentageCalculator();
        
        System.out.println("Enter your max front squat weight: ");
        maxFS = in.nextInt();
        System.out.println("Here is your workout.");
        lowerBody.primaryLowerBody(maxFS,week);
        U1.upper1(week);
        S1.subset1();
        U2.upper2();
        S2.subset2();
        System.out.println("4A. DEADBUGS: 2x10ea");
        System.out.println("4B. BAND ANTIROTATION: 2x10ea");
                  
=======
>>>>>>> rewrite
        screen = new JFrame();
        
        screen.setSize(500,500);
        screen.setDefaultCloseOperation(screen.EXIT_ON_CLOSE);
        screen.setLayout(new GridLayout(9,2,10,10));
        
        titleDay = new JLabel("Day One Workout", SwingConstants.CENTER);
        titleWeek = new JLabel("Week One Workout", SwingConstants.CENTER);
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
        finish = new JButton("End Workout");
        
        finish.addActionListener(b);
        
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
        screen.add(finish);
        
        screen.setVisible(true);
    }
    
    
    private class Button implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource()==finish)
            {
                System.out.println("works");
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
}
