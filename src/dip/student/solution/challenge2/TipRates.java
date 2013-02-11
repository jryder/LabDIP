

package dip.student.solution.challenge2;

/**
 *
 * @author jorda_000
 */
public interface TipRates {

    //this interface only requires the subclass to return a tip amount
    public static enum ServiceQuality {GOOD, FAIR, POOR}
    public double getTipRate(ServiceQuality quality);
}
