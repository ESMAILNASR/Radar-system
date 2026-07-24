import java.util.Date;

public class SeatbeltViolation implements ViolatedRule{
    @Override
    public boolean test(Car car) {
        if(car.Seatbelt_status == app.Seatbelt_status.NOT) {
            Violation vi = new Violation("SeatbeltViolation", car.plateNumber, new Date(), 100, "Seatbelt not fastned");
            car.violations.add(vi);
            return true;
        }
        return false;
    }
}
