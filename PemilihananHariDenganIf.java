import java.util.Scanner;

/**
 * PemilihananHariDenganIf
 */
public class PemilihananHariDenganIf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dayName = 0;
        String dayType;

        System.out.println("Input Angka Hari : ");
        dayName = sc.nextInt(); 

        if (dayName >= 5) {
            dayType = "weekdend";
        }else{
            dayType = "weekday";
        }
        if (dayName > 7) {
            dayType = "tidak valid";
        }
        System.out.println(dayName + " is a " + dayType);
        sc.close();
    }
}