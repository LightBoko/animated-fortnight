package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class IntakeSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void intake(){
    	RobotMap.intakeMotor.set(1);
    }
    public void outtake(){
    	RobotMap.intakeMotor.set(-1);
    }
    public void stop(){
    	RobotMap.intakeMotor.set(0);
    }
}

