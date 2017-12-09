import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DayTwo extends Workout
{
    private JFrame screen;
    public DayTwo(int week)
    {
        super(week);
    }
    
    public void display()
    {
        screen = new JFrame();
        int maxFS;
        int maxDB;
        screen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        int xStart[]={200,400,400,200};
        int yStart[]={450,450,550,550};
        screen.setVisible(true);
        // Not sure if this will go line by line yet
        JLabel label = new JLabel("Enter your max hang clean weight: ");
        screen.add(label);
        label.setText("Here is your workout");
        // Change workout and place exercises here
    }
}
