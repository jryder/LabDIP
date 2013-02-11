

package dip.student.solution.challenge2;

/**
 *
 * @author jorda_000
 */
public class TipperTerrible implements TipRates {

    public final double rateGood = 0.06;
    public final double rateFair = 0.03;
    public final double ratePoor = 0.00;
    
    @Override
    public double getTipRate(ServiceQuality quality) {
	throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
