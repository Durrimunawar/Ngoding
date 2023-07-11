public class luaskerucut {
    public static void main(String[]args) {
        int pi = 3;
        int jarijari = 7;
        int jarijariS = 10;

        //volume kerucut
        int volume = pi * jarijari * jarijariS;

        //menghitung luas permukaan kerucut
        int luaspermukaan = pi * jarijari * jarijariS;
        System.out.println("volume kerucut " + volume);
        System.out.println("luas permukaan kerucut " + luaspermukaan);

        // perbandingan luas volume & luas permukaan kerucut
        boolean volumelebihbesar = volume > luaspermukaan;
        boolean luasPermukaanlebihbesar = volume < luaspermukaan;
        boolean samabesar = volume == luaspermukaan;
        boolean tidaksama = volume != luaspermukaan;

        System.out.println("volume kerucut lebih besar dari luas permukaan = " + volumelebihbesar);
        System.out.println("luas permukaan lebih besar dari volume = " + luasPermukaanlebihbesar);
        System.out.println("volume kerucut sama dengan luas permukaan balok = " + samabesar );
        System.out.println("volume kerucut tidak sama dengan permukaan balok = " + tidaksama);



    }
    
}
