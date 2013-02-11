

package dip.student.solution.challenge2;

/**
 *
 * @author jorda_000
 */
public class TipperBad implements TipRates{
    public final double rateGood = 0.15;
    public final double rateFair = 0.12;
    public final double ratePoor = 0.09;
    
    
    @Override
    public double getTipRate(ServiceQuality quality) {
	throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
