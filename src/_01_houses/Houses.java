package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot Lupin = new Robot();
	public void run() {
		for (int i = 0; i < 11; i++) {
			drawHouse();	
		}
		
		
	}
	
	void drawHouse() {
		
		Lupin.penDown();
		Lupin.move(100);
		Lupin.turn(90);
		Lupin.move(50);
		Lupin.turn(90);
		Lupin.move(100);
		Lupin.turn(-90);
		Lupin.move(30);
		Lupin.turn(-90);
		
	
	
	}
}
