public class penerapan_if {
    public static void main(String[] args) {
        int skorUjian = 86;
        char grade;
  
        if(skorUjian >= 90){
           grade = 'A';
        }
        else if(skorUjian >= 80){
           grade = 'B';
        }
        else if(skorUjian >= 70){
           grade = 'C';
        }
        else if(skorUjian >= 60){
           grade = 'D';
        }
        else{
           grade = 'E';
        }
  
        System.out.println("Grade = " + grade);
    }
}
