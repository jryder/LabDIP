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
    private static final String billError = "Error: bag rate must be between " + minBill + " and " + maxBill;
    private double bagCount;
    private double baseTipPerBag; //in order for this class to be compatible with the TipCalulator interface, it can't have this modified at the application level.
    //it could still be changed, so we'll leave that flexibility in, but will not likely happen due to the interchangeability between this and other classes
    
    
    //base constructor.  Must get all values for this type of tipping calculation
    public BaggageServiceTipCalculator(){
	Reader reader = new GUIReader("What is the base tip per bag?");
	double baseTip;
	
	//get base tip per bag from user
	baseTip = Double.valueOf(reader.read());
	
        if(baseTipPerBag < minBill || baseTipPerBag > maxBill) {
            throw new IllegalArgumentException(billError);
        }
        this.baseTipPerBag = baseTip;	
    
	reader.setPrompt("How many bags did you have?");
	
	bagCount = Double.valueOf(reader.read());

    }
    
    
    @Override
    public double getTip(double tipRate) {   
	return baseTipPerBag * bagCount * (1 + tipRate);
    }

    
}
