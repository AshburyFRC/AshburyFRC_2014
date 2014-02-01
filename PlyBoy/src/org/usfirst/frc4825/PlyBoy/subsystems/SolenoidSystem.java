//Imports
package org.usfirst.frc4825.PlyBoy.subsystems;
import org.usfirst.frc4825.PlyBoy.RobotMap;
import org.usfirst.frc4825.PlyBoy.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;


public class SolenoidSystem extends Subsystem {
    
    //Making the solenoid
    public Solenoid solenoid1 = RobotMap.solenoidSystemSolenoid1;
    
    //Default Command
    public void initDefaultCommand() {
        setDefaultCommand(new Activatesolenoid());
    }
    
    //Getter Method
    public boolean getSolenoidValue(){
        return solenoid1.get();
    }
    
    //Setter Methods
    public void setSolenoidOn(){
        solenoid1.set(true);
        System.out.println("Piston Extended");
    }
    
    public void setSolenoidOff(){
        solenoid1.set(false);
        System.out.println("Piston Retraacted");
    }
    
}

