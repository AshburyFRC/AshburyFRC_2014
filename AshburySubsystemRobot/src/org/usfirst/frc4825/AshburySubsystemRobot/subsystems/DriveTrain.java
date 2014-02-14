package org.usfirst.frc4825.AshburySubsystemRobot.subsystems;

import org.usfirst.frc4825.AshburySubsystemRobot.RobotMap;
import org.usfirst.frc4825.AshburySubsystemRobot.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.smartdashboard.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc4825.AshburySubsystemRobot.Support.RobotDriveType;

public class DriveTrain extends Subsystem {
    Encoder renc = new Encoder(4,5,false);
    
    AnalogPotentiometer ultra = new AnalogPotentiometer(2, 5120/5.0);/*(echo pulse output, trigger pulse input)*/

    SpeedController leftDriveMotor = RobotMap.driveTrainLeftDriveMotor;
    SpeedController rightDriveMotor = RobotMap.driveTrainRightDriveMotor;
    RobotDrive robotDrive21 = RobotMap.driveTrainRobotDrive21;

    SendableChooser robotDriveChooser = null;
    private final double DRIFT = -0.1;
    private double speed = 0.0;
    

    public DriveTrain() {
        renc.start();
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
        int range = renc.get();

        RobotDriveType driveType = (RobotDriveType) robotDriveChooser.getSelected();
        
        if (driveType == RobotDriveType.TANK_DRIVE) {
            robotDrive21.tankDrive(stick1.getAxis(Joystick.AxisType.kY),
                    stick2.getAxis(Joystick.AxisType.kY), true);
        } else if (driveType == RobotDriveType.ARCADE_DRIVE) {
            System.out.println(stick1.getAxis(Joystick.AxisType.kY));
            SmartDashboard.putNumber("Left Trigger", stick1.getAxis(Joystick.AxisType.kY));
            SmartDashboard.putNumber("Right Ttrigger", stick1.getRawAxis(5));
            //robotDrive21.tankDrive(stick1.getRawAxis(5),
            //        stick1.getAxis(Joystick.AxisType.kY), true);
            robotDrive21.arcadeDrive(stick1.getAxis(Joystick.AxisType.kY), -stick1.getRawAxis(4), true);
        } else {
            System.out.println("AHHHH! No drive found! 12242334");
        }
    }

    public void stop() {
        robotDrive21.drive(0.0, 0.0);
    }

    public void setMotorOutputs(double leftOutput, double rightOutput) {
        robotDrive21.setLeftRightMotorOutputs(leftOutput, rightOutput);
    }

<<<<<<< .mine
    public void driveForward() {
        double range = ultra.get();
        SmartDashboard.putNumber("Range in mm:", range);
        System.out.println("Ultra: "+range);
        if (range > 500) {
            double angle = gyro.getAngle(); // get current heading
            System.out.println(angle);
            robotDrive21.drive(-1, drift + angle * 0.03); // drive towards heading 0
            Timer.delay(0.004);
        }
        else
        {
            robotDrive21.drive(0.0, 0.0);
        }
=======
    public void driveForward(){
        speed = -speed;//sets speed to the negative to work with the drive train
        double angle = RobotMap.gyro.getAngle(); // get current heading
        System.out.println(angle);
        robotDrive21.drive(speed, DRIFT+angle*0.03); // drive towards heading 0
        Timer.delay(0.004);
>>>>>>> .r150
    }

    public void resetGyro() {
        RobotMap.gyro.reset();
    }

    public void driveBackward() {
        double angle = RobotMap.gyro.getAngle(); // get current heading
        System.out.println(angle);
        robotDrive21.drive(speed, DRIFT+angle*0.03); // drive towards heading 0
        Timer.delay(0.004);
    }
<<<<<<< .mine
}
=======
    
    public void setSpeed(double speedImput){
        speed = speedImput;
    }
}>>>>>>> .r150
