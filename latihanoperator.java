import java.util.Scanner;

public class latihanoperator {
    public static void main(String[]ar) {

        // luas lingkaran = phi * r * r;
         
        int jarijari;
        Scanner input = new Scanner (System.in);

        System.out.println("masukan nilai jari jari : ");
        jarijari = input.nextInt();

        double luas = Math.PI * jarijari *jarijari;
         System.out.println("luas lingkaran adalah " + luas );


        
    }
}
