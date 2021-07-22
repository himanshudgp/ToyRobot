package proj.himanshu.toyrobot.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ToyRobotLiterals {
	
	private static List<String> validCommands = new ArrayList<String>();

	public static List<String> getValidCommands() {
		
		validCommands.add("PLACE");
		validCommands.add("MOVE");
		validCommands.add("LEFT");
		validCommands.add("RIGHT");
		validCommands.add("REPORT");
		
		return validCommands;
	}
	
	
	private static List<String> directions = new ArrayList<String>();

	public static List<String> getDirections() {
		
		directions.add("NORTH");
		directions.add("SOUTH");
		directions.add("EAST");
		directions.add("WEST");
		
		return directions;
	}
	
	public static final Set<String> VALID_CO_ORDINATES = new ToyRobotUtil().getSquareBoard();
	
	
}
