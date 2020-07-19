package Application;


import Myclasses.KeyboarInput;

import java.text.DecimalFormat;
import java.util.Locale;

public class ProgramVector {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int n = KeyboarInput.readIntegerType("Vector size: ");
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            vect[i] = KeyboarInput.readDoubleType(": ");
        }

        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }

        System.out.println("Average = " + new DecimalFormat("0.00").format(sum/n));

    }
}
