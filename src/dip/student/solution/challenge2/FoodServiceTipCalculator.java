package dip.student.solution.challenge2;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */


public class FoodServiceTipCalculator implements TipCalculator{
    private static double minBill = 0.00;
    private static String billError = "Error: bill must be greater than or equal to " + minBill;
    private static final double rateGood = 0.20;
    private static final double rateFair = 0.15;
    private static final double ratePoor = 0.10;
    private double bill = 0.00;
    
    public enum ServiceQuality {GOOD, FAIR, POOR}
    private ServiceQuality serviceQuality;
  
    
 
    @Override
    public double getTip() {
	
        if(bill < minBill) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }	
	
        double tip = 0.00; // always initialize local variables

	switch(serviceQuality) {
            case GOOD:
                tip = bill * rateGood;
                break;
            case FAIR:
                tip = bill * rateFair;
                break;
            case POOR:
                tip = bill * ratePoor;
                break;
        }
        return tip;
    }


}
