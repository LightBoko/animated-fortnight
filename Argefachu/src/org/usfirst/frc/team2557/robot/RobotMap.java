package org.usfirst.frc.team2557.robot;

import edu.wpi.first.wpilibj.*;



/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	//CANTalons = Motors
	//Counter = Encoders
	//DoubleSolenoid = Pneumatic Pistons
	public static CANTalon winch;
	public static CANTalon frontLeft;
	public static CANTalon backLeft;
	public static CANTalon frontRight;
	public static CANTalon backRight;
	public static CANTalon intakeMotor;
	public static RobotDrive robotDrive;
	public static DoubleSolenoid intakeArm;
	public static DoubleSolenoid winchLock;
	public static DoubleSolenoid superShifter;
	public static Counter encoderLeftDrive;
	public static Counter encoderRightDrive;
	public static Counter encoderWinch;
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	public static void init(){
		//Drive Train:
		frontLeft = new CANTalon(0);
		backLeft = new CANTalon(1);
		frontRight = new CANTalon(2);
		backRight = new CANTalon(3);
		//Winch:
		winch = new CANTalon(5);
		winchLock = new DoubleSolenoid(0,0,1);
		//Intake:
		intakeMotor = new CANTalon(4);
		intakeArm = new DoubleSolenoid(0,2,3);
		//Supershifter:
		superShifter = new DoubleSolenoid(0,4,5);
		
		robotDrive = new RobotDrive(frontLeft, backLeft, frontRight, backRight);
		robotDrive.setSafetyEnabled(false);
	}
}
