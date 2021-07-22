package test.toyrobot.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import proj.himanshu.toyrobot.util.ToyRobotUtil;

public class TestToyRobotUtil {

	@Test
	public void testGoodPlaceCommand() {
		String input = "place 0,0,North";
		assertTrue(ToyRobotUtil.isPlaceCommandPatternComplete(input));
	}
	
	@Test
	public void testGoodPlaceCommandStartingWithSpace() {
		String input = "  place 0,0,North";
		assertTrue(ToyRobotUtil.isPlaceCommandPatternComplete(input));
	}
	
	@Test
	public void testBadPlaceCommand() {
		String input = "place 0,0,test";
		assertTrue(ToyRobotUtil.isPlaceCommandPatternComplete(input));
	}
	
	@Test
	public void testIncompleteCommand() {
		String input = "place 0,0";
		assertFalse(ToyRobotUtil.isPlaceCommandPatternComplete(input));
	}
	
	@Test
	public void testBadPlacement() {
		String input = "PLACE 7,0,WEST";
		assertFalse(ToyRobotUtil.isPlaceCommandPatternComplete(input));
	}
	
	@Test
	public void testGoodPlacement() {
		String input = "PLACE 4,0,west";
		assertTrue(ToyRobotUtil.isPlaceCommandPatternComplete(input));
	}
	
	@Test
	public void testGoodCommand() {
		String input = "PLACE 0,1,EAST";
		assertEquals("PLACE",ToyRobotUtil.getCommand(input));
	}
	
	@Test
	public void badCommand() {
		String input = "TEST";
		assertNull(ToyRobotUtil.getCommand(input));
	}
}
