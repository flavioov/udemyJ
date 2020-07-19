package secao_00_09.Application;

import secao_00_09.Entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class ProgramProduct {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the product data: ");

        System.out.print("name: ");
        String name = sc.nextLine();

        System.out.print("price: ");
        double price = sc.nextDouble();

        System.out.print("quantity: ");
        int addProducts = sc.nextInt();

        Product product = new Product(name, price, addProducts);
        System.out.println();

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.print("Enter the number of products to be added: ");
        product.setAddProducts(sc.nextInt());
        System.out.println("Product data: " + product);

        System.out.print("Enter the number of products to be removed: ");
        product.setRemoveProducts(sc.nextInt());
        System.out.println("Product data: " + product);

        sc.close();
    }
}
