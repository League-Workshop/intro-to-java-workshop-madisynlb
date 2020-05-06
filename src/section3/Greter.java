package section3;

import javax.swing.JOptionPane;

public class Greter {

	public static void main(String[] args) {
	
		String name= JOptionPane.showInputDialog(null,"what is your name");
		
	JOptionPane.showMessageDialog(null,"hello " + name + " How are you today?");
	
	if(name.equals("madisyn")) {
		
		JOptionPane.showMessageDialog(null,"I left a box of cookies on your bed!");
	
	}
	else {
		JOptionPane.showMessageDialog(null,"I left you a bag of snickers at home!");
	   } 
	}
}