import java.util.Scanner;

public class coba3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka mulai: ");
        int angkaMulai = scanner.nextInt();

        int[] deretAngka = new int[5];  // Array untuk menyimpan deret angka

        // Penderetan angka
        for (int i = 0; i < deretAngka.length; i++) {
            deretAngka[i] = angkaMulai + i;
            if (deretAngka[i] % 2 != 0) {
                deretAngka[i] -= 3;
            }
        }

        // Menampilkan hasil penderetan
        System.out.println("Hasil penderetan angka:");
        for (int i = 0; i < deretAngka.length; i++) {
            System.out.println(deretAngka[i]);
        }

        scanner.close();
    }
}
    

