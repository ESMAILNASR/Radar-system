import java.util.Date;

public class RadarService {
    public RadarService() {
    }
    public void checkViolation(Car car){
        checkSpeedOfCar(car);
        checkFromSeatbelt(car);
        System.out.println(displayViolations(car));;
    }

    private void checkFromSeatbelt(Car car) {
        SpeedLimitStrategy speedLimitStrategy = SpeedLimitFactory.speedLimitStrategy(car);
        assert speedLimitStrategy != null;
        if (speedLimitStrategy.isSpeedExceeded(car)) {
            car.getViolations().add(new Violation(TypeViolation.ExcessiveSpeed, new Date(), 300));
        }
    }

    private void checkSpeedOfCar(Car car) {
        if (car.getSeatbeltStatus() == SeatbeltStatus.FASTENED){
            car.getViolations().add(new Violation(TypeViolation.Seatbelt, new Date(), 100));
        }
    }

    // this method should exist in violation service
    private String displayViolations(Car car) {
        int totalAmount = 0;
        StringBuilder violationsByCar = new StringBuilder();
        if (!car.getViolations().isEmpty()){
            for (Violation violation : car.getViolations()) {
                totalAmount += violation.price;
                if (violation.typeViolation == TypeViolation.ExcessiveSpeed)
                    violationsByCar.append("\n- Seatbelt not fastned : ").append(violation.price).append(" EGP ");
                else if (violation.typeViolation == TypeViolation.Seatbelt)
                    violationsByCar.append("\n- speed of ").append(car.getSpeed()).append(" exceeded max allowed ").append(car.permittedSpeed()).append(" : ").append(violation.price).append(" EGP ");
            }
        }
        return "Traffic fine for car " +  car.getPlateNumber() +
                "\nTotal amount : "+ totalAmount +
                "\n Violations : "+
                violationsByCar;
    }

}
