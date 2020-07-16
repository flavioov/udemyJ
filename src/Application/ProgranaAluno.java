package Application;

import Entities.KeyboarInput;
import Entities.Student;

import java.util.Locale;

public class ProgranaAluno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        //keyboard input
        KeyboarInput bufferReaderSimplified;
        bufferReaderSimplified = new KeyboarInput();

        //Parent class
        Student studentOne;
        studentOne = new Student();

        //data input
        System.out.println("Enter the student data: ");
        studentOne.studentName = bufferReaderSimplified.readAString("Student Name: ");
        studentOne.firstTest = bufferReaderSimplified.readDoubleType("First test: ");
        studentOne.secondTest = bufferReaderSimplified.readDoubleType("Second test: ");
        studentOne.thirdTest = bufferReaderSimplified.readDoubleType("Third test: ");

        //output
        System.out.println("FINAL GRADE = " + studentOne.average() + "\n" + studentOne);


    }
}
