package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import static java.lang.Thread.sleep;

/**
 * Created by Vidushi on 5/8/2017.
 */

public class Shooter {

    Servo   liftServo, doorServo;
    DcMotor IntakeMotor, ShooterMotor;

    public void Init(LinearOpMode op)
    {

        doorServo = op.hardwareMap.servo.get("door_servo");
        IntakeMotor = op.hardwareMap.dcMotor.get("intake_motor");
        ShooterMotor = op.hardwareMap.dcMotor.get("shooter_motor");

    }
    public void intake() throws InterruptedException
    {
        IntakeMotor.setPower(.75);
        sleep(5000);
        IntakeMotor.setPower(0.0);
        doorServo.setPosition(0.9);
        sleep(5000);
        doorServo.setPosition(0.0);

    }
    public void shoot() throws InterruptedException
    {
        ShooterMotor.setPower(-.5);
        sleep(5000);
        ShooterMotor.setPower(0.0);
    }

    private class AutoShoot extends thread AutoShoot()
    {

    }



}
