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
import org.usfirst.frc4825.AshburySubsystemRobot.Robot_InstanceField;
/**
 *
 */
public class  ContinuousBeltOn extends Command {
    public ContinuousBeltOn() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
	
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.conveyorBelt);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }
    // Called just before this Command runs the first time
    protected void initialize() 
    {
      if( Robot.conveyorBelt.beltMotorOn() == false )
      {
            double motorSpeed =  Robot_InstanceField.getBeltValue();
            Robot.conveyorBelt.turnOnBelt(motorSpeed);
            System.out.println("Belt Motor is On " + motorSpeed);
      }
    }
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }
    // Called once after isFinished returns true
    protected void end() {
        if(Robot.conveyorBelt.beltMotorOn()==true)
        {
            Robot.conveyorBelt.turnOffBelt();
            System.out.println("Belt Motor is Off");
        }
    }
    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
