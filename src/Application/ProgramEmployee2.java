package Application;

import Entities.Employee2;
import Entities.KeyboarInput;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class ProgramEmployee2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Object> listOfEmployees = new ArrayList<Object>();
        Employee2 employee;

        int numberOfEmployees = KeyboarInput.
                readIntegerType("How many employees will be registered? ");

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.printf("Employee #%s:%n", i++);

            employee = new Employee2(
                    KeyboarInput.readIntegerType("Id: "),
                    KeyboarInput.readAString("Name: "),
                    KeyboarInput.readDoubleType("Salary: "));

            listOfEmployees.add(employee);
        }

        int iddd = listOfEmployees.stream().filter().findFirst().orElse(null);

        for (Object item : listOfEmployees) {
            System.out.println(item.getClass().getName());
        }
    }
}
