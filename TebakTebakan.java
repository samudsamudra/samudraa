import java.util.Scanner;

public class TebakTebakan {
    public static void main(String[] args) {
        String[] soal = {"ja_ _ _ta", "in _ _ _sia", "su_ _ _aya"};
        String[] jawaban = {"jakarta", "indonesia", "surabaya"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di game SAMUDRA XR6. Ketik \"ok\" pada layar untuk memulai game");
        String inputAwal = scanner.nextLine();

        if (inputAwal.equalsIgnoreCase("ok")) {
            System.out.println("Game dimulai!");

            int jumlahSoal = soal.length;
            int jawabanBenar = 0;
            int poin = 0;

            for (int i = 0; i < jumlahSoal; i++) {
                System.out.println("Tebak kata: " + soal[i]);
                System.out.print("Masukkan jawaban: ");
                String jawabanUser = scanner.nextLine();

                if (jawabanUser.equalsIgnoreCase(jawaban[i])) {
                    System.out.println("Selamat, jawaban Anda benar!");
                    jawabanBenar++;
                    poin += 10;
                } else if (jawabanUser.length() == jawaban[i].length() && isSetengahBenar(jawabanUser, jawaban[i])) {
                    System.out.println("Hampir tepat, silahkan coba lagi.");
                } else {
                    System.out.println("Tidak tepat, silahkan coba lagi.");
                }
            }

            System.out.println("\nGame Selesai!");
            System.out.println("Jumlah jawaban benar: " + jawabanBenar);
            System.out.println("Total poin Anda: " + poin);

            if (poin == jumlahSoal * 10) {
                System.out.println("Anda telah menyelesaikan game dengan sempurna.");
            } else if (poin > 0) {
                System.out.println("Jawaban anda belum memenuhi standart.");
            } else {
                System.out.println("Gagal, silahkan coba lagi.");
            }
        }

        scanner.close();
    }

    public static boolean isSetengahBenar(String jawabanUser, String jawaban) {
        int setengahPanjang = jawaban.length() / 2;
        String setengahJawaban = jawaban.substring(0, setengahPanjang) + "_" + jawaban.substring(setengahPanjang + 1);
        return jawabanUser.equalsIgnoreCase(setengahJawaban);
    }
}
