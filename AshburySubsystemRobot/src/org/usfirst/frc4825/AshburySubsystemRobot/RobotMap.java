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

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.camera.AxisCamera;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainLeftDriveMotor;
    public static SpeedController driveTrainRightDriveMotor;
    public static RobotDrive driveTrainRobotDrive21;
    public static SpeedController launcherLauncherMotor1;
    public static SpeedController launcherLauncherMotor2;
    public static SpeedController conveyorBeltBeltMotor;
    public static DigitalInput conveyorBeltFrisbyLoadedSwitch;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static AxisCamera camera;
    public static Gyro gyro;
    public static Ultrasonic ultrasonic; 

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainLeftDriveMotor = new Victor(1, 1);
        LiveWindow.addActuator("Drive Train", "Left Drive Motor", (Victor) driveTrainLeftDriveMotor);

        driveTrainRightDriveMotor = new Victor(1, 2);
        LiveWindow.addActuator("Drive Train", "Right Drive Motor", (Victor) driveTrainRightDriveMotor);

        driveTrainRobotDrive21 = new RobotDrive(driveTrainLeftDriveMotor, driveTrainRightDriveMotor);

        driveTrainRobotDrive21.setSafetyEnabled(true);
        driveTrainRobotDrive21.setExpiration(0.1);
        driveTrainRobotDrive21.setSensitivity(0.5);
        driveTrainRobotDrive21.setMaxOutput(1.0);

        launcherLauncherMotor1 = new Jaguar(1, 5);
        LiveWindow.addActuator("Launcher", "Launcher Motor 1", (Jaguar) launcherLauncherMotor1);

        launcherLauncherMotor2 = new Victor(1, 3);
        LiveWindow.addActuator("Launcher", "Launcher Motor 2", (Victor) launcherLauncherMotor2);

        conveyorBeltBeltMotor = new Jaguar(1, 4);
        LiveWindow.addActuator("Conveyor Belt", "Belt Motor", (Jaguar) conveyorBeltBeltMotor);

        conveyorBeltFrisbyLoadedSwitch = new DigitalInput(1, 14);
        LiveWindow.addSensor("Conveyor Belt", "FrisbyLoadedSwitch", conveyorBeltFrisbyLoadedSwitch);

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        
        camera = AxisCamera.getInstance("10.48.25.9");  // get an instance of the camera
        
        gyro = new Gyro(1);
        ultrasonic = new Ultrasonic(2, 1);
        ultrasonic.setEnabled(true);
        ultrasonic.setAutomaticMode(true);
    }
}
