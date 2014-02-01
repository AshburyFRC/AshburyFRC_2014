package org.usfirst.frc4825.PlyBoy.commands;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc4825.PlyBoy.Robot;
import org.usfirst.frc4825.PlyBoy.subsystems.SolenoidSystem;



public class  Activatesolenoid extends Command {
    //Declaring Data
    boolean solenoidCommand = true;//For use without calling the meathod repetitively
    SolenoidSystem solenoidSystem = Robot.solenoidSystem;//So it can be called in a static context
    
    public Activatesolenoid() {
        requires(solenoidSystem);
    }
    // Called just before this Command runs the first time
    protected void initialize() {
        
    }
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        solenoidCommand = SmartDashboard.getBoolean("Solenoid Activation");//Getting boolean value from the smart dashboard
        //Determining the action to preform
        if(solenoidCommand == true){
            solenoidSystem.setSolenoidOn();
        }
        else{
            solenoidSystem.setSolenoidOff();
        }
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
