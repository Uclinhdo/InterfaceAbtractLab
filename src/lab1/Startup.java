/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author ldo
 */
public class Startup {
    public static void main(String[] args) {
        ProgrammingCourse student = new AdvancedJavaCourse("Advanced Java ProGramming","12345");
        System.out.println(student.getCourseName()+ student.getCourseNumber() + student.getPrerequisites());
    }
}
