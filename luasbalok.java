import javax.sound.sampled.BooleanControl;

public class luasbalok {
    public static void main(String[] args) {

        double panjang = 0.14;
        double luas = 0.8;
        double tinggi = 0.5;
        
        //volume balok
        double volume = panjang * luas * tinggi;

        //menghitung luas permukaan balok
        double luasPermukaan = 2 * (panjang * luas + panjang * tinggi + luas * tinggi);
        System.out.println("volume balok " + volume);
        System.out.println("luas permukaan balok " + luasPermukaan);

        // perbandingan luas volume & luas permukan balok
        boolean volumelebihbesar = volume > luasPermukaan;
        boolean luaspermukaanlebihbesar = luasPermukaan > volume;
        boolean samabesar = volume == luasPermukaan;
        boolean tidaksama = volume != luasPermukaan;
        
        System.out.println("volume balok lebih besar dari luas permukaan = " + volumelebihbesar);
        System.out.println("luas permukaan lebih besar dari volume = " + luaspermukaanlebihbesar);
        System.out.println("volume balok sama dengan luas permukaan balok = " + samabesar);
        System.out.println("volume balok tidak sama dengan permukaan balok = " + tidaksama);
















        
              
            }
        
        
     
        
    }

