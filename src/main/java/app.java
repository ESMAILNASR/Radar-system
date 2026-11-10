import java.util.Date;

public class app {
    public static void main(String[] args) {
        RadarService radarService = new RadarService();
        radarService.checkViolation(new Car("ABD1235", 100, typeCar.PRIVATE, new Date(),SeatbeltStatus.NOT));
        Car car1 = new Car("BusD1235", 50, typeCar.BUS, new Date(),SeatbeltStatus.NOT);
        radarService.checkViolation(car1);
        Car car2 = new Car("TR2040005", 80, typeCar.TRUCK,new Date() ,SeatbeltStatus.FASTENED);
        radarService.checkViolation(car2);
    }
}
