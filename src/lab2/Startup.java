/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author ldo
 */
public class Startup {
    public static void main(String[] args) {
        ProgrammingCourse student = new AdvancedJavaCourse("Advanced Java","12345");
        
       student.getPrerequisites();
       
    }
}
