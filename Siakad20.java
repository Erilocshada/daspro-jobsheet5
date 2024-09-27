import java.util.Scanner;
public class Siakad20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama,nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;
    System.out.println("Masukkan Nama");
    nama = sc.nextLine();
    System.out.println("Masukkan NIM");
    nim = sc.nextLine();
    System.out.println("Masukkan Kelas");
    kelas = sc.nextLine(). charAt(0);
    System.out.println("Masukkan Absen");
    absen = sc.nextByte();
    System.out.println("Masukkan nilai kuis");
    nilaiKuis = sc.nextDouble();
    System.out.println("Masukkan nilai tugas");
    nilaiTugas = sc.nextDouble();
    System.out.println("Masukkan nilai ujian");
    nilaiUjian = sc.nextDouble();

    System.out.println("Mahasiswa dengan Nama " + nama + " NIM " + nim + " Kelas " + kelas + " No Absen " + absen);
    nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) /3;
    System.out.println("Nama: " + nama + " NIM: " + nim);
    System.out.println("Kelas: " + kelas + " Absen: " + absen);
    System.out.println("Nilai Akhir: " + nilaiAkhir);

    if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
        System.out.println("Nilai akhir Huruf : " + "A");
        System.out.println("Kualifikasi : " + "Sangat Baik");
    }
    else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
        System.out.println("Nilai akhir Huruf : " + "B+");
        System.out.println("Kualifikasi : " + "Lebih Dari Baik");
    }else if (nilaiAkhir > 65 && nilaiAkhir <= 73 ) {
        System.out.println("Nilai akhir Huruf : " + "B");
        System.out.println("Kualifikasi : " + "Baik");
    } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
        System.out.println("Nilai akhir Huruf : " + "C+");
        System.out.println("Kualifikasi : " + "Lebih Dari Cukup");
    }else if (nilaiAkhir > 50 && nilaiAkhir <= 60 ) {
        System.out.println("Nilai akhir Huruf : " + "C");
        System.out.println("Kualifikasi : " + "Cukup");
    } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
        System.out.println("Nilai akhir Huruf : " + "D");
        System.out.println("Kualifikasi : " + "Kurang");
    }else if (nilaiAkhir > 0 && nilaiAkhir <= 39 ) {
        System.out.println("Nilai akhir Huruf : " + "E");
        System.out.println("Kualifikasi : " + "Gagal");
    }
    sc.close();
    }
}
