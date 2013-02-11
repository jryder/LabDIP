package dip.student.solution.challenge3;

import dip.lab1.*;
import javax.swing.JOptionPane;

/**
 * A high-level class that delegates to employee objects to do the work. Does
 * this class design follow the DIP? If not, fix it.
 *
 * @author your name goes here
 */
public class HRService {

    public double getAnnualCompensationForEmployee(Employee e)
    {
        return e.getAnnualWages();
    }
}
