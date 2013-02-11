package dip.student.solution.challenge3;

/**
 * An implementation sub-class of an Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class HourlyEmployee implements Employee {
    
    double hourlyRate;
    double totalHrsForYear;

    
    /**
     * Convenience constructor. Is this the best way to go?
     * @param hourlyRate - the rate per hour that the employee is paid
     * @param totalHrsForYear - total hours worked or predicted per year
     */
    
   
    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        setHourlyRate(hourlyRate);
        setTotalHrsForYear(totalHrsForYear);
    }
    
    public final void setTotalHrsForYear(double totalHrsForYear) {
	this.totalHrsForYear = totalHrsForYear;
    }
    
   public final void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }   
    
   
    @Override
    public double getAnnualWages() {
        return hourlyRate * totalHrsForYear;
    }
   
    
    public double getHourlyRate() {
        return hourlyRate;
    } 
    
    
    public double getTotalHrsForYear() {
        return totalHrsForYear;
    }      
      
}
