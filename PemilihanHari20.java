
import java.util.Scanner;

public class PemilihanHari20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //input
        String dayName, dayType;
        //output
        System.out.println("Input Nama hari: ");
        dayName = sc.nextLine();

        switch (dayName.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                dayType = "weekday";
                break;
            case "saturday":
            case "sunday":
                dayType = "weekend";
                break;
            default:
                dayType = "invalid day name";
                break;
        }
        System.out.println(dayName + " Is a " + dayType);
        sc.close();
    }
}
