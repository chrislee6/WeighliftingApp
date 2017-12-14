import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.*;
import java.util.Scanner;



public class Tester
{
    boolean b;
    private JFrame screen;
    private JButton button;
    
    
    public Tester() 
    {
        program();
    }

    public static void main(String[] args) 
    {
        new Tester();
    }
    
    public void program() 
    {
        screen = new JFrame("WeightLiftingApp");
        
        screen.setSize(500,500);
        screen.setDefaultCloseOperation(screen.EXIT_ON_CLOSE);
        screen.setLayout(new GridLayout(4,1,10,10));
        
        button = new JButton("press");
        
        button.addActionListener(new MyButtonListener());
        
        screen.add(button);
        
        screen.setVisible(true);
    }
    
    private class MyButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.out.println("hello");
            b=true;
        }
    }

    
 
}
