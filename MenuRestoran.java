import java.util.Scanner;

public class MenuRestoran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String menuMakan, menuMinum, pesananLagi, NamaPelanggan;
        double TotalHarga = 0, Bayar, Rawon = 15000, sotoAyam = 12000, sateAyam = 12000, nasiGoreng = 11000, esTeh = 3000, esJeruk = 4000, esCampur = 5000;
        boolean inginPesananLagi = true;

        System.out.println("Selamat datang di Restoran APA AJA ADA");
        System.out.println("====== RESTORAN APA AJA ADA ======");
        System.out.println("Seperti kata pepatah.'Tak Kenal Maka tak sayang' nah jadi nama kamu siapa nii");
        System.out.print("Nama kamu: ");
        NamaPelanggan = input.nextLine();
        System.out.println("1. Rawon = Rp 15000\n2. Soto Ayam = Rp 12000\n3. Sate Ayam = Rp 12000\n4. Nasi Goreng = Rp 11000");

        do {
            System.out.print("Selamat Datang di Restoran " + NamaPelanggan + ", silahkan pilih menu kamu hari ini :D (1/2/3/4): ");
            menuMakan = input.nextLine();

            switch (menuMakan) {
                case "1":
                    System.out.println("Rawon Enak yang dagingnya TWEBEELL");
                    TotalHarga += Rawon;
                    break;
                case "2":
                    System.out.println("POK POK POK soto ayaam yang kuahnya kental");
                    TotalHarga += sotoAyam;
                    break;
                case "3":
                    System.out.println("Sate Ayam yang Enaaak bangett");
                    TotalHarga += sateAyam;
                    break;
                case "4":
                    System.out.println("Nasi Goreng yang ekstra mantappp");
                    TotalHarga += nasiGoreng;
                    break;
            }

            System.out.println("Ayoo biar lehernya lega jangan lupa minuum");
            System.out.println("1. Es Teh = Rp 3000\n2. Es Jeruk = Rp 4000\n3. Es Campur = Rp 5000 \n4. Ga pake");
            System.out.print("Silahkan pilih menu minuman disini (1/2/3/4): ");
            menuMinum = input.nextLine();

            switch (menuMinum) {
                case "1":
                    System.out.println("kamu memilih Es Teh");
                    TotalHarga += esTeh;
                    break;
                case "2":
                    System.out.println("kamu memilih Es Jeruk");
                    TotalHarga += esJeruk;
                    break;
                case "3":
                    System.out.println("kamu memilih Es Campur");
                    TotalHarga += esCampur;
                    break;
                case "4":
                    System.out.println("Ga pake ya? oke lah");
                    break;
                
            }

            System.out.println("Kamu mau pesen menu lain? \n1. ya \n2. tidak");
            System.out.println("pilih pakai angka: ");
            pesananLagi = input.nextLine();

            if (pesananLagi.equals("2")) {
                inginPesananLagi = false;
            }

        } while (inginPesananLagi);

        System.out.println("Total Harga: Rp " + TotalHarga);
        System.out.print("Masukkan jumlah uang yang dibayarkan: ");
        Bayar = input.nextDouble();
        double Kembalian = Bayar - TotalHarga;
        System.out.println("Kembalian: Rp " + Kembalian);

        if (Bayar < TotalHarga) {
            System.out.println("Yaah uangmu ga cukup nii :(");
        } else {
            System.out.println("Terimakasiii " + NamaPelanggan + " sudah memesan makanan kamiii, silahkan tunggu makanannya dateng yaa");
            System.out.println("Java code by: Samudra, XR6");
            System.out.println("==== TUGAS SELESAI ====");
        }
    }
}