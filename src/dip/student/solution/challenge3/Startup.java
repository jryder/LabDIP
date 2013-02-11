package dip.student.solution.challenge3;

import java.text.NumberFormat;


/**
 * 
 * @author jordan ryder
 * 
 * I didn't look at the instructor version until the previous commit.  
 * My code was surprisingly similar.  You were right, there was a bunch of stuff
 * thrown in to confuse the user regarding enum, if statements, etc.  The only
 * thing I changed after updating looking at the answer example was creating
 * the Employee array to use polymorphism.  I'm enjoying this so far...
 */

public class Startup {

    public static void main(String[] args) {

        //Low-level modules
        Employee emp1 = new HourlyEmployee(10.50, 2020);
        Employee emp2 = new SalariedEmployee(45000, 1250);
        Employee emp3 = new SalariedEmployee(90000,0);

        // High-level module
        HRService hr = new HRService();

        // Just utility code to format numbers nice.
        NumberFormat nf = NumberFormat.getCurrencyInstance();

	
	Employee[] employees = {emp1,emp2,emp3};
	
        // Test input/output by looping over collection in a way that
        // doesn't break if we add/subtract employees from array
        for(int i=0; i < employees.length; i++) {
            System.out.println("Employee " + (i+1) + " compensation:"
		    + nf.format(hr.getAnnualCompensationForEmployee(employees[i])));
        }	
	        
    }

}
