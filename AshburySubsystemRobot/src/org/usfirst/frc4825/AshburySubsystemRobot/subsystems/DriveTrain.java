package org.usfirst.frc4825.AshburySubsystemRobot.subsystems;

import org.usfirst.frc4825.AshburySubsystemRobot.RobotMap;
import org.usfirst.frc4825.AshburySubsystemRobot.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.smartdashboard.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc4825.AshburySubsystemRobot.Support.RobotDriveType;

public class DriveTrain extends Subsystem {

    Gyro gyro = new Gyro(1);
    SpeedController leftDriveMotor = RobotMap.driveTrainLeftDriveMotor;
    SpeedController rightDriveMotor = RobotMap.driveTrainRightDriveMotor;
    RobotDrive robotDrive21 = RobotMap.driveTrainRobotDrive21;

    SendableChooser robotDriveChooser = null;
    private final double drift = -0.1;
    public DriveTrain() {
        robotDriveChooser = new SendableChooser();
        robotDriveChooser.addDefault("Drive With Two Joysticks", RobotDriveType.TANK_DRIVE);
        robotDriveChooser.addObject("Drive With XBox Controller", RobotDriveType.ARCADE_DRIVE);
        SmartDashboard.putData("Robot Drive Type", robotDriveChooser);
    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
        setDefaultCommand(new DriveWithJoysticks());
    
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
            //robotDrive21.tankDrive(stick1.getRawAxis(5),
            //        stick1.getAxis(Joystick.AxisType.kY), true);
            if(stick1.getAxis(Joystick.AxisType.kY)>0.5){
                robotDrive21.arcadeDrive(0.5, -stick1.getRawAxis(4), true);
            }
            else{
                robotDrive21.arcadeDrive(stick1.getAxis(Joystick.AxisType.kY), -stick1.getRawAxis(4), true);
            }
        }
    }

    public void stop() {
        robotDrive21.drive(0.0, 0.0);
    }

    public void setMotorOutputs(double leftOutput, double rightOutput) {
        robotDrive21.setLeftRightMotorOutputs(leftOutput, rightOutput);
    }

    public void driveForward(){
        double angle = gyro.getAngle(); // get current heading
        System.out.println(angle);
        robotDrive21.drive(-1, drift+angle*0.03); // drive towards heading 0
        Timer.delay(0.004);
    }
    public void resetGyro(){
        gyro.reset();
    }

    public void driveBackward() {
        //Put stuff here
    }
}