public class app {
    enum typeCar {PRIVATE, BUS, TRUCK}
    enum Seatbelt_status {FASTENED, NOT}
    public static void main(String[] args) {
        Radar radar = new Radar();
        radar.addCar(new Car("ABD1235", 100, typeCar.PRIVATE, Seatbelt_status.NOT));
        Car car1 = new Car("BusD1235", 50, typeCar.BUS, Seatbelt_status.NOT);
        radar.addCar(car1);
        Car car2 = new Car("TR2040005", 80, typeCar.TRUCK, Seatbelt_status.FASTENED);
        radar.addCar(car2);

    }
}
