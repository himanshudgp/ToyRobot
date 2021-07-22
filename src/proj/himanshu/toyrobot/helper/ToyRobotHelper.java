package proj.himanshu.toyrobot.helper;

import java.util.Objects;

import proj.himanshu.toyrobot.util.ToyRobotUtil;

public class ToyRobotHelper {

	private ToyRobot robot = new ToyRobot();
	
	public void evaluate(String input) {
		String command = ToyRobotUtil.getCommand(input);
		if(Objects.nonNull(command)) {
			switch (command) {
				case "PLACE":
					robot.place(input);
					break;
				case "MOVE" :
					robot.move(input);
					break;
				case "LEFT" :
					robot.rotateLeft();
					break;
				case "RIGHT" :
					robot.rotateRight();
					break;
				case "REPORT" :
					robot.report();
					break;
				default:
					System.out.println("!!! Invalid Command \r\n");
					break;
			} 
		}
	}
}
