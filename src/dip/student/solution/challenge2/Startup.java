package dip.student.solution.challenge2;
import java.text.NumberFormat;
import javax.swing.JOptionPane;
/**
 * @author Jordan Ryder
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
