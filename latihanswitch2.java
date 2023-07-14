import java.util.Scanner;

public class latihanswitch2 {
    public static void main (String []ar){
        
        Scanner input = new Scanner(System.in);


        int bulan  = 5;
        String namabulan = input.nextLine();

        switch (bulan){
            case 1:
                namabulan = "januari";
                    break;
            case 2:
                namabulan = "februaari";
                    break;
            case 3:
                namabulan = "maret";
                    break;
            case 4:
                namabulan = "april";
                    break; 
            default :
                namabulan = "silahkan pilih";                           

        }
        System.out.println("Nama bulan = " + namabulan);
        
    }
}