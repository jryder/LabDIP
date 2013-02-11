package dip.student.solution.challenge2;
import java.text.NumberFormat;
import javax.swing.JOptionPane;
/**
 * @author Jordan Ryder
 * 
 * The program could be done different in regards to the TipRates, but I wanted
 * to try and play around with having interchangeable classes, and this provides 
 * that flexibility.  The problem with the different TipCalculators is that they
 * require different variables, so in order to have polymorphism, the variables
 * have to be passed in from the user when the program is actually running, because
 * they wouldn't be interchangeable otherwise due to the different properties.
 * 
 * 
 * 
 * 
 */
public class Startup {
 
    public static void main(String[] args) {
        
	double tip;
	TipCalculator[] tips = {new BaggageServiceTipCalculator(),new FoodServiceTipCalculator()};
	TipRates[] rates = {new TipperGood(),new TipperBad(),new TipperTerrible()};
	

	
	//high level class
	TipGenerator g = new TipGenerator();
	
	
	//output results
	NumberFormat formatter = NumberFormat.getCurrencyInstance();
	
	
	//loop through all tipper/service type combinations  :D
	for (TipCalculator t: tips){
	    for (TipRates r: rates)
		{tip = g.getTip(r, t);
		JOptionPane.showMessageDialog(null, "The tip amount from the " + r.getDescription() + " is " + formatter.format(tip));	
		}
	}
    }
}
