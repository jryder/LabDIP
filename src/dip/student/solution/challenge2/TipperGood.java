

package dip.student.solution.challenge2;

/**
 *
 * @author jorda_000
 */
public class TipperGood implements TipRates {

    public final double rateGood = 0.22;
    public final double rateFair = 0.18;
    public final double ratePoor = 0.14;    
    public final String desc = "Good Tipper";    
    
    @Override
    public double getTipRate() {
	
	//get service quality from user
	GUIReader r = new GUIReader("How was the service (poor, fair, good)?");
	ServiceQuality quality = ServiceQuality.valueOf(r.read());
	
	double tipRate = 0.00;
	
	switch(quality){
	    case good : tipRate = rateGood;
		break;
	    case fair: tipRate = rateFair;
		break;
	    case poor: tipRate = ratePoor;
		break;
	}	
	return tipRate;
	
	
    }
    
    @Override
    public String getDescription() {
	return desc;
    }    
    
}
