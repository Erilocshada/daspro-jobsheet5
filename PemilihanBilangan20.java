
import java.util.Scanner;

public class PemilihanBilangan20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        String hasil;

        System.out.println("Masukan Angka :");
        angka = input.nextInt();
        hasil = angka %2 == 0 ? "Genap": "Ganjil";

        System.out.println(" Angka " + angka + " adalah " + hasil);
        input.close();
        }
    }