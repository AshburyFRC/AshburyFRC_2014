/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc4825.FRC_2014.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4825.FRC_2014.Robot;
import org.usfirst.frc4825.FRC_2014.RobotMap;

/**
 *
 * @author Slava
 */
public class switchTest extends Command {
    
    public switchTest() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        System.out.println("Latch Switch: " +RobotMap.hammerHammerLatchSwitch.get() + "; Reset Switch " + RobotMap.hammerShaftResetSwitch.get());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
