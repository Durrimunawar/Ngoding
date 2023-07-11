public class penerapan_if_bersarang {
    public static void main(String[] args) {
        int age = 25;
        int weight = 60;

        if (age >= 18) {
            if (weight > 50) {
                System.out.println("memenuhi syarat untuk kerja");
            } else {
                System.out.println("penampilan anda belum cocok");
            }
        } else {
            System.out.println("anda belum cukup umur utuk bekerja");
        }
    }
}

