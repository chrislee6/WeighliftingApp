
public abstract class Workout
{
    int week;
    int fs;
    int hc;
    int dl;
    
    public Workout(int week, int fs, int hc, int dl)
    {
        this.week=week;
        this.fs=fs;
        this.hc=hc;
        this.dl=dl;
    }
    
    abstract void display();
    
    public abstract String goTo();
    
    public abstract void reset();
}
