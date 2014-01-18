// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
package org.usfirst.frc4825.AshburySubsystemRobot.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4825.AshburySubsystemRobot.Robot;
import org.usfirst.frc4825.AshburySubsystemRobot.Support.UserMessagePrinter;
/**
 *
 */
public class  DriveWithJoysticks extends Command {
    public DriveWithJoysticks() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
	
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.driveTrain);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }
    // Called just before this Command runs the first time
    protected void initialize() {
	UserMessagePrinter.printUserMessageLine1("Running Drive With Joystick Command"); 
        
        System.out.println("initilize drive with joysticks");                
        
    }
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
       Robot.driveTrain.processJoysticksInput( Robot.oi.getJoystick1(),
                                                           Robot.oi.getJoystick2());
    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }
    // Called once after isFinished returns true
    protected void end() {
        Robot.driveTrain.stop();
	UserMessagePrinter.printUserMessageLine1("");   
        
        System.out.println("end drive with joysticks");                
        
    }
    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
