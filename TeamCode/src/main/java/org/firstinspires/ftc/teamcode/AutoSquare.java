package org.firstinspires.ftc.teamcode;

import  com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import  com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import  com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

/**
 * Created by Vidushi on 4/27/2017.
 */
@Autonomous(name= "AutoSquare", group= "Exercise")
public class AutoSquare extends LinearOpMode {
    DcMotor         leftMotor, rightMotor;

    @Override
    public void runOpMode()
    {
        leftMotor = hardwareMap.dcMotor.get("left_motor");
        rightMotor = hardwareMap.dcMotor.get("right_motor");
        rightMotor.setDirection(DcMotor.Direction.REVERSE);

        int     loopCounter = 0;

        telemetry.addData("Mode", "waiting");
        telemetry.update();

        waitForStart();

        telemetry.addData("Mode", "active");
        telemetry.update();

        sleep(500);

        while (opModeIsActive())
        {
            while(loopCounter <= 3) {

                telemetry.addData("Mode", "part" + loopCounter);

                leftMotor.setPower(-0.25);
                rightMotor.setPower(-0.25);

                sleep(500);

                leftMotor.setPower(-0.25);
                rightMotor.setPower(0.25);

                sleep(100);

                loopCounter++;
            }
        }


    }
}
