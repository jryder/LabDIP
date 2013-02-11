package dip.student.solution.challenge2;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class BaggageServiceTipCalculator implements TipCalculator {
    private static final double minBill = 0.00;
    private static final double maxBill = 100.00;
    private static final String billError = "Error: bill must be between " + minBill + " and " + maxBill;
    private double bagCount;
    private double baseTipPerBag; //in order for this class to be compatible with the TipCalulator interface, it can't have this modified at the application level.
    //it could still be changed, so we'll leave that flexibility in, but will not likely happen due to the interchangeability between this and other classes
    
    
    public void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag < minBill || baseTipPerBag > maxBill) {
            throw new IllegalArgumentException(billError);
        }
        this.baseTipPerBag = baseTipPerBag;
    }   
    
    
    @Override
    public double getTip(double tipRate) {   
	return baseTipPerBag * bagCount * (1 + tipRate);
    }




    
}
