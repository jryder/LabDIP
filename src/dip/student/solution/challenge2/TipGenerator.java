


package dip.student.solution.challenge2;

/**
 *
 * @author Jordan Ryder
 */
public class TipGenerator {
    
    public double getTip(TipRates r, TipCalculator c){
	
	//all of the complexity is handled in the low level classes.  Pass in the proper rate classes and 
	//any extra variables needed will be requested of the user during the program running
	//love the simplicity on the front end!  :D
	
	return c.getTip(r.getTipRate());
	
    }
    
}
