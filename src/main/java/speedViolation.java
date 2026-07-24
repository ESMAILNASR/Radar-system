import java.util.Date;

public class speedViolation implements ViolatedRule{
    @Override
    public boolean test(Car car) {
        if(car.typeCar == app.typeCar.PRIVATE && car.speed >= 80) {
            addViolation(car, 80);
            return true;
        }
        else if(car.typeCar == app.typeCar.BUS && car.speed >= 70) {
            addViolation(car, 70);
            return true;
        }
        if(car.typeCar == app.typeCar.PRIVATE && car.speed >= 60) {
            addViolation(car, 60);
            return true;
        }
        return false;
    }

    private void addViolation(Car  car, int speedAllowd) {
        Violation vi = new Violation("speedViolation", car.plateNumber, new Date(), 300, "speed of "+car.speed+" exceeded max allowed "+speedAllowd);
        car.violations.add(vi);
    }

}
