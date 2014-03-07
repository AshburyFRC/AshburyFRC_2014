/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc4825.FRC_2014.commands;
import edu.wpi.first.wpilibj.Timer;
import org.usfirst.frc4825.FRC_2014.Support.UserMessagePrinter;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4825.FRC_2014.Robot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author Isidor
 */
public class driveToDistance extends Command{
    
    //Vars
    private int distance;
    private boolean doneDriving;
    
    public driveToDistance() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        Robot.driveTrain.resetGyro();
        System.out.println("Initialized DriveToRange");
        distance = (int)(SmartDashboard.getNumber("Distance to stop at"));
        if(distance > 4000){
            distance = 4000;
            System.out.println("Max Range Exceded, using 4 meters instead");
        }
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        doneDriving = Robot.driveTrain.driveToRange(distance);
        Timer.delay(0.004);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return doneDriving;
    }

    // Called once after isFinished returns true
    protected void end() {
        Robot.driveTrain.stop();
        System.out.println("End DriveToRange");
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
        System.out.println("DriveForward interrupted");
    }
}
