import java.util.Scanner;

public class bisayok {
    public static void main(String[] args) {
        int nomor = 24;
        while (nomor > 7) {
            System.out.println(nomor);
            nomor--;
        }
// 
        
        int makanan = 2;
         switch (makanan) {
            case 1:
            System.out.println("pajoh leupek");
            break;
            
            case 2:
            System.out.println("pajoh apam");
            break;


         }

         // forlooping

         
         for(int i = 0 ; i <= 5; i++){
            System.out.println("marikitacoba");
         }
         //

         for(int j = 0; j <= 4; j++){
            System.out.println("ayolah");
         }
         //=====///
         Scanner tamong = new Scanner(System.in);
         int nilai;
         System.out.println("ta peulop yum : ");
         nilai = tamong.nextInt();

         if(nilai >= 60) {
            System.out.println("selamat");
         }else if (nilai >=50) {
            System.out.println("kerja bagus");

         }else if (nilai <=40) {
            System.out.println("mantap");

         }else {
            System.out.println("belajar lagi yook");

         }



         



    }
}
