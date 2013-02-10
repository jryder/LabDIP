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
    private static final double minBill = 0.00;
    private static final String billError = "Error: bill must be greater than or equal to " + minBill;
    private double bill = 0.00;

    public double getBill() {
	return bill;
    }

    public void setBill(double bill) {
	this.bill = bill;
    }
       
 
    @Override
    public double getTip(ServiceQuality serviceQuality) {
	
        if(bill < minBill) {
            throw new IllegalArgumentException(billError);
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
