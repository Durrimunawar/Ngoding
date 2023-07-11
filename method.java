import java.util.Scanner;

public class method {
    public static void main (String[]ar){
        int panjang = 10 ;  
        int lebar ;
        System.out.println("masukan nilai panjang :");

        Scanner input  = new Scanner(System.in);
        panjang = input.nextInt();

        System.out.println("masukan nilai lebar : ");
        lebar  = input.nextInt();



        int luas = persegipanjang(5,3);
        int luaaslain = persegipanjang(10,3);
        System.out.println("luas dari yang anda input adalah : " + luas);
        System.out.println("luas dari yang laain adalah : " + luaaslain);
        System.out.println(namamahasiswa("budiawan"));
        System.out.println(namamahasiswa("muhammad"));
        System.out.println(namamahasiswa("Muhammad Nasar"));
    }

    //method yang kitaa buat (user - defind method)

    public static int persegipanjang(int panjang , int lebar) {
        int luas = panjang * lebar;
        return luas;
    }

    public static String namamahasiswa(String nama){
        return  nama;
    }
     
    

    

    

   
}
