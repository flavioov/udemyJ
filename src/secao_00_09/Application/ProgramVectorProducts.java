package secao_00_09.Application;

import secao_00_09.Entities.Product2;
import Myclasses.KeyboarInput;

import java.text.DecimalFormat;
import java.util.Locale;

public class ProgramVectorProducts {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Product2[] vect = new Product2[KeyboarInput.readIntegerType("Vector size: ")];
        double sum = 0;
        double avg = (sum / vect.length);

        for (int i = 0; i < vect.length; i++) {
            String productName = KeyboarInput.readAString("product name: ");
            double productPrice = KeyboarInput.readDoubleType("Product price: ");
            vect[i] = new Product2(productName, productPrice);
        }

        for (Product2 product2 : vect) {
            sum += product2.getPrice();
        }

        System.out.println("Average Price = " + new DecimalFormat("0.00").format(avg));
    }
}
