
public abstract class Workout
{
    int week;
    
    public Workout(int week)
    {
        this.week=week;
    }
    
    abstract void display();
    
    public abstract String goTo();
    
    public abstract void reset();
}
