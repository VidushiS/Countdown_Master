package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by Mark on 12/1/2016.
 */
@TeleOp(name="Threshhold", group="Exercises")
public class ThreshholdTester extends LinearOpMode {

    ColorSensor lineColor;
    String programVersion;

    public void runOpMode() throws InterruptedException {
        lineColor = hardwareMap.colorSensor.get("lineColor");

        programVersion = "MRB_12_12_16_5";
        telemetry.addData("Mode", "waiting");
        telemetry.addLine("ProgramName = " + programVersion);
        telemetry.update();

        waitForStart();
        /*
        lineColor.enableLed(true);
        lineColor.enableLed(false);
        lineColor.enableLed(true);
*/

        while (opModeIsActive())
        {

            telemetry.addData("Mode", "Running");
            telemetry.addLine("blue" + lineColor.blue());
            telemetry.update();
            idle();
        }
    }

}