/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc4825.CompressorBot.subsystems;
import org.usfirst.frc4825.CompressorBot.RobotMap;
import org.usfirst.frc4825.CompressorBot.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
/**
 *
 * @author Isidor
 */
public class PlyBoyCompressor extends Compressor{
    public PlyBoyCompressor(int pressureSwitchSlot, int pressureSwitchChannel, int compresssorRelaySlot, int compressorRelayChannel)
    {
        super(pressureSwitchSlot, pressureSwitchChannel, compresssorRelaySlot, compressorRelayChannel);
    }
    
    public PlyBoyCompressor(int pressureSwitchChannel, int compressorRelayChannel)
    {
        super(pressureSwitchChannel, compressorRelayChannel);
    }
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void setRelayValue(Relay.Value relayValue) {
        if(relayValue == Relay.Value.kForward){
            System.out.println("Relay Value is kForward");
        }
        else if(relayValue == Relay.Value.kOn){
            System.out.println("Relay Value is kOn");
        }
        else if(relayValue == Relay.Value.kOff){
                System.out.println("Relay Value is kOff");
        }
        else{
            System.out.println("Relay Value is kReverse");
        }
        super.setRelayValue(relayValue);
                
    }
}
