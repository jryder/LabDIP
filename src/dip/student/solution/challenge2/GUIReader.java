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
    public String read() {
	this.message = JOptionPane.showInputDialog(null, null, prompt, 1);
	return this.message;
	
    }

    
    @Override
    public void setPrompt(String prompt) {
	this.prompt = prompt;
    }

    
}
