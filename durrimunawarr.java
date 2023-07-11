import java.util.Scanner;

public class durrimunawarr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Memasukkan nama pemain satu
        System.out.print("Masukkan nama pemain satu: ");
        String pemainSatu = scanner.nextLine();

        // Pilihan bot musuh //

        String botPilihan = "telunjuk";

        // Memasukkan pilihan pemain satu//

        System.out.print(pemainSatu + ", pilih antara telunjuk, jempol, atau kelingking: ");
        String pemainSatuPilihan = scanner.nextLine();

        // Menampilkan hasil //
        System.out.println("Bot musuh memilih: " + botPilihan);
        System.out.println(pemainSatu + " memilih: " + pemainSatuPilihan);

        // Memeriksa siapa yang menang //
        if (pemainSatuPilihan.equals(botPilihan)) {
            System.out.println("Hasil: Seri!");
        } else if (pemainSatuPilihan.equals("telunjuk")) {
            if (botPilihan.equals("jempol")) {
                System.out.println("Hasil: " + pemainSatu + " Menang!");
            } else {
                System.out.println("Hasil: Bot Menang!");
            }
        } else if (pemainSatuPilihan.equals ("jempol")) {
            if (botPilihan.equals("kelingking")) {
                System.out.println("Hasil: " + pemainSatu + " Menang!");
            } else {
                System.out.println("Hasil: Bot Menang!");
            }
        } else if (pemainSatuPilihan.equals("kelingking")) {
            if (botPilihan.equals("telunjuk")) {
                System.out.println("Hasil: " + pemainSatu + " Menang");
            } else {
                System.out.println("Hasil: Bot Menang");
            }
        } else {
            System.out.println("Pilihan tidak valid");
        }

        
    }
}