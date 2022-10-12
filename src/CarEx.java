public class CarEx {
    public static void main(String[] args) {
//        다중 인터페이스
        Car myCar = new Car();

        myCar.run();

        myCar.frontLeftTire = new KumhoTire();
        myCar.frontRightTire = new KumhoTire();

        myCar.run();


        System.out.println();

//        인터페이스 배열
        Car2 car2 = new Car2();
        car2.run();

        car2.tires[2] = new KumhoTire();
        car2.tires[3] = new KumhoTire();
        car2.run();
    }
}
