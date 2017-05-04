package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

/**
 * Created by Vidushi on 5/3/2017.
 */
@Autonomous(name = "AutoCircle", group = "Excercises")
public class AutoCircle extends LinearOpMode
{
    DcMotor         leftMotor, rightMotor;
    @Override
    public void runOpMode() throws InterruptedException
    {
        leftMotor = hardwareMap.dcMotor.get("left_motor");
        rightMotor = hardwareMap.dcMotor.get("right_motor");
        rightMotor.setDirection(DcMotor.Direction.REVERSE);

        telemetry.addData("Mode", "waiting");
        telemetry.update();
        waitForStart();

        telemetry.addData("Mode", "active");
        telemetry.update();

        sleep(500);

        while (opModeIsActive())
        {
            rightMotor.setPower(0.25);
            leftMotor.setPower(-0.25);

            sleep(5000);

            rightMotor.setPower(0);
            leftMotor.setPower(0);
        }


    }
}
