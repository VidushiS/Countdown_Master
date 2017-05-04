package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by Vidushi on 5/3/2017.
 */
@Autonomous(name = "ServoMove", group = "Exercises")
public class ServoMove extends LinearOpMode
{
    Servo       servo1;

    @Override
    public void runOpMode() throws InterruptedException
    {
        servo1 = hardwareMap.servo.get("door_servo");

        telemetry.addData("Mode", "waiting");
        telemetry.update();

        waitForStart();

        telemetry.addData("Mode", "active");
        telemetry.update();

        sleep(5000);

        while (opModeIsActive()){
        servo1.setPosition(.5);
        sleep(500);
        servo1.setPosition(.25);
        sleep(500);
        servo1.setPosition(0);

        telemetry.addData("Mode", "done");
        telemetry.update();
    }


    }
}
