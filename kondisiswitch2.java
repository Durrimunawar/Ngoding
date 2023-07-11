import java.util.Scanner;

public class kondisiswitch2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int hari = 3;
        String nohari = input.nextLine(); 
        switch (hari){
            case 1: 
            System.out.println("hari senin");
            break;
             case 2:
             System.out.println("swlasa");
             break;

             case 3:
             System.out.println("rabu");
             break;
        }
    }
}
