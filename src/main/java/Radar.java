import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Radar {
    private Date date;
    public Radar() {
    }
    public void addCar(Car car){
        checkViolation(car);
    }

    private void checkViolation(Car car) {
        ViolatedRule VRSpeed = new speedViolation();
        ViolatedRule VRSeatbit = new SeatbeltViolation();
        if (car != null) {
            boolean isVRSpeed = VRSpeed.test(car);
            boolean isVRSeatale = VRSeatbit.test(car);
            if( isVRSpeed || isVRSeatale) {
                System.out.println(getViolatOfCar(car));
            }
            else {
                System.out.println(car + " not exist any violation");
            }


        }
    }

    private String getViolatOfCar(Car car) {
        int totalAmount = 0;
        String violationsName = "";
        for (Violation violation : car.violations){
            totalAmount += violation.price;
            violationsName += "\n     "+ violation.description + " : "+ violation.price;
        }
        String messsage = "Traffic fine for car " +  car.plateNumber +
                "\nTotal amount : "+ totalAmount +
                "\n Violataions : "+
                violationsName;
        return messsage;
    }

}
