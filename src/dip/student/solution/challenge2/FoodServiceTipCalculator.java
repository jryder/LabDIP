package dip.student.solution.challenge2;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author Jordan Ryder
 */


public class FoodServiceTipCalculator implements TipCalculator{
    private static final double minBill = 0.00;
    private static final String billError = "Error: bill must be greater than or equal to " + minBill;
    private double bill = 0.00;

    
    @Override
    public double getTip(double tipRate) {
	
        if(bill < minBill) {
            throw new IllegalArgumentException(billError);
        }	
         return bill * tipRate;
    }

}
