
public class BuildProgram
{
    public BuildProgram()
    {
    }
    
    public Workout createWorkout(int dayx, int weekx)
    {
        Workout workout = null;      
        if (dayx == 1)
        {
            workout = new DayOne(weekx);
        }
        else if (dayx == 2)
        {
            workout = new DayTwo(weekx);
        }
        else if (dayx == 3)
        {
            workout = new DayThree(weekx);
        }
        else
        {
            System.out.println("Please enter a different day");
        }        
        workout.display();
        
        
        return workout;
    }
}
