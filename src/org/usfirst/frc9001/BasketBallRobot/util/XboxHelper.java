package org.usfirst.frc9001.BasketBallRobot.util;

import org.usfirst.frc9001.BasketBallRobot.Robot;

import edu.wpi.first.wpilibj.Joystick;

public class XboxHelper {
	private XboxHelper() {}
	
	private static Joystick xbox;
	
	public static final int
	A = 1,
	B = 2,
	X = 3,
	Y = 4,
	TRIGGER_LT = 5,
	TRIGGER_RT = 6,
	BACK = 7,
	START = 8,
	STICK_LEFT = 9,
	STICK_RIGHT = 10,
	
	AXIS_LEFT_Y = 1,
	AXIS_LEFT_X = 2,
	AXIS_RIGHT_Y = 3,
	AXIS_RIGHT_X = 4,
	AXIS_TRIGGER_LEFT = 5,
	AXIS_TRIGGER_RIGHT = 6;
	
	
	public static void init() {
		xbox = Robot.oi.xbox;
	}
	
	public static double getAxis(int axis) {
		return Math.abs(xbox.getRawAxis(axis)) > Constants.JOYSTICK_DEADZONE ? xbox.getRawAxis(axis) : 0;
	}
	
	public static boolean getButton(int button) {
		return xbox.getRawButton(button);
	}
	
	public static double getPOV() {
		return xbox.getPOV();
	}
	
}
