/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc4825.AshburySubsystemRobot;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author Macy
 */

public class Robot_InstanceField 
{  
    static double ConveyorBelt = 0.15;
    public static double getBeltValue()
    {
        return SmartDashboard.getNumber("Belt Motor Speed");
    }
    
    public static double getMotor1Value()
    {
        return SmartDashboard.getNumber("Launcher Motor 1 Speed");
    }
    
    public static double getMotor2Value()
    {
        return SmartDashboard.getNumber("Launcher Motor 2 Speed");
    }    

}
