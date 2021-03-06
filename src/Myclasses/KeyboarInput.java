package Myclasses;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public final class KeyboarInput {

    public static Double readDoubleType(String Text) {

        BufferedReader keyboarInput = new BufferedReader(new InputStreamReader(System.in));

        double inputReturn = 0;
        boolean loopControl;

        do {
            try {
                System.out.print(Text);
                inputReturn = Double.parseDouble(keyboarInput.readLine());
                loopControl = false;

            } catch (Exception error) {
                System.out.println("Invalid value! Try a double value!");
                loopControl = true;
            }
        } while (loopControl);

        return inputReturn;
    }

    public static Integer readIntegerType(String text) {

        BufferedReader keyboarInput = new BufferedReader(new InputStreamReader(System.in));

        int inputReturn = 0;
        boolean loopControl;

        do {
            try {
                System.out.print(text);
                inputReturn = Integer.parseInt(keyboarInput.readLine());
                loopControl = false;

            } catch (Exception error) {
                System.out.println("Invalid value! Try a int value!");
                loopControl = true;
            }
        } while (loopControl);

        return inputReturn;
    }

    public static String readAString(String text) {

        BufferedReader keyboarInput = new BufferedReader(new InputStreamReader(System.in));

        String inputReturn = "";
        boolean loopControl;

        do {
            try {
                System.out.print(text);
                inputReturn = keyboarInput.readLine();
                loopControl = false;

            } catch (Exception error) {
                System.out.println("Invalid value! Try a double value!");
                loopControl = true;
            }
        } while (loopControl);

        return inputReturn;
    }

}
