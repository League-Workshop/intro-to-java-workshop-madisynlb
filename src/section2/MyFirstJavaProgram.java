package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	
 Robot tod = new Robot();
		tod.penDown();
		
		tod.setPenColor(Color.BLUE);
		
	for(int i=0; i < 20; i++){
		
		tod.turn(360/20);
		tod.move(100);
		tod.setSpeed(100);
	    }
	}
	}
