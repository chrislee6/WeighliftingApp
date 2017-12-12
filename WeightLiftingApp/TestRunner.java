import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Thread;

public class TestRunner
{
    BaseUI base = null;
    Person person = new Person();
    HomeUI home = new HomeUI(person);
    StartWorkoutUI start = new StartWorkoutUI(person);
    SettingsUI settings = new SettingsUI(person);

    boolean update;
    boolean firstOpen=true;
    String goToUI;

    public TestRunner()
    {
        for (int i=0;i<100;i++)
        {
            if (i==0)
            {
                update = false;
                goToUI="home";
            }
            do
            {
                run();
            }while(!update);
            update=false;
        }
    }

    public static void main(String[] args)
    {
        new TestRunner();
    }

    public void run()
    {
        if (goToUI.equals("home"))
        {
            base=home;
        }
        else if (goToUI.equals("start"))
        {
            base=start;
        }
        else if (goToUI.equals("settings"))
        {
            base = settings;
        }
        base.display();
        base.reset();
        while(base.goTo().equals(""))
        {
            System.out.close();
        }
        if (base.goTo().equals("home"))
        {
            goToUI="home";
            update=true;
        }
        else if (base.goTo().equals("start"))
        {
            goToUI="start";
            update=true;
        }
        else if (base.goTo().equals("settings"))
        {
            goToUI="settings";
            update=true;
        }
    }

    
}
