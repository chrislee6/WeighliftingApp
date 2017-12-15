import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Thread;

public class RunProgram
{
    BaseUI base = null;
    
    Person person = new Person();
    HomeUI home = new HomeUI(person);
    StartWorkoutUI start = new StartWorkoutUI(person);
    RunningWorkoutUI run = new RunningWorkoutUI(person);
    
    
    int week;
    boolean update;
    boolean firstOpen=true;
    String goToUI;

    public RunProgram()
    {
        for (int i=0;i<1000;i++)
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
        new RunProgram();
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
        else if (goToUI.equals("run"))
        {
            base=run;
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
        else if (goToUI.equals("rday1"))
        {
            base= new rDayOneUI(person,week);
        }
        else if (goToUI.equals("rday2"))
        {
            base= new rDayTwoUI(person,week);
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
        else if (base.goTo().equals("run"))
        {
            goToUI="run";
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
        else if (base.goTo().equals("rday1"))
        {
            goToUI="rday1";
            update=true;
        }
        else if (base.goTo().equals("rday2"))
        {
            goToUI="rday2";
            update=true;
        }
    }
}
    
    
    
    
    