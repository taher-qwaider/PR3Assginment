/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3assginment;

/**
 *
 * @author PC
 */
public class ItStudent extends Student{
    
    public ItStudent(int id, String name, String major){
        super(id, name, major);
    }

    @Override
    public double caulcGrade(double mid, double project, double f) {
        double grade = mid*0.3 + project*0.3 + f*0.4;
        setGrade(grade);
        return grade;
    }
    
}
