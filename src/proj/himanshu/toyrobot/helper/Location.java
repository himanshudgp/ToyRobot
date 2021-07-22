package proj.himanshu.toyrobot.helper;

public class Location {
	
	private int x,y;
	private String direction=null;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public Location(int x, int y, String direction) {
		super();
		this.x = x;
		this.y = y;
		this.direction = direction;
	}
	@Override
	public String toString() {
		return "Output: " + x + "," + y + "," + direction + "";
	}
	
	
}
