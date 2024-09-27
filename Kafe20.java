
import java.util.Scanner;

public class Kafe20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input
        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;
        //masukkan inputan
        System.out.print("Masukkan menu: ");
        menu = sc.nextLine();
        System.out.print("Masukkan Ukuran Cup: ");
        ukuranCup = sc.next().charAt(0);
        System.out.print("Masukkan jumlah : ");
        jumlah = sc.nextInt();
        System.out.print("Masukkan Keanggotaan (true/false)");
        keanggotaan = sc.nextBoolean();
        //proses
        double hargaMenu = 0;
        switch (menu.toLowerCase()) {
            case "kopi":
                hargaMenu = 12000;
                break;
            case "teh":
                hargaMenu = 7000;
            break;
            case "coklat":
                hargaMenu = 20000;
            break;
            default:
                System.out.println("Menu Tidak Tersedia");
                break;
        }
        double totalHarga = jumlah * hargaMenu;
        switch (ukuranCup) {
            case 'S':
                break;
            case 'M':
            totalHarga = 0.25 * totalHarga;
                break;
            case 'L':
            totalHarga = 0.4 * totalHarga;
                break;
            default:
            System.out.println("Ukuran yang ada pilih tidak tersedia");
                break;
        }
        //proses
        double diskon = keanggotaan ? 0.1 : 0;
        double nominalBayar = totalHarga - (diskon * totalHarga);
        //output
        System.out.println("Item Pembelian : " + jumlah + " " + menu + " Dengan Uk Cup " + ukuranCup);
        System.out.println("Nominal Bayar : " + nominalBayar );
        sc.close();
    }
}
