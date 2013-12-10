// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
package org.usfirst.frc4825.PlyBoy;
import edu.wpi.first.wpilibj.*;
    
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
    public static Servo servoSubsystem1Servo1;
    public static Compressor compressorSubsystem1Compressor1;
    public static AnalogChannel rangeFinderUltrasonicSensor1;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        servoSubsystem1Servo1 = new Servo(1, 1);
	LiveWindow.addActuator("ServoSubsystem 1", "Servo 1", servoSubsystem1Servo1);
        
        compressorSubsystem1Compressor1 = new Compressor(1, 1, 1, 1);
	
        
        rangeFinderUltrasonicSensor1 = new AnalogChannel(1, 1);
	LiveWindow.addSensor("RangeFinder", "UltrasonicSensor1", rangeFinderUltrasonicSensor1);
        
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
