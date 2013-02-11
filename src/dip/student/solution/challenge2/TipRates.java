

package dip.student.solution.challenge2;

/**
 *
 * @author jorda_000
 */
public interface TipRates {

    //this interface only requires the subclass to return a tip amount
    //this could probably be done a different way, but it does add some flexibility.  
    public static enum ServiceQuality {good, fair, poor}
    public abstract double getTipRate();
    
    public abstract String getDescription();
}
