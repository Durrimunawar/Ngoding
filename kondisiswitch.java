import java.util.Scanner;
public class kondisiswitch {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        


int nohari = 3;
String noHString = input.nextLine();

switch (nohari) {
    case 1: 
        System.out.println("ini hari senin");
        break;

    case 2 :
        System.out.println("ini hari selasa");
        break;
        
    case 3 : 
    System.out.println("ini hari rabu");
    break;

    case 4 : 
    System.out.println("ini haru kamis");
    break;

    case 5:
    System.out.println("ini hari jumat");
    break;


}

    }
    
}
