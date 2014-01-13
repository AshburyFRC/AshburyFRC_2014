/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc4825.FRC_2014.Support;

/**
 *
 * @author mlepard
 */
public class RobotDriveType {
    public final int value;

    protected static final int ARCADE_DRIVE_VAL = 0;
    protected static final int TANK_DRIVE_VAL = 1;

    public static final RobotDriveType ARCADE_DRIVE = new RobotDriveType(ARCADE_DRIVE_VAL);
    public static final RobotDriveType TANK_DRIVE = new RobotDriveType(TANK_DRIVE_VAL);

    private RobotDriveType(int value){
        this.value = value;
    }    
}
