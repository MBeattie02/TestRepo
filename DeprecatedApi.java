import java.util.Date;

public class DeprecatedApi {

    public void checkDate() {
        Date date = new Date();
        int year = date.getYear();  // Deprecated method usage
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        ExampleUsage example = new ExampleUsage();
        example.checkDate();
    }
}
