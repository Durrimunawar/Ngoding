import java.util.Scanner;
public class latihanwhile {
    public static void main(String[]ar) {
       
       int inputNumber, sum, count;

       double avarage;

       sum = 0 ;
       count = 0;

       Scanner input = new Scanner(System.in);
       System.out.println("input bilangan bulat : ");
       inputNumber = input.nextInt();

        while(inputNumber !=0){
            sum += inputNumber;
            count++;
                System.out.println("input bilangan berikutnya atau input 0 untuk mengakhiri");
                inputNumber = input.nextInt();
        }

        if(count == 0 ){
                System.out.println("anda belum input");

        }else{
            avarage = ((double) sum)/count;
                System.out.println("jumlah inputan : " + count);
                System.out.println("rata rata " + avarage);
        }

    }
}