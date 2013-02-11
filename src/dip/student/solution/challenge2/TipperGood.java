

package dip.student.solution.challenge2;

/**
 *
 * @author jorda_000
 */
public class TipperGood implements TipRates {

    public final double rateGood = 0.22;
    public final double rateFair = 0.18;
    public final double ratePoor = 0.14;    
    
    @Override
    public double getTipRate(ServiceQuality quality) {
	throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
