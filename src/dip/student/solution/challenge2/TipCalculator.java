

package dip.student.solution.challenge2;

/**
 *
 * @author Jordan Ryder
 */
public interface TipCalculator {
    
    //depends on the intent of the program, but these could be configured here for standards sake
    //otherwise they could be on the subclass level, but I like this better

    public abstract double getTip(double tipRate);
    
}
