import java.util.Scanner;
public class pengenalanoperator {
    public static void main (String[]args) {
        
        int a  = 1 ;
        int b = 2;
        int c = 3 ; 
        double d = 10;
        double e  = 3;
        int angka = 4;



        String namadepan = "budi";
        String namabelakang = "hanjing";

        // operasi penjumlahan 
        int  jumlah = a+b+c;
        // operasi pengurangan 
        int selisih = c-a;
        // operasi perkalian 
        int perkalian = c*b;
        // oprasi pembagian 
        double pembagian = d/e;
        // operasi modulus
        int modulus = b%a;
        // operasi increment
        int cplus = ++c;



        System.out.println("hasil penjumlahan a,b,c adalah "  +jumlah);
        System.out.println(selisih);
        System.out.println(pembagian);
        System.out.println(perkalian);
        System.out.println(modulus);
        // untuk Math. phi
        System.out.println(Math.PI);
        System.out.println(Math.sqrt(213));
        System.out.println(namadepan += namabelakang);
        System.out.println(cplus);
        // 
        System.out.println(1&0);
        System.out.println(1 | 0);
        System.out.println(2^1);
        System.out.println(~0);
        
        // operator pembanding 
        System.out.println(a == b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        // operator logika 
        System.out.println(true || false);
        System.out.println(false || true); 

        Scanner input = new Scanner(System.in);
        angka = input.nextInt();





    }
}
