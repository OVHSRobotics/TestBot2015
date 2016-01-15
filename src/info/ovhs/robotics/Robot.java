
package info.ovhs.robotics;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;

public class Robot extends IterativeRobot {
	
	//two speed controllers are being used. one on each side
	
	//assigns a Jaguar speedcontroller to the left and right for driving
	Jaguar leftMotor = new Jaguar(0);
	Jaguar rightMotor = new Jaguar(1);
	
	//assigns a Victor speedcontroller for shooting
	Victor leftShooter = new Victor(3);
	Victor rightShooter = new Victor(2);
	
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
        if (leftJoystick.getRawButton(1))
        {
        	leftShooter.set(1);
        	rightShooter.set(-1);
        }
        else
        {
        	leftShooter.set(0);
        	rightShooter.set(0);
        }
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
