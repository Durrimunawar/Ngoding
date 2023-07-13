public class latihan {
    public static void main(String[] args) {
        int nialaiakhir = 60;
        char grade ; 


        // kondisi
       if (nialaiakhir >= 80) {
        grade = 'A';
        
       }else if (nialaiakhir < 80 && nialaiakhir >= 70){
        grade ='B';

       }else if(nialaiakhir < 70 && nialaiakhir >= 60){
        grade = 'C';

       }else{
        grade = 'F';

       }
// ini kondisi untuk mengeluarkan output

    if(grade == 'F'){
        System.out.println("anda gagal");

       }else{
        System.out.println("nilai anada adalah =" + grade);

       }


       

} 
        
    

    
}
