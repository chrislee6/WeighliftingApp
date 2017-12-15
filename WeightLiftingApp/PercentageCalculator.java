import java.lang.Double;
import java.lang.Integer;


public class PercentageCalculator
{
    public PercentageCalculator()
    {

    }
    
    public int percent(int max, double percent)
    {
        double weight = 1.0*max*percent;
        int roundedW = (int)weight;
        
        if (roundedW % 5.0 == 0)
        {
            return roundedW;
        }
        else
        {
            return roundTo5(roundedW);
        }
    }
    
    
    public int roundTo5(int q)
    {
        for (int i=1; i<5; i++)
        {
            if ((q+i)%5==0)
            {
                return q+i;
            }
        }
        return q;
    }   
}
