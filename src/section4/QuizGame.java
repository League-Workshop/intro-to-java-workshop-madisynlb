package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
	String animal = JOptionPane.showInputDialog(null,"whats my favorite animal?");
		// 3.  Use an if statement to check if their answer is correct
		if(animal.equals("flamingo")) {
		JOptionPane .showMessageDialog(null,"correct!");
		score+= 5;
		}
		else {
	JOptionPane .showMessageDialog(null, " The correct answer was famingo");
		}
		// 4.  if the user's answer was correct, add one to their score 
	
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		
	}
}
