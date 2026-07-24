import java.util.Date;

public class Violation {
    String name ;
    String PlateNumber;
    String description ;
    Date date;
    int price;
    Violation(String name,String PlateNumber,Date date, int price,String description){
        this.PlateNumber=PlateNumber;
        this.date=date;
        this.price=price;
        this.description = description;
        this.name=name;
    }
}
