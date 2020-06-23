package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
		Robot wally = new Robot();
		int speed = 100;
		
		wally.penDown();
		wally.setSpeed(speed);
		
		for (int i = 0; i < 4; i++) {
			
			wally.move(200);
			wally.turn(-90);
			
		}


	
		
		
	}
}
