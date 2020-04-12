import java.util.List;

public class Faculty {
    List<Student> list = (List<Student>) new Student();
    String ime;
    public void prosekKrediti(List<Student> s){
        int count =0;
        int suma =0;
        for(int i=0;i<s.size();i++){
            suma+=s.ECTSCredits;
        }
        System.out.println("Prosecen broj krediti na studentite e " + (float)suma/count);

    }
}