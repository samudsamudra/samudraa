import java.util.Scanner;

public class DaftarNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama:");
        String nama = input.nextLine();
        System.out.println("Masukkan nilai:");
        int nilai = input.nextInt();
        String kategori = null;
        String predikat = null;
        if (nilai >= 96 && nilai <= 100) {
            kategori = "A";
            predikat = "Sangat Baik";
        } else if (nilai >= 91 && nilai <= 95) {
            kategori = "A-";
            predikat = "Sangat baik";
        } else if (nilai >= 86 && nilai <= 90) {
            kategori = "B+";
            predikat = "Baik";
        } else if (nilai >= 81 && nilai <= 85) {
            kategori = "B";
            predikat = "Baik";
        } else if (nilai >= 75 && nilai <= 80) {
            kategori = "B-";
            predikat = "Baik";
        } else if (nilai >= 70 && nilai <= 74){
            kategori = "C+";
            predikat = "Cukup";
        } else if (nilai >= 65 && nilai <= 69){
            kategori = "C";
            predikat = "Cukup";
        } else if (nilai >= 60 && nilai <= 64){
            kategori = "C-";
            predikat = "Cukup";
        } else if (nilai >= 55 && nilai <= 59){
            kategori = "D+";
            predikat = "Kurang";
        } else if (nilai >= 0 && nilai <= 54){
            kategori = "D";
            predikat = "Kurang";
        }
        System.out.println("Nama: " + nama);
        System.out.println("Nilai: " + nilai);
        System.out.println("Kategori: " + kategori);
        System.out.println("Predikat: " + predikat);
        System.out.println("Tugas dari: Samudra XR6 absen 30");
        System.out.println("Ini tugas saya buu, asli dari codingan saya :)");
    }
}