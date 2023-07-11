import java.util.Scanner;

public class Kerucut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jari-jari kerucut: ");
        double jariJari = input.nextDouble();
        
        System.out.print("Masukkan tinggi kerucut: ");
        double tinggi = input.nextDouble();
        
        // Menghitung volume kerucut
        double volume = (1.0 / 3.0) * Math.PI * Math.pow(jariJari, 2) * tinggi;
        
        // Menghitung luas permukaan kerucut
        double luasPermukaan = Math.PI * jariJari * (jariJari + Math.sqrt(Math.pow(tinggi, 2) + Math.pow(jariJari, 2)));
        
        System.out.println("Volume kerucut: " + volume);
        System.out.println("Luas permukaan kerucut: " + luasPermukaan);
    }
}
