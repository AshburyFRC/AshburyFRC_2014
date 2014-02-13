// Imports
package org.usfirst.frc4825.FRC_2014.subsystems;
import org.usfirst.frc4825.FRC_2014.RobotMap;
import org.usfirst.frc4825.FRC_2014.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.smartdashboard.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc4825.FRC_2014.Support.RobotDriveType;
public class DriveTrain extends Subsystem {
    SpeedController leftMotor1 = RobotMap.driveTrainLeftMotor1;
    SpeedController leftMotor2 = RobotMap.driveTrainLeftMotor2;
    SpeedController rightMotor1 = RobotMap.driveTrainRightMotor1;
    SpeedController rightMotor2 = RobotMap.driveTrainRightMotor2;
    RobotDrive robotDrive41 = RobotMap.driveTrainRobotDrive41;
    SendableChooser robotDriveChooser = null;
    private final double MOTOR_SMOOTHING_OMEGA = 1.0;
    private final double DRIFT = 0.0;
    private double speed;
    
    public DriveTrain() {
        robotDriveChooser = new SendableChooser();
        robotDriveChooser.addDefault("Tank Drive", RobotDriveType.TANK_DRIVE);
        robotDriveChooser.addObject("Arcade Drive", RobotDriveType.ARCADE_DRIVE);
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
            /**/
            robotDrive41.tankDrive(-MOTOR_SMOOTHING_OMEGA * stick1.getAxis(Joystick.AxisType.kY),
                    -MOTOR_SMOOTHING_OMEGA * stick1.getRawAxis(5), true);/**/
            /*this one need only if you want to drive with 2 joysticks (old way)
             ,                                               ^
             then you need to remove the one that on the top |
             robotDrive41.tankDrive(-motorSmoothingOmega * stick1.getAxis(Joystick.AxisType.kY),
             -motorSmoothingOmega * stick2.getAxis(Joystick.AxisType.kY), true);*/
        } else if (driveType == RobotDriveType.ARCADE_DRIVE) {
            robotDrive41.arcadeDrive(-MOTOR_SMOOTHING_OMEGA * stick1.getAxis(Joystick.AxisType.kY),
                    -MOTOR_SMOOTHING_OMEGA * stick1.getRawAxis(4), true);
        }
    }
    public void stop() {
        robotDrive41.drive(0.0, 0.0);
    }
    
    public void setMotorOutputs(double leftOutput, double rightOutput) {
        robotDrive41.setLeftRightMotorOutputs(leftOutput, rightOutput);
    }
    
    public void DriveForward() {
        double angle = RobotMap.gyro.getAngle(); // get current heading
        System.out.println(angle);
        robotDrive41.drive(speed, DRIFT+angle*0.03); // drive towards heading 0
        Timer.delay(0.004);
    }
    
    public void DriveBackward() {
        speed = -speed;//sets speed to the negative to work with the drive train
        double angle = RobotMap.gyro.getAngle(); // get current heading
        System.out.println(angle);
        robotDrive41.drive(speed, DRIFT+angle*0.03); // drive towards heading 0
        Timer.delay(0.004);
    }
}
