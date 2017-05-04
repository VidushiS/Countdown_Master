package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.Range;
/**
 * Created by Vidushi on 4/26/2017.
 */
@TeleOp(name="VidushiDriveCode", group="Exercises")

//@Disabled
public class VidushiDriveCode extends LinearOpMode
{
    DcMotor     leftMotor, rightMotor;
    float       leftY, rightY;
    RobotCommon robot = new RobotCommon();

    public void runOpMode() throws InterruptedException
    {
        leftMotor = hardwareMap.dcMotor.get("left_motor");
        rightMotor = hardwareMap.dcMotor.get("right_motor");
        rightMotor.setDirection(DcMotor.Direction.REVERSE);

        telemetry.addData("Mode", "waiting");

        telemetry.update();

        waitForStart();

        while (opModeIsActive())
        {
            leftY = gamepad1.left_stick_y;
            rightY = gamepad1.right_stick_y;
            robot.tankdrive(leftY, rightY, false);

            leftMotor.setPower(Range.clip(leftY, -1.0, 1.0));
            rightMotor.setPower(Range.clip(rightY, -1.0, 1.0));

            telemetry.addData("Mode", "Running");
            telemetry.addData("rightStick" + rightY, "leftStick" + leftY);
            telemetry.update();

            idle();
        }
    }

}
