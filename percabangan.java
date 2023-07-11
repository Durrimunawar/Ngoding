import java.util.Scanner; 
 public class percabangan {
    public static void main (String[] args ) {
        int belanja = 0;
        Scanner scan = new Scanner(System.in);
        //
        System.out.print("total belanjaan : Rp ");
        belanja = scan.nextInt();
        //
        if ( belanja > 100000 ) {
            System.out.println("selmat anda mendapatkan hadiah");
        }
        System.out.println("terimakasih....");
    
    } 

 }
    
