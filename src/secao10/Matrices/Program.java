package secao10.Matrices;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[][] mat = new int[n][n];
        double mainDiagonal = 0;


        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length ; j++) {
                mat[i][j] = input.nextInt();

            }
        }

        System.out.println("Main diagonal");
        for (int i = 0; i < mat.length; i++) {
            System.out.println(mat[i][i] + " ");
        }

        int count = 0;
        for (int[] ints : mat) {
            for (int anInt : ints) {
                if (anInt < 0) {
                    count++;
                }
            }
        }

        System.out.println("Negative elements: " + count);
    }
}
