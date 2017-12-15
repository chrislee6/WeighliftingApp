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
    int week;
     
    
    boolean update;
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
            base=settings;
        }
        else if (goToUI.equals("day1"))
        {
            base= new DayOneUI(person,week);
        }
        else if (goToUI.equals("day2"))
        {
            base= new DayTwoUI(person,week);
        }
        else if (goToUI.equals("day3"))
        {
            base= new DayThreeUI(person,week);
        }
        base.display();
        base.reset();
        while(base.goTo().equals(""))
        {
            System.out.close();
        }
        if (base.findWeek())
        {
            week = base.getWeek();
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
        else if (base.goTo().equals("day1"))
        {
            goToUI="day1";
            update=true;
        }
        else if (base.goTo().equals("day2"))
        {
            goToUI="day2";
            update=true;
        }
        else if (base.goTo().equals("day3"))
        {
            goToUI="day3";
            update=true;
        }
    }

    

}
