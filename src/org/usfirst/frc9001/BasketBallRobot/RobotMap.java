// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc9001.BasketBallRobot;
    
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	/*
    public static CanTalonSRX driveTrainMotorLeftA;
    public static CanTalonSRX driveTrainMotorLeftB;
    public static CanTalonSRX driveTrainMotorRightA;
    public static CanTalonSRX driveTrainMotorRightB;
    public static CanTalonSRX launcherMotorLauncher;
    public static CanTalonSRX launcherMotorLoader;
    //*/
    
    //*
    public static CANTalon driveTrainMotorLeftA;
    public static CANTalon driveTrainMotorLeftB;
    public static CANTalon driveTrainMotorRightA;
    public static CANTalon driveTrainMotorRightB;
    public static CANTalon launcherMotorLauncher;
    public static CANTalon launcherMotorLoader;
    //*/
    
    public static RobotDrive driveTrainRobotDrive;
    

    public static void init() {
    	/*
        driveTrainMotorLeftA = new CanTalonSRX(3);
        driveTrainMotorLeftB = new CanTalonSRX(4);
        driveTrainMotorRightA = new CanTalonSRX(5);
        driveTrainMotorRightB = new CanTalonSRX(6);
        
        launcherMotorLauncher = new CanTalonSRX(7);
        launcherMotorLoader = new CanTalonSRX(8);
        //*/
    	
    	//*
    	driveTrainMotorLeftA = new CANTalon(3);
    	driveTrainMotorLeftB = new CANTalon(4);
    	driveTrainMotorRightA = new CANTalon(5);
    	driveTrainMotorRightB = new CANTalon(6);
    	
    	launcherMotorLauncher = new CANTalon(7);
    	launcherMotorLoader = new CANTalon(8);
    	//*/
        
        
        driveTrainRobotDrive = new RobotDrive((SpeedController) driveTrainMotorLeftA, (SpeedController) driveTrainMotorRightA);
//      Warning! This cast may not work!
        
        driveTrainRobotDrive.setSafetyEnabled(true);
        driveTrainRobotDrive.setExpiration(0.1);
        driveTrainRobotDrive.setSensitivity(0.5);
        driveTrainRobotDrive.setMaxOutput(1.0);
        
    }
}
