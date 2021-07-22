package proj.himanshu.toyrobot.util;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;

public class ToyRobotUtil {
	
	public static Set<String> getSquareBoard(){
		Set<String> boardHash = new HashSet<String>();
		for(int x=0; x<5 ; x++) {
			for(int y=0;y<5;y++) {
				String location = Integer.toString(x)+y;
				boardHash.add(location);
			}
		}
		
		return boardHash;
	}
	
	public static String getCommand(String input) {
		
		if(Objects.nonNull(input)) {
			input = input.trim().toUpperCase();
			String command = input.startsWith("PLACE") ? "PLACE" : input;
			if(ToyRobotLiterals.getValidCommands().contains(command)) {
				return command;
			}
		}

		return null;
	}
	
	public static boolean isPlaceCommandPatternComplete(String input) {
		input = input.trim().toUpperCase();
		boolean placeCommandIsValid = Pattern.compile("PLACE [0-4],[0-4],[a-zA-Z]{1,5}").matcher(input).matches() ;
		if(placeCommandIsValid) {
			return true;
		}else {
			System.out.println("!!Invalid Place Command");
			return false;
		}
		
	}

}
