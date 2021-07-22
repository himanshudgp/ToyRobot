package proj.himanshu.toyrobot.helper;

import java.util.Objects;

import proj.himanshu.toyrobot.util.ToyRobotLiterals;
import proj.himanshu.toyrobot.util.ToyRobotUtil;

public class ToyRobot {

	private Location currentLocation;

	public Location getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(Location currentLocation) {
		this.currentLocation = currentLocation;
	}
	
	public void place(String input) {

		if(!ToyRobotUtil.isPlaceCommandPatternComplete(input))
			return;
		
		String position = input.split(" ")[1];
		String[] token = position.split(",");
		String futurePos = token[0]+token[1];
		String direction = token[2];
		if (ToyRobotLiterals.VALID_CO_ORDINATES.contains(futurePos) && ToyRobotLiterals.getDirections().contains(direction)) {
			currentLocation = new Location(Integer.parseInt(token[0]), Integer.parseInt(token[1]), token[2]);
		}else {
			System.out.println("!!! Please provide valid input.");
		}
	}

	public void move(String input) {
		if (Objects.nonNull(currentLocation)) {
			String direction = currentLocation.getDirection();
			int x = currentLocation.getX();
			int y = currentLocation.getY();

			switch (direction) {
				case "NORTH":
					y++;
					break;
				case "SOUTH":
					y--;
					break;
				case "EAST":
					x++;
					break;
				case "WEST":
					x--;
					break;
				default:
					break;
			}
			String futurePos = Integer.toString(x) + y;
			if (ToyRobotLiterals.VALID_CO_ORDINATES.contains(futurePos)) {
				currentLocation.setX(x);
				currentLocation.setY(y);
			}
		}
	}

	public void rotateLeft() {
		if (Objects.nonNull(currentLocation)) {
			String direction = currentLocation.getDirection();
			switch (direction) {
				case "NORTH":
					direction="WEST";
					break;
				case "SOUTH":
					direction="EAST";
					break;
				case "EAST":
					direction="NORTH";
					break;
				case "WEST":
					direction="SOUTH";
					break;
				default:
					break;
			}
			currentLocation.setDirection(direction);
		}
	}
	
	public void rotateRight() {
		if (Objects.nonNull(currentLocation)) {
			String direction = currentLocation.getDirection();
			switch (direction) {
				case "NORTH":
					direction="EAST";
					break;
				case "SOUTH":
					direction="WEST";
					break;
				case "EAST":
					direction="SOUTH";
					break;
				case "WEST":
					direction="NORTH";
					break;
				default:
					break;
			}
			currentLocation.setDirection(direction);
		}
	}
	
	public void report() {
		if (Objects.nonNull(currentLocation)) {
			System.out.println(currentLocation.toString());
		}else {
			System.out.println("Robot is not on the board : Please run PLACE Command \r\n");
		}
	}
}
