import java.util.Scanner;


public class praktikumIf {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan nilai quiz: ");
        int nilai_quiz = input.nextInt();
        
        System.out.print("Masukkan nilai tugas: ");
        int nilai_tugas = input.nextInt();
        
        System.out.print("Masukkan nilai UTS: ");
        int nilai_uts = input.nextInt();
        
        System.out.print("Masukkan nilai UAS: ");
        int nilai_uas = input.nextInt();
        
        int quiz = nilai_quiz * 10 / 100;
        int tugas = nilai_tugas * 25 / 100;
        int uts = nilai_uts * 25 / 100;
        int uas = nilai_uas * 40 / 100;
        
        int total_nilai = quiz + tugas + uts + uas;
        String nilai_akhir;

        if (total_nilai > 85) {
            nilai_akhir = "A";
        } else if (total_nilai > 75 && total_nilai <= 85) {
            nilai_akhir = "B";
        } else if (total_nilai > 60 && total_nilai <= 75) {
            nilai_akhir = "C";
        } else if (total_nilai > 40 && total_nilai <= 60) {
            nilai_akhir = "D";
        } else {
            nilai_akhir = "E";
        }
        
        System.out.println("Total Nilai: " + total_nilai);
        System.out.println("Nilai Akhir: " + nilai_akhir);
    }
}
