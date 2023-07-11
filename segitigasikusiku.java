public class segitigasikusiku {
    public static void main(String[] args) {
        int baris = 5; // Jumlah baris

        // Looping untuk mengatur jumlah baris //

        for (int i = 1; i <= baris; i++) {

        // Looping untuk mencetak bintang pada setiap baris //

        for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}