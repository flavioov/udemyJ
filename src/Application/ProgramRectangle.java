package Application;

import Entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class ProgramRectangle {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner keyboarInput = new Scanner(System.in);

        Rectangle geometricForm;
        geometricForm = new Rectangle();

        System.out.println("Enter the rectangle properties: ");
        System.out.print("Width: ");
        geometricForm.width = keyboarInput.nextDouble();

        System.out.print("Height: ");
        geometricForm.height = keyboarInput.nextDouble();

        System.out.printf("AREA = %.2f%n", geometricForm.area());
        System.out.printf("DIAGONAL = %.2f%n", geometricForm.diagonal());
        System.out.printf("PERIMETER = %.2f%n", geometricForm.perimeter());

    }
}
