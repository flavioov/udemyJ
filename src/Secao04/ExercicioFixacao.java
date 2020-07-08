package Secao04;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Locale;

public class ExercicioFixacao {

    public static void main(String[] args) {

        String product1Name = "computer";
        String product2Name = "Office desk";

        int age = 30;
        int code = 5290;
        String gender = "F";

        double price1 = 2100.00;
        double price2 = 650.50;
        double measure = 53.234567;
        Locale.setDefault(Locale.US);
//
//        System.out.println(product(price1, product1Name, price2, product2Name));
//        System.out.println();
//        System.out.println(record(age, code, gender));
//        System.out.println(measure(measure));
//        System.out.println(rounded(measure));
//        System.out.println(usDecimal(measure));
        System.out.println();

    }

//    @Contract(pure = true)
//    public static @NotNull String record(int age, int code, String gender) {
//        return "Record: " + age + " years old, code " + code + " and gender: " + gender;
//
//    }
//
//    @Contract(pure = true)
//    public static @NotNull String product(double productOnePrice, String produc1tName, double productTwoPrice, String product2Name) {
//        return "Products: \n" + produc1tName + ", which price is $ " + productOnePrice + "\n" +
//                product2Name + ", wich price is " + productTwoPrice;
//    }
//
//    public static String measure(double medida) {
//        return String.format("Measure with eight decimal places: %.8f", medida);
//    }
//
//    public static String rounded(double measure) {
//        return String.format("Rounded (three decimal places): %.3f", measure);
//    }
//
//    public static String usDecimal(double measure) {
//        return String.format("US decimal point: %", measure);
//    }
}
