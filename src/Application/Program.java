package Application;

import Entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        //entrada
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;

//      instanciando --> criando objeto triângulo
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the mmeasures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the mmeasures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        sc.close();

        //processamento

        String biggerOne = x.area() > y.area() ? "Larger area: X" : "Larger area: Y";

        //saida

        System.out.printf("Triangle X area: %.4f%n", x.area());
        System.out.printf("Triangle Y area: %.4f%n", y.area());
        System.out.println(biggerOne);

    }
}