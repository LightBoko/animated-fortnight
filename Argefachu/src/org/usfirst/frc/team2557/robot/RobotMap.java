package org.usfirst.frc.team2557.robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static SpeedController winch;
	public static SpeedController frontLeft;
	public static SpeedController backLeft;
	public static SpeedController frontRight;
	public static SpeedController backRight;
	public static RobotDrive robotDrive;
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	public static void init(){
		frontLeft = new Talon(0);
		backLeft = new Talon(1);
		frontRight = new Talon(2);
		backRight = new Talon(3);

		winch = new Talon(4);
		
		robotDrive = new RobotDrive(frontLeft, backLeft, frontRight, backRight);
		robotDrive.setSafetyEnabled(false);
	}
}
