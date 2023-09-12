import java.util.Scanner;

public class KalkulatorSuhuNext {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double C, F, R, K;

        System.out.print("\nEnter suhu Celsius: ");
        C = input.nextDouble();

        System.out.println("Silahkan pilih satuan yang ingin kamu inginkan:");
        System.out.println("R - Reamur");
        System.out.println("F - Fahrenheit");
        System.out.println("K - Kelvin");

        char unit = (input.next()).charAt(0);

        switch (unit) {
            case 'R':
            case 'r':
                R = (4.0 / 5.0) * C;
                System.out.println("Hasil konversi: " + R + " Reamur");
                break;
            case 'F':
            case 'f':
                F = (9.0 / 5.0) * C + 32;
                System.out.println("Hasil konversi: " + F + " Fahrenheit");
                break;
            case 'K':
            case 'k':
                K = C + 273.15;
                System.out.println("Hasil konversi: " + K + " Kelvin");
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }
    }
}
