
import java.util.Scanner;

public class Percobaan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;

        System.out.println("Masukan Angka :");
        angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Angka" + " " + angka +" "+ "Termasuk Bilangan Genap");

        }else{
            System.out.println("Angka" + " " + angka + " " + "Termasuk Bilangan Ganjil");
        }
        input.close();
        }
    }