
package info.ovhs.robotics;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;

public class Robot extends IterativeRobot {
	
	//two speed controllers are being used. one on each side
	
	//assigns a Jaguar speedcontroller to the left and right
	Jaguar leftMotor = new Jaguar(0);
	Jaguar rightMotor = new Jaguar(1);
	
	//creates new joystick objects to control the robot with a tank drive
	Joystick leftJoystick = new Joystick(0);
	Joystick rightJoystick = new Joystick(1);
	
	//creates new object to used drive methods
	RobotDrive testBotDrive = new RobotDrive(leftMotor, rightMotor);
	
    public void robotInit() {

    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        testBotDrive.tankDrive(leftJoystick, rightJoystick, true);
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
