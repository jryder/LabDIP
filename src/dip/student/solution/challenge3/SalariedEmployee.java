package dip.student.solution.challenge3;
/**

 * @author Jordan Ryder
 */
public class SalariedEmployee implements Employee {

    double annualSalary;
    double annualBonus;


    
    public SalariedEmployee() {}
    /**
     * Convenience constructor. Is this the best way to go?
     * @param annualSalary - the employee's annual salary
     * @param annualBonus - a bonus benefit, if any
     */
    
    public SalariedEmployee(double annualSalary, double annualBonus) {
        setAnnualSalary(annualSalary);
        setAnnualBonus(annualBonus);
    }
    
    public final double getAnnualBonus() {
        return annualBonus;
    }
    
    public final void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
	
	
    public final void setAnnualBonus(double annualBonus) {
	this.annualBonus = annualBonus;
    }  

    @Override
    public double getAnnualWages() {
	return this.annualBonus + this.annualSalary;
    }
}
