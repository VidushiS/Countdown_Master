package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

/**
 * Created by Vidushi on 5/16/2017.
 */
@Autonomous(name = "AutoBallPickup", group = "Exercises")
public class AutoBallPickup extends LinearOpMode{

    DcMotor leftMotor, rightMotor, intakeMotor;

    public void runOpMode() throws InterruptedException
    {
        leftMotor = hardwareMap.dcMotor.get("left_motor");
        rightMotor = hardwareMap.dcMotor.get("right_motor");
        intakeMotor = hardwareMap.dcMotor.get("intake_motor");
        rightMotor.setDirection(DcMotor.Direction.REVERSE);

        telemetry.addData("Mode", "waiting");
        telemetry.update();

        waitForStart();

        telemetry.addData("Mode", "active");
        telemetry.update();

        sleep(500);


            leftMotor.setPower(-.5);
            rightMotor.setPower(-.5);

            sleep(1250);

            leftMotor.setPower(.25);
            rightMotor.setPower(-.25);
            sleep(1800);

            leftMotor.setPower(-.5);
            rightMotor.setPower(-.5);
            sleep(500);

            leftMotor.setPower(0);
            rightMotor.setPower(0);

            intakeMotor.setPower(-.25);
            sleep(2000);

            intakeMotor.setPower(0);



      /*  leftMotor.setPower(0);
        rightMotor.setPower(0);

        leftMotor.setPower(-.25);
        rightMotor.setPower(-.25);
        sleep(900);

        leftMotor.setPower(0);
        rightMotor.setPower(0);
        intakeMotor.setPower(-.25);
        sleep(1000);

        intakeMotor.setPower(0);
        rightMotor.setPower(-.25);
        leftMotor.setPower(-.25);

        sleep(2000);
        leftMotor.setPower(0);
        rightMotor.setPower(0);
        intakeMotor.setPower(.25);
        sleep(2000);

        intakeMotor.setPower(0);*/


    }
}
