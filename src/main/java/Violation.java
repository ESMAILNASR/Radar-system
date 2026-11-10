import java.util.Date;

public class Violation {
    TypeViolation typeViolation;
    Date date;
    int price;

    Violation(TypeViolation typeViolation,Date date, int price){
        this.date=date;
        this.price=price;
        this.typeViolation=typeViolation;
    }

}
