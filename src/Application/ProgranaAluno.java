package Application;

import Myclasses.KeyboarInput;
import Entities.Student;

import java.util.Locale;

public class ProgranaAluno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        //keyboard input

        //Parent class
        Student studentOne;
        studentOne = new Student();

        //data input
        System.out.println("Enter the student data: ");
        studentOne.studentName = KeyboarInput.readAString("Student Name: ");
        studentOne.firstTest = KeyboarInput.readDoubleType("First test: ");
        studentOne.secondTest = KeyboarInput.readDoubleType("Second test: ");
        studentOne.thirdTest = KeyboarInput.readDoubleType("Third test: ");

        //output
        System.out.println("FINAL GRADE = " + studentOne.average() + "\n" + studentOne);


    }
}
