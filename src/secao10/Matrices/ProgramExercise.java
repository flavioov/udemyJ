package secao10.Matrices;

import java.util.Locale;
import java.util.Scanner;

public class ProgramExercise {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int iRows = input.nextInt();
        int jColumns = input.nextInt();
        int[][] matrix = new int[iRows][jColumns];
        int searchFor;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        searchFor = input.nextInt();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == searchFor) {
                    System.out.printf("Position %d,%d%n", i, j);
                    //left
                    printMessageIfNotNull("Left: ", exceptionHandler(matrix, i, j - 1));
                    //right
                    printMessageIfNotNull("Right: ", exceptionHandler(matrix, i, j + 1));
                    //Up
                    printMessageIfNotNull("Up: ", exceptionHandler(matrix, i - 1, j));
                    //Down
                    printMessageIfNotNull("Down: ", exceptionHandler(matrix, i +1, j));
                    System.out.println();
                }

            }
        }

        System.out.println();

    }

    private static Integer exceptionHandler(int[][] matriz, int i, int j) {
        Integer positionValue;
        try {
            positionValue = matriz[i][j];
        } catch (ArrayIndexOutOfBoundsException err) {
            positionValue = null;
        }
        return positionValue;
    }

    private static void printMessageIfNotNull(String text, Integer entrada) {
        if (entrada != null) {
            System.out.printf("%s%d%n",text, entrada);
        }
    }

}

