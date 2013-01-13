#include "WPILib.h"
#include "Jaguar.h"
#include "LiveWindow/LiveWindow.h"
#include "RobotDefs.h"
#include "UserMessagePrinter.h"

/**
 * This is a demo program showing the use of the RobotBase class.
 * The SimpleRobot class is the base of a robot application that will automatically call your
 * Autonomous and OperatorControl methods at the right time as controlled by the switches on
 * the driver station or the field controls.
 */ 
class RobotDemo : public SimpleRobot
{
	RobotDrive myRobot; // robot drive system
	Joystick stick; // only joystick
	LiveWindow* livewindow;
	DriverStationLCD* lcd;

public:
	RobotDemo(void):
		myRobot(LEFT_DRIVE_MOTOR, RIGHT_DRIVE_MOTOR),	// these must be initialized in the same order
		stick(1),		// as they are declared above.
		livewindow(NULL)
	{
		myRobot.SetExpiration(0.1);
		livewindow = LiveWindow::GetInstance();
	}

	/**
	 * Drive left & right motors for 2 seconds then stop
	 */
	void Autonomous(void)
	{
		UserMessagePrinter::PrintUserMessageLine1("Entering Automode");
		myRobot.SetSafetyEnabled(false);
		myRobot.Drive(-0.5, 0.0); 	// drive forwards half speed
		Wait(2.0); 				//    for 2 seconds
		myRobot.Drive(0.0, 0.0); 	// stop robot
	}

	/**
	 * Runs the motors with arcade steering. 
	 */
	void OperatorControl(void)
	{
		myRobot.SetSafetyEnabled(true);
		while (IsOperatorControl())
		{
			myRobot.ArcadeDrive(stick); // drive with arcade style (use right stick)
			Wait(0.005);				// wait for a motor update time
		}
	}
	
	/**
	 * Runs during test mode
	 */
	void Test() 
	{
		UserMessagePrinter::PrintUserMessageLine1("in Test()");
		
		if(!livewindow)
		{
			livewindow = LiveWindow::GetInstance();
		}
		
		if(!livewindow)
		{
			//shouldn't happen, 
			return;
		}
		
		while(IsTest()& IsEnabled())
		{
			livewindow->Run();
			Wait(0.1);
		}
	}
	
	void RobotInit()
	{
		UserMessagePrinter::PrintUserMessageLine1("calling Robot Init");
		printf("calling Robot Init");

		Jaguar* leftMotor = new Jaguar(1);
		Jaguar* rightMotor = new Jaguar(2);
		livewindow->AddActuator("Drive train", "left motor" , leftMotor);
		livewindow->AddActuator("Drive train", "right motor" , rightMotor);

	}
};

START_ROBOT_CLASS(RobotDemo);

