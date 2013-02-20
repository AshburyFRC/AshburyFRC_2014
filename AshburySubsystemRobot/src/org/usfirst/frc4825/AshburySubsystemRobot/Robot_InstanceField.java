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
        return SmartDashboard.getNumber("Launcher Front Motor Speed");
    }
    
    public static double getMotor2Value()
    {
        return SmartDashboard.getNumber("Launcher Back Motor Speed");
    }
    
    public static double getLauncherSpinUpTime()
    {
        return SmartDashboard.getNumber("Launcher Spin Up Time");        
    }
    
    public static double getLauncherSpinUpPercent()
    {
        return SmartDashboard.getNumber("Launcher Spin Up Percent");        
    }
    
    public static double getAutoLoadDelay()
    {
        return SmartDashboard.getNumber("Auto Load Delay");        
    }
    
        
}
