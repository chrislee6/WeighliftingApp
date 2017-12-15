
public class BuildProgram
{
    public BuildProgram()
    {
    }
    
    public Workout createWorkout(int dayx, int weekx, int fs, int hc, int dl)
    {
        Workout workout = null;      
        if (dayx == 1)
        {
            workout = new DayOne(weekx,fs,hc,dl);
        }
        else if (dayx == 2)
        {
            workout = new DayTwo(weekx,fs,hc,dl);
        }
        else if (dayx == 3)
        {
            workout = new DayThree(weekx,fs,hc,dl);
        }
        else
        {
            System.out.println("Please enter a different day");
        }        
        workout.display();
        
        
        return workout;
    }
}
