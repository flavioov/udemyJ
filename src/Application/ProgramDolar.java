package Application;

import Entities.CurrencyConverterRealToDollar;
import Myclasses.KeyboarInput;

import java.text.DecimalFormat;
import java.util.Locale;

public class ProgramDolar {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        CurrencyConverterRealToDollar ammount = new CurrencyConverterRealToDollar();

        ammount.dolarPrice = KeyboarInput.readDoubleType("What is the dollar price ?: ");
        ammount.quantityToBeBought = KeyboarInput.readDoubleType("How many dollars will be bought?: ");

        System.out.println("Amount to be paid in reais = " + new DecimalFormat("#.##").format(ammount.quantityInReals()));

    }
}
