
package Challenge1;

/**
 *
 * @author jryder
 */
public class Copier {
    public void copy(Reader r, Writer w){        

	r.read();
	w.write(r.getMessage());
    }
}
