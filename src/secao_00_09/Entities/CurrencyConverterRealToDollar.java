package secao_00_09.Entities;

public class CurrencyConverterRealToDollar {
    public double dolarPrice;
    public double quantityToBeBought;

    public static final double IOF = 1.06;

    public double quantityInReals() {
        return dolarPrice * quantityToBeBought * IOF;
    }

}
