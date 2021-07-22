package proj.himanshu.toyrobot.main;

import java.util.Scanner;

import proj.himanshu.toyrobot.helper.ToyRobotHelper;

public class RunToyRobot {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Use Following Commands to Move the robot On a 5*5 board : \r\n"
				+ "PLACE X,Y,F => This should be first command with co-ordinates and direction to which the robot must be facing \r\n"
				+ "MOVE => To move robot in the direction \r\n"
				+ "LEFT => Rotate robot 90 degrees left \r\n"
				+ "RIGHT => Rotate robot 90 degrees right \r\n"
				+ "REPORT => Print the current Location \r\n"
				+ "EXIT => To exit the application \r\n"
				+ "========================================================================================================\r\n");
		
		
		String input = scan.nextLine().trim().toUpperCase();
		ToyRobotHelper helper = new ToyRobotHelper();
		while(!"EXIT".equals(input.trim().toUpperCase())) {
			helper.evaluate(input);
			input = scan.nextLine().trim().toUpperCase();
		}
		System.out.println("You have exited the application");
	}

}
