package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE 
	Robot RealmBot = new Robot();
	RealmBot.changeRobot("https://www.pngkey.com/png/full/94-941719_naruto-png-library-stock-naruto-shippuden-render.png");
		RealmBot.setSpeed(99);
		RealmBot.penDown();
		RealmBot.setPenColor(Color.CYAN);
		RealmBot.setPenWidth(5000000);
		for(int i =0; i<4; i++) {
		RealmBot.move(341);
		RealmBot.turn(90);
		
		}
	}
}
