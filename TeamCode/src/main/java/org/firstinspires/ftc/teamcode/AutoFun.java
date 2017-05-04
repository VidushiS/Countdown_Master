package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;


/**
 * Created by Vidushi on 4/27/2017.
 */
@Autonomous(name = "AutoFun", group= "Exercises")
public class AutoFun extends LinearOpMode {

    DcMotor     leftMotor, rightMotor;
    double       leftY, rightY;

    @Override
    public void runOpMode() throws InterruptedException
    {
        leftMotor = hardwareMap.dcMotor.get("left_motor");
        rightMotor =  hardwareMap.dcMotor.get("right_motor");
        rightMotor.setDirection(DcMotor.Direction.REVERSE);

        telemetry.addData("Mode", "waiting");
        telemetry.update();

        waitForStart();

        telemetry.addData("Mode", "active");
        telemetry.update();

       while (opModeIsActive())
       {
           leftY = .25;
           rightY = .25;

           leftMotor.setPower(leftY);
           rightMotor.setPower(rightY);


           sleep(2000);

           leftMotor.setPower(0.0);
           rightMotor.setPower(0.0);
       }
    }

        }
