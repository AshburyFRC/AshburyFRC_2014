// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// C++ from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
#include "RobotMap.h"
#include "LiveWindow/LiveWindow.h"
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=ALLOCATION
SpeedController* RobotMap::driveTrainLeftDriveMotor = NULL;
SpeedController* RobotMap::driveTrainRightDriveMotor = NULL;
RobotDrive* RobotMap::driveTrainRobotDrive21 = NULL;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=ALLOCATION
void RobotMap::init() {
	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
	LiveWindow* lw = LiveWindow::GetInstance();
	driveTrainLeftDriveMotor = new Victor(1, 1);
	lw->AddActuator("Drive Train", "Left Drive Motor", (Victor*) driveTrainLeftDriveMotor);
	
	driveTrainRightDriveMotor = new Victor(1, 2);
	lw->AddActuator("Drive Train", "Right Drive Motor", (Victor*) driveTrainRightDriveMotor);
	
	driveTrainRobotDrive21 = new RobotDrive(driveTrainLeftDriveMotor, driveTrainRightDriveMotor);
	
	driveTrainRobotDrive21->SetSafetyEnabled(true);
        driveTrainRobotDrive21->SetExpiration(0.1);
        driveTrainRobotDrive21->SetSensitivity(0.5);
        driveTrainRobotDrive21->SetMaxOutput(1.0);
        
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
}
