
package pr3assginment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class PR3Assginment {
    public static List<Student> sort(List<Student> s){
        ArrayList<Student> students = (ArrayList) s;
        for(int i =0; i<s.size(); i++){
            for(int j =i+1; j<s.size(); j++){
                if(s.get(i).getGrade() < s.get(j).getGrade()){
                    Student temp = s.get(i);
                    s.set(i, s.get(j));
                    s.set(j, temp);
                }
            }
        }
        return students;
    }

    public static void main(String[] args) {
        ArtStudent s1=new ArtStudent(123, "Ahmed", "Arbic");
        s1.caulcGrade(50, 60, 47);
        ArtStudent s2=new ArtStudent(124, "Said", "Art");
        s2.caulcGrade(50, 60, 54);
        ArtStudent s3=new ArtStudent(125, "li", "English");
        s3.caulcGrade(50, 20, 77);
        ItStudent s4=new ItStudent(126, "mohmmed", "It");
        s4.caulcGrade(50, 15, 54);
        ItStudent s5=new ItStudent(127, "Kahlid", "Software");
        s5.caulcGrade(50, 60, 74);
        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students = sort(students);
        for(Student s:students){
            System.out.println(s);
        }
        
        File f=new File("student.txt");
        if(!f.exists()){
            try{
                f.createNewFile();
            }catch(IOException ex){
                System.err.println(ex.getMessage());
            }
        }
        try{
            PrintWriter pr=new PrintWriter(f);
            for(Student s:students){
                pr.println(s);
            }
            pr.close();
        }catch(FileNotFoundException e){
            System.err.println(e.getMessage());
        }
    }
    
}
