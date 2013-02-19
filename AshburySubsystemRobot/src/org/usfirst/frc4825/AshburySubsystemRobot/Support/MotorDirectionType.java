/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc4825.AshburySubsystemRobot.Support;

/**
 *
 * @author mlepard
 */
public class MotorDirectionType {
    public final int value;

    protected static final int FORWARD_DIRECTION_VAL = 0;
    protected static final int REVERSE_DIRECTION_VAL = 1;

    public static final MotorDirectionType FORWARD_DIRECTION = new MotorDirectionType(FORWARD_DIRECTION_VAL);
    public static final MotorDirectionType REVERSE_DIRECTION = new MotorDirectionType(REVERSE_DIRECTION_VAL);

    private MotorDirectionType(int value){
        this.value = value;
    }    
}
