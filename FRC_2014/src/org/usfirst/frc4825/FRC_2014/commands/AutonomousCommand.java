// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package org.usfirst.frc4825.FRC_2014.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc4825.FRC_2014.Robot;

/**
 *
 */
public class AutonomousCommand extends CommandGroup {

    public AutonomousCommand() {
        // Use requires() heres to declare subsystem dependencies
        // eg. requires(chassis);
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.driveTrain);
        
        addSequential(new lowerArm());
        addSequential(new Wait(1.0));
        addParallel(new driveForwardWithoutSensors());
        addSequential(new readyHammer());        
        addSequential(new releaseLatch());
        addSequential(new Wait(1.0));
        addSequential(new driveForwardWithoutSensors2());
    }
}