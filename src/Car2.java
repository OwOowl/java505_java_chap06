public class Car2 {
    Tirei[] tires = new Tirei[4];
//    Tirei[] tires = {
//            new HankookTire(),
//        new HankookTire(),
//        new HankookTire(),
//        new HankookTire()
//    };

    public Car2() {
        for (int i = 0; i < tires.length; i++) {
            tires[i] = new HankookTire();
        }
    }

    void run() {
        for (Tirei item : tires) {
            item.roll();
        }
    }
}
