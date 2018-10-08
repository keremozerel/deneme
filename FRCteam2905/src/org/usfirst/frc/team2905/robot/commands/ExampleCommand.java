/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2905.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.interfaces.*;
import org.usfirst.frc.team2905.robot.Robot;
import edu.wpi.first.wpilibj.buttons.*;
import edu.wpi.first.wpilibj.can.*;
import edu.wpi.first.wpilibj.command.*;
import edu.wpi.first.wpilibj.communication.*;
import edu.wpi.first.wpilibj.drive.*;
import edu.wpi.first.wpilibj.filters.*;
import edu.wpi.first.wpilibj.hal.*;
import edu.wpi.first.wpilibj.internal.*;
import edu.wpi.first.wpilibj.livewindow.*;
import edu.wpi.first.wpilibj.networktables.*;
import edu.wpi.first.wpilibj.smartdashboard.*;
import edu.wpi.first.wpilibj.tables.*;
/**
 * An example command.  You can replace me with your own command.
 */
public class ExampleCommand extends Command {
	public ExampleCommand() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.m_subsystem);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}
