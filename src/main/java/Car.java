import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Car {
    private String plateNumber ;
    private int speed ;
    private typeCar type;
    private Date date;
    private SeatbeltStatus seatbeltStatus;
    private List<Violation> violations;


    public Car(String plateNumber, int speed, typeCar typeCar, Date date, SeatbeltStatus seatbeltStatus ) {
        this.plateNumber = plateNumber;
        this.speed = speed;
        this.type = typeCar;
        this.date = date;
        this.seatbeltStatus = seatbeltStatus;
        violations = new ArrayList<>();
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public int getSpeed() {
        return speed;
    }

    public typeCar getType() {
        return type;
    }

    public Date getDate() {
        return date;
    }

    public SeatbeltStatus getSeatbeltStatus() {
        return seatbeltStatus;
    }

    public List<Violation> getViolations() {
        return violations;
    }

    public int permittedSpeed(){
        if (this.type == typeCar.TRUCK){
            return 60;
        } else if (this.type == typeCar.BUS){
            return 70;
        } else if (this.type == typeCar.PRIVATE) {
            return 80;
        } else return 0;
    }
}
