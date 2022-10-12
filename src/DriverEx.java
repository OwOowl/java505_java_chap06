public class DriverEx {
    public static void main(String[] args) {
        System.out.println("각각 객체를 생성하여 실행");
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        bus.run();
        taxi.run();

        System.out.println("\n----- 익명객체를 통한 구현 -----");
        Vehicle vehicle = new Vehicle() {
            @Override
            public void run() {
                System.out.println("탈것이 달립니다.");
            }
        };
        vehicle.run();

        System.out.println("\n----- 부모 인터페이스 타입의 변수에 자식 객체를 대입 -----");
        vehicle = bus;
        vehicle.run();
        vehicle = taxi;
        vehicle.run();

        System.out.println("\n----- 인터페이스 변수를 매개변수로 사용 시 -----");
        Driver driver = new Driver();
        driver.drive(bus);
        driver.drive(taxi);

        System.out.println("\n----- 자동 타입변환, 강제 타입변환, instanceof -----");
//        자동 타입변환 : 부모인 Vehicle 인터페이스 타입의 변수에 자식인 Bus클래스 타입의 객체를 대입
        Vehicle vehicle1 = new Bus();
        vehicle1.run();

//        데이터 타입이 다르므로 강제 타입변환을 해야 함
//        강제 타입변환의 조건이 원본이 자식클래스 타입의 객체일때 해당 클래스 타입으로 변환 시 가능
//        원본 클래스 객체 타입이 맞는지 확인을 하기 위해서는 instanceof 연산자를 사용해야 함
        Bus bus1 = (Bus)vehicle1;
        bus1.run();

        Vehicle vehicle2 = new Bus();
        vehicle2.run();

        if (vehicle2 instanceof Taxi) {
            Taxi taxi1 = (Taxi)vehicle2;
            taxi1.run();
            System.out.println("정상적으로 Taxi 클래스 타입으로 변경");
        }
        else{
            System.out.println("Taxi 클래스 타입으로 변경할 수 없습니다.");
        }


    }
}
