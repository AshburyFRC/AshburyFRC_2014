//Imports
package org.usfirst.frc4825.PlyBoy.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4825.PlyBoy.Robot;
import org.usfirst.frc4825.PlyBoy.subsystems.SolenoidSystem;

public class  ExtendSolenoid extends Command {

    SolenoidSystem solenoidSystem = Robot.solenoidSystem;//So it can be called in a static context
    
    public ExtendSolenoid() {
        requires(solenoidSystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        solenoidSystem.setSolenoidOn();
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
