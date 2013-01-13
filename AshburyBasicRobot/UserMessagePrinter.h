//This static class will print strings to the User Message LCD on the driver station
//There are 6 lines on the driver station.

#include "DriverStationLCD.h"

class UserMessagePrinter
{
public:	
	static void PrintUserMessageLine1( const char * message )
	{
		printLCDMessage(1, message);
	};
	static void PrintUserMessageLine2( const char * message )
	{
		printLCDMessage(2, message);
	};
	static void PrintUserMessageLine3( const char * message )
	{
		printLCDMessage(3, message);
	};
	static void PrintUserMessageLine4( const char * message )
	{
		printLCDMessage(4, message);
	}
	static void PrintUserMessageLine5( const char * message )
	{
		printLCDMessage(5, message);
	}
	static void PrintUserMessageLine6( const char * message )
	{
		printLCDMessage(6, message);
	}
	
private:
	static void printLCDMessage( int line, const char * message )
	{
		DriverStationLCD* lcd = DriverStationLCD::GetInstance();
		if( lcd == NULL )
			return;
		
		DriverStationLCD::Line lineNumber;
		switch( line )
		{
		case 1:
			lineNumber = DriverStationLCD::kUser_Line1;
			break;
		case 2:
			lineNumber = DriverStationLCD::kUser_Line2;
			break;
		case 3:
			lineNumber = DriverStationLCD::kUser_Line3;
			break;
		case 4:
			lineNumber = DriverStationLCD::kUser_Line4;
			break;
		case 5:
			lineNumber = DriverStationLCD::kUser_Line5;
			break;
		case 6:
			lineNumber = DriverStationLCD::kUser_Line6;
			break;
		}
		lcd->PrintfLine(lineNumber, message);
		lcd->UpdateLCD();
	}
};
