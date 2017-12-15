
public class StringMethods
{
    String string;
    int num;
    double dub;
    boolean worked = true;
    boolean isALift = false;
    
    public StringMethods()
    {
        
    }


    public boolean isStringANum(String string)
    {
        //try-catch statement
        this.string = string;
        try
        {
            num = Integer.valueOf(string);
            worked = true;
        }
        catch (Exception e)
        {
            worked = false;
        }
        return worked;
    }
    
    public boolean isStringADouble(String string)
    {
        //try-catch statement
        this.string = string;
        try
        {
            dub = Double.parseDouble(string);
            worked = true;
        }
        catch (Exception e)
        {
            worked = false;
        }
        return worked;
    }
    
    public boolean isStringALift(String string)
    {
        if (string.toLowerCase().equals("front squat"))
        {
            isALift=true;
        }
        else if (string.toLowerCase().equals("hang clean"))
        {
            isALift=true;
        }
        else if (string.toLowerCase().equals("deadlift"))
        {
            isALift=true;
        }
        
        return isALift;
    }
}
