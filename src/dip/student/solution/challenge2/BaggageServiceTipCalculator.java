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
    private static final String billError = "Error: bill must be greater than or equal to " + minBill;
    private double bagCount;
    private double baseTipPerBag;
    
    
    @Override
    public double getTip(ServiceQuality serviceQuality) {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + rateGood);
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + rateFair);
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + ratePoor);
                break;
        }
        return tip;
    }

    
    public void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag < minBill || baseTipPerBag > maxBill) {
            throw new IllegalArgumentException(billError);
        }
        this.baseTipPerBag = baseTipPerBag;
    }

    
}
