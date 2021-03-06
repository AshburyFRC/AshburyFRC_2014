/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc4825.FRC_2014.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc4825.FRC_2014.Robot;

/**
 *
 * @author Slava
 */
public class ToggleTheLatch extends Command {
    
    public ToggleTheLatch() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        if (Robot.hammer.isLatchReady()){
        Robot.hammer.releaseLatch();
        SmartDashboard.putBoolean("Hammer in Latch", false);
        }
        else{
            Robot.hammer.readyLatch();
            SmartDashboard.putBoolean("Hammer in Latch", true);
        }
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
