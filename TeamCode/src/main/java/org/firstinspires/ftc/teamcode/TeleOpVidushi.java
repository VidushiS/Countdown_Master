package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;


/**
 * Created by Vidushi on 5/4/2017.
 */
@TeleOp(name = "TeleOp", group = "Exercises")
public class TeleOpVidushi extends LinearOpMode {

    Servo       liftServo, doorServo;
    DcMotor     LeftMotor, RightMotor, LiftMotor1, LiftMotor2, IntakeMotor, ShooterMotor;

    @Override
    public void runOpMode() throws InterruptedException
    {
        liftServo = hardwareMap.servo.get("lift_servo");
        doorServo = hardwareMap.servo.get("door_servo");
        LeftMotor = hardwareMap.dcMotor.get("left_motor");
        RightMotor = hardwareMap.dcMotor.get("right_motor");
        LiftMotor1 = hardwareMap.dcMotor.get("lift_motor1");
        LiftMotor2 = hardwareMap.dcMotor.get("lift_motor2");
        IntakeMotor = hardwareMap.dcMotor.get("intake_motor");
        ShooterMotor = hardwareMap.dcMotor.get("shooter_motor");

    }


}
