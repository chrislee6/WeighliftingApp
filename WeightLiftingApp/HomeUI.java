import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HomeUI extends BaseUI
{
    private JFrame screen;
    private JLabel title;
    private JButton startWorkout;
    private JButton options;
    private JButton logOut;
    Person p = new Person();
    Button b = new Button();
    
    String goToUI="";
    
    
    
    public HomeUI(Person person)
    {
        super(person);
    }
    
    public void display() 
    {
        screen = new JFrame("WeightLiftingApp");
        
        screen.setSize(500,500);
        screen.setDefaultCloseOperation(screen.EXIT_ON_CLOSE);
        screen.setLayout(new GridLayout(4,1,10,10));
        
        title = new JLabel("Welcome! Please select an option.",JLabel.CENTER);
        startWorkout = new JButton("Start Workout");
        options = new JButton("Settings");
        logOut = new JButton("Log Out");
        
        
        startWorkout.addActionListener(b);
        options.addActionListener(b);
        logOut.addActionListener(b);
        
        screen.add(title);
        screen.add(startWorkout);
        screen.add(options);
        screen.add(logOut);
        
        screen.setVisible(true);
    }

    private class Button implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource()==startWorkout)
            {
                goToUI="start";
                screen.setVisible(false);
            }
            if (e.getSource()==options)
            {
                goToUI="settings";
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

}
