// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
package org.usfirst.frc4825.AshburySubsystemRobot;
import org.usfirst.frc4825.AshburySubsystemRobot.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.*;
import edu.wpi.first.wpilibj.smartdashboard.*;
import org.usfirst.frc4825.AshburySubsystemRobot.Support.RobotDriveType;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton activateLauncherButton;
    public JoystickButton fireSingleFrisbeeButton;
    public Joystick joystick1;
    public JoystickButton activateConveyorBeltButton;
    public JoystickButton loadAndChamberButton;
    public Joystick joystick2;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        joystick2 = new Joystick(2);
        
        loadAndChamberButton = new JoystickButton(joystick2, 2);
        loadAndChamberButton.whenPressed(new LoadAndChamberFrisbee());
        activateConveyorBeltButton = new JoystickButton(joystick2, 1);
        activateConveyorBeltButton.whileHeld(new ContinuousBeltOn());
        joystick1 = new Joystick(1);
        
        fireSingleFrisbeeButton = new JoystickButton(joystick1, 2);
        fireSingleFrisbeeButton.whenPressed(new FireSingleFrisbee());
        activateLauncherButton = new JoystickButton(joystick1, 1);
        activateLauncherButton.whileHeld(new ContinuousLauncherOn());
	    
        // SmartDashboard Buttons
        SmartDashboard.putData("Test Left Motor", new TestLeftMotor());
        SmartDashboard.putData("Test Right Motor", new TestRightMotor());
        SmartDashboard.putData("Continuous Launcher On", new ContinuousLauncherOn());
        SmartDashboard.putData("Continuous Belt On", new ContinuousBeltOn());
        SmartDashboard.putData("Load Launcher", new LoadLauncher());
        SmartDashboard.putData("Fire Single Frisbee", new FireSingleFrisbee());
        SmartDashboard.putData("Load And Chamber Frisbee", new LoadAndChamberFrisbee());
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        
	SmartDashboard.putNumber("Test Left Motor Timeout", 1.0);
	SmartDashboard.putNumber("Test Right Motor Timeout", 2.0);
	SmartDashboard.putNumber("Test Left Motor Speed", 0.5);
	SmartDashboard.putNumber("Test Right Motor Speed", 0.5);
        
     	SmartDashboard.putNumber("Belt Motor Speed", 0.2);
     	SmartDashboard.putNumber("Launcher Front Motor Speed", 0.2);
     	SmartDashboard.putNumber("Launcher Back Motor Speed", 0.2);
     	SmartDashboard.putNumber("Launcher Spin Up Time", 0.5);
    }
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getJoystick1() {
        return joystick1;
    }
    public Joystick getJoystick2() {
        return joystick2;
    }
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}
