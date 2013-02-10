package dip.student.solution.challenge2;

import dip.lab2.*;

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
    private static final double rateGood = 0.20;
    private static final double rateFair = 0.15;
    private static final double ratePoor = 0.10;
    private double bagCount;
    private double baseTipPerBag;
    private ServiceQuality serviceQuality;


    
    
    public double getTipForBaggeHandler() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + GOOD_RATE);
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + FAIR_RATE);
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + POOR_RATE);
                break;
        }

        return tip;
    }

  

    public double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }

    
}
