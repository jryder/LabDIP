package dip.student.solution.challenge2;

import javax.swing.JOptionPane;

/**
 * @author Jordan Ryder
 */
public class Startup {
 
    public static void main(String[] args) {
        
	double tip;
	TipCalculator t = new FoodServiceTipCalculator();
	TipRates r = new TipperBad();

	//high level class
	TipGenerator g = new TipGenerator();


	tip = g.getTip(r, t);

	System.out.println("The tip amount is " + tip);
    
    }

}
