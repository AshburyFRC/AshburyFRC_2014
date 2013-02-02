/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc4825.AshburySubsystemRobot.Support;

import edu.wpi.first.wpilibj.DriverStationLCD;

/**
 *
 * @author mlepard
 */
public class UserMessagePrinter {
    
    public static void printUserMessageLine1( String message ) {
        printLCDMessage(1, message);
    }

    public static void printUserMessageLine2( String message ) {
        printLCDMessage(2, message);
    }

    public static void printUserMessageLine3( String message ) {
        printLCDMessage(3, message);
    }

    public static void printUserMessageLine4( String message ) {
        printLCDMessage(4, message);
    }

    public static void printUserMessageLine5( String message ) {
        printLCDMessage(5, message);
    }
    
    private static void printLCDMessage( int line, String message ) {
        
        String fixedString = "";
        if( message.length() > 20 )
        {
            fixedString = message.substring(0, 19);
        }
        else
        {
            fixedString = message;
        }
        
        DriverStationLCD.Line lineNumber = null;
        switch( line )
        {
            case 1:
                lineNumber = DriverStationLCD.Line.kUser1;
                break;
            case 2:
                lineNumber = DriverStationLCD.Line.kUser2;
                break;
            case 3:
                lineNumber = DriverStationLCD.Line.kUser3;
                break;
            case 4:
                lineNumber = DriverStationLCD.Line.kUser4;
                break;
            case 5:
                lineNumber = DriverStationLCD.Line.kUser5;
                break;
        }
        DriverStationLCD.getInstance().println(lineNumber, 1, fixedString);
        DriverStationLCD.getInstance().updateLCD();
    }
}
