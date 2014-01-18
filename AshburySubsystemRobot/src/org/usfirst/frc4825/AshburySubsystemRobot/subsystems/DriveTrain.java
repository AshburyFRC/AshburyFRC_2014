// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
package org.usfirst.frc4825.AshburySubsystemRobot.subsystems;

import org.usfirst.frc4825.AshburySubsystemRobot.RobotMap;
import org.usfirst.frc4825.AshburySubsystemRobot.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.smartdashboard.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc4825.AshburySubsystemRobot.Support.RobotDriveType;

/**
 *
 */
public class DriveTrain extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController leftDriveMotor = RobotMap.driveTrainLeftDriveMotor;
    SpeedController rightDriveMotor = RobotMap.driveTrainRightDriveMotor;
    RobotDrive robotDrive21 = RobotMap.driveTrainRobotDrive21;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    SendableChooser robotDriveChooser = null;

    public DriveTrain() {
        robotDriveChooser = new SendableChooser();
        robotDriveChooser.addDefault("Drive With Two Joysticks", RobotDriveType.TANK_DRIVE);
        robotDriveChooser.addObject("Drive With XBox Controller", RobotDriveType.ARCADE_DRIVE);
        SmartDashboard.putData("Robot Drive Type", robotDriveChooser);
    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new DriveWithJoysticks());
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

    public void processJoysticksInput(Joystick stick1, Joystick stick2) {

        RobotDriveType driveType = (RobotDriveType) robotDriveChooser.getSelected();

        if (driveType == RobotDriveType.TANK_DRIVE) {
            robotDrive21.tankDrive(stick1.getAxis(Joystick.AxisType.kY),
                    stick2.getAxis(Joystick.AxisType.kY), true);
        } else if (driveType == RobotDriveType.ARCADE_DRIVE) {
            SmartDashboard.putNumber("Left Trigger", stick1.getAxis(Joystick.AxisType.kY));
            SmartDashboard.putNumber("Right Ttrigger", stick1.getRawAxis(5));
            robotDrive21.tankDrive(stick1.getRawAxis(5),
                    stick1.getAxis(Joystick.AxisType.kY), true);
        }
    }

    public void stop() {
        robotDrive21.drive(0.0, 0.0);
    }

    public void setMotorOutputs(double leftOutput, double rightOutput) {
        robotDrive21.setLeftRightMotorOutputs(leftOutput, rightOutput);
    }

    public void driveForward() {
        robotDrive21.drive(-0.3, 0.0);
    }

    public void driveBackward() {
        robotDrive21.drive(0.3, 0.0);
    }

}
