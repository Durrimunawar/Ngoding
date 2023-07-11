public class array1 {
    public static void main(String[] args) {
        
        System.out.println("mencari nilai rata rata");
        double nilai_ujian[] = {20,30,20,30,20};


        double hasil = 0;
        

        for (int i = 0; i < nilai_ujian.length; i++) {
            hasil = hasil + nilai_ujian[i];


        }

        System.out.println("rata rata nilainya adalah " + (hasil/5));
        

        // mencari nilai rata rata//
        System.out.println("nilai rata rata adalah");
        int nilai_praktikum[] = {1,2,3,4,5,6,7,8};
         int Nilai  = 0;

         for (int j = 0; j < nilai_praktikum.length; j++){
            Nilai = Nilai  + nilai_praktikum[j];
         }
         
        



    }
}
