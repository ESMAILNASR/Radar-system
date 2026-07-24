import java.util.ArrayList;
import java.util.List;

public class Car {
    String plateNumber ;
    int speed ;
    app.typeCar typeCar;
    app.Seatbelt_status Seatbelt_status ;
    List<Violation> violations;


    public Car(String plateNumber, int speed, app.typeCar typeCar,  app.Seatbelt_status Seatbelt_status ) {
        this.plateNumber = plateNumber;
        this.speed = speed;
        this.typeCar = typeCar;
        this.Seatbelt_status = Seatbelt_status;
        violations = new ArrayList<>();
    }
}
