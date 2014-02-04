//Imports
package org.usfirst.frc4825.FRC_2014.subsystems;
import org.usfirst.frc4825.FRC_2014.RobotMap;
import org.usfirst.frc4825.FRC_2014.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc4825.FRC_2014.Support.ArmPos;
public class Arms extends Subsystem {
    
    //Declaring objects
    SpeedController leftArmBeltMotorController = RobotMap.armsLeftArmBeltMotorController;
    SpeedController rightArmBeltMotorController = RobotMap.armsRightArmBeltMotorController;
    Solenoid armPositionSolenoid = RobotMap.armsArmPositionSolenoid;
    
    public void initDefaultCommand() {
    
    }
    
    //Sets arm position
    public void moveArm(ArmPos armPosToSet){
        /*if(ArmPos.value == ArmPos.UP){
            armPositionSolenoid.set(false);
        }
        else{
            armPositionSolenoid.set(true);
        }*/
        
    }
    
    //Sets motor speed
    public void setMotorSpeed(){
        
    }
    
    //Returns Arm Position
    public ArmPos getArmPos(){
        return ArmPos.DOWN;
    }
    
    //Returns true if arm is up
    public boolean isArmUp(){
        return false;
    }
    
    //Gives Motor Speed
    public double getMotorSpeed(){
        return 0.5;
    }
}
