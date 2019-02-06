//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot robot = new Robot();
	public static void main(String[] args) {
		
		 // 2. Ask the user how dizzy you want the robot from 1-10, then spin that number of times.
String boi = JOptionPane.showInputDialog("How many spins do you want from 1-10?");
int spin = Integer.parseInt(boi);

dance(spin);
 // 1. Use the dance method to make the robot spin.
	}
	static void dance(int spin) {
		for (int i = 0; i < spin ; i++) {
			robot.setSpeed(150);
			robot.turn(360);
		}
	}
}

