/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.student.solution.challenge2;

import javax.swing.JOptionPane;

/**
 *
 * @author jryder
 */
public class GUIReader implements Reader {

    private String message;
    private String prompt;
    
    
    public GUIReader(String prompt){
	this.prompt = prompt;
    }
    
    @Override
    public void read() {
	this.message = JOptionPane.showInputDialog(null, message, prompt, 1);
    }

    
}
