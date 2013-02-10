

package dip.student.solution.challenge2;

/**
 *
 * @author Jordan Ryder
 */
public interface TipCalculator {
    
    public enum ServiceQuality {GOOD, FAIR, POOR}
    public abstract double getTip(ServiceQuality quality);
    
}
