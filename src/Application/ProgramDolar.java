package Application;

import Entities.CurrencyConverterRealToDollar;
import Entities.KeyboarInput;

import java.text.DecimalFormat;
import java.util.Locale;

public class ProgramDolar {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        KeyboarInput input = new KeyboarInput();

        CurrencyConverterRealToDollar ammount = new CurrencyConverterRealToDollar();

        ammount.dolarPrice = input.readDoubleType("What is the dollar price ?: ");
        ammount.quantityToBeBought = input.readDoubleType("How many dollars will be bought?: ");

        System.out.println("Amount to be paid in reais = " + new DecimalFormat("#.##").format(ammount.quantityInReals()));

    }
}
