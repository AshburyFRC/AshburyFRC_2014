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
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class TestAutoCommand extends CommandGroup {
    
    public  TestAutoCommand() {
        addSequential(new TurnOnLauncher());
        addSequential(new LoadAndChamberFrisbee());
        addSequential(new DelayCommand(1.0));
        addSequential(new LoadAndChamberFrisbee());
        addSequential(new DelayCommand(1.0));
        addSequential(new LoadAndChamberFrisbee());
        addSequential(new TurnOffLauncher());        
    }
}
