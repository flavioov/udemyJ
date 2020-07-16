package Entities;

public class Triangle {
    public double a;
    public double b;
    public double c;

    //metodo - função
    //não recdbe parametros pq as variaveis estao na classe
    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}