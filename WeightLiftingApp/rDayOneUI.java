import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class rDayOneUI extends BaseUI
{
    private JFrame screen;
    private JLabel titleDay;
    private JLabel titleWeek;
    private JLabel runWorkout;
    private JLabel time;
    
    private JButton home;
    private JButton logOut;
    
    private Border border;
    String goToUI="";
    int week;
    
    Button b = new Button();
    
    
    public rDayOneUI(Person person, int week)
    {
        super(person);
        this.week=week;
    }
    
    public void display()
    {
        screen = new JFrame();
        
        screen.setSize(500,500);
        screen.setDefaultCloseOperation(screen.EXIT_ON_CLOSE);
        screen.setLayout(new GridLayout(3,2,0,0));
        
        titleDay = new JLabel("Day 1 Running Workout", SwingConstants.CENTER);
        titleWeek = new JLabel("Week "+ week +" Workout", SwingConstants.CENTER);
        runWorkout = new JLabel("5 x 300 yds", SwingConstants.CENTER);
        time = new JLabel("<html>65 seconds or better. "
                         +"Cones 50 yds apart<br>2:00 min rest</html>",
                           SwingConstants.CENTER);
        home = new JButton("Home");
        logOut = new JButton("Log Out");
        
        home.addActionListener(b);
        logOut.addActionListener(b);
        
        border = BorderFactory.createLineBorder(Color.black,1);
        titleDay.setBorder(border);
        titleWeek.setBorder(border);
        runWorkout.setBorder(border);
        time.setBorder(border);
        
        screen.add(titleDay);
        screen.add(titleWeek);
        screen.add(runWorkout);
        screen.add(time);
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
                goToUI="home";
                screen.setVisible(false);
            }
            if (e.getSource()==logOut)
            {
                screen.dispose();
                System.exit(0);
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
        return 0;
    }
    
    public boolean findWeek()
    {
        return false;
    }
}
