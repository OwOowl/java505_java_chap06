public class Car {
    Tirei frontLeftTire = new HankookTire();
    Tirei frontRightTire = new HankookTire();
    Tirei backLeftTire = new HankookTire();
    Tirei backRightTire = new HankookTire();

    void run() {
        frontLeftTire.roll();
        frontRightTire.roll();
        backLeftTire.roll();
        backRightTire.roll();
    }
}
