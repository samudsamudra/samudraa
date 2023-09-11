import java.util.Scanner;

public class KalkulatorSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double C, F, R, K;

        System.out.println("Masukan suhu dalam Celcius: ");
        C = input.nextDouble();

        R = 4.0 / 5.0 * C;
        F = 9.0 / 5.0 * C + 32;
        K = C + 273;

        System.out.println("Nilai Reamur = " + R + "R");
        System.out.println("Nilai Fahrenheit = " + F + "F");
        System.out.println("Nilai Kelvin = " + K + "K");
    }
}
