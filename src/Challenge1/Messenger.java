
package Challenge1;

/**
 *
 * @author jryder
 */
public class Messenger {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Copier c = new Copier();
	
	// the next 2 lines are the only thing that need to change in this program
	Reader[] readers = {new GUIReader(),new ConsoleReader()};
	Writer[] writers = {new GUIWriter(),new ConsoleWriter()};
	
	//loop through all reader/writer combinations  :D
	for (Reader r: readers){
	    for (Writer w: writers)
	    {c.copy(r, w);}
	}
    }
}
