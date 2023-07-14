import java.util.Scanner;
public class loopingdowhile {
    public static void main(String[]args)  {
        Scanner input = new Scanner(System.in);
        int pilihan;
  
        do{
           System.out.println("Menu");
           System.out.println("1. minum teh 1");
           System.out.println("2. Minum just 2");
           System.out.println("3. Minum kopi 3");
           System.out.println("4. Keluar");
           System.out.print("Pilih menu: ");
           pilihan = input.nextInt();
  
           switch(pilihan){
              case 1:
                 System.out.println("pesanan anada minum kopi 1");
                 break;
              case 2:
                 System.out.println("pesanan anda minum jus 2");
                 break;
              case 3:
                 System.out.println("pesanan anda minum teh 3");
                 break;
              case 4:
                 System.out.println("Anda memilih keluar");
                 break;
              default:
                 System.out.println("Pilihan tidak tersedia");
           }
        }while(pilihan != 4);
     
  
  


    }
}
