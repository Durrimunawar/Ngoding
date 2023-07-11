import java.util.Scanner;

public class Kubus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi kubus: ");
        int sisi = input.nextInt();

        // Menghitung volume kubus
        int volume = sisi * sisi * sisi;

        // Menghitung luas permukaan kubus
        int luasPermukaan = 6 * sisi * sisi;

        System.out.println("Volume kubus: " + volume);
        System.out.println("Luas permukaan kubus: " + luasPermukaan);
    }
}

