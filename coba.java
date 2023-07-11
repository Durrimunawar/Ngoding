import java.util.Scanner;

public class coba {
    public static void main(String[] args) {
      System.out.println();
      Scanner inputHari = new Scanner(System.in);
      String hari,jam;

      System.out.println("senin/selasa/rabu/kamis/jumat");
      hari = inputHari.next();
      System.out.println("masukkan jam kelasa yang mau di isi(pagi/siang)");
      jam = inputHari.next();

      switch(hari){
        case "senin":
            switch (jam){
                case "pagi":
                System.out.println("kelas penuh");
                break;
                case "siang":
                System.out.println("kelas kosong");
                break;
            }
            break;

            case "selasa":
            switch(jam){
                case "pagi":
                System.out.println("kelas penuh");
                break;

                case "siang":
                System.out.println("kelas penuh");
                break;


            }
            break;

            case "rabu":
            switch(jam){
                case "pagi":
                System.out.println("kelas kosong");
                break;

                case "siang":
                System.out.println("kelas kosong");
                break;
            }
            break;

            case "kamis":
            switch(jam){
                case "pagi":
                System.out.println("kelas kosong");
                break;
                case "siang":
                System.out.println("kelas penuh");
                break;

            }
            break;

            case "jumat":
            switch (jam){
                case "pagi":
                System.out.println("kelas kosong");
                break;

                case "siang":
                System.out.println("kelas kosong");
                break;

            }
            break;
            

            



      }






      

    }
}
