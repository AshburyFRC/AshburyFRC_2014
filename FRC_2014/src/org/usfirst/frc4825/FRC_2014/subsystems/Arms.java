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
    ArmPos currentArmPos = ArmPos.UP;
            
    public void initDefaultCommand() {
    
    }
    
    //Sets arm position
    public void moveArm(ArmPos armPosToSet){
        if(armPosToSet == currentArmPos){
            System.out.println("Error : Arm Already At Position");
        }
        else if(armPosToSet == ArmPos.UP){
            armPositionSolenoid.set(true);
            currentArmPos = ArmPos.UP;
        }
        else if(armPosToSet == ArmPos.DOWN){
            armPositionSolenoid.set(false);
            currentArmPos = ArmPos.DOWN;
        }
        else{
            System.out.println("Unknown Error In moveArm()");
        }
        
    }
    
    //Sets motor speed
    public void setMotorSpeed(double motorSpeedToSet){
        //if(motorSpeedToSet == )
    }
    
    //Returns Arm Position
    public ArmPos getArmPos(){
        return ArmPos.DOWN;
    }
    
    //Returns true if arm is up
    public boolean isArmUp(){
        return false;
    }
    
    public boolean isArmDown(){
        return false;
    }
    
    //Gives Motor Speed
    public double getMotorSpeed(){
        return 0.5;
    }
}
