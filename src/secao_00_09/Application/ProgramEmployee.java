package secao_00_09.Application;

import secao_00_09.Entities.Employee;
import Myclasses.KeyboarInput;

import java.util.Locale;

public class ProgramEmployee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        //Keyboard input
        KeyboarInput someString, someNumber;

        //input
        Employee employee1;
        employee1 = new Employee();

        employee1.name = KeyboarInput.readAString("name: ");
        employee1.grossSalary = KeyboarInput.readDoubleType("Gross Salary: ");
        employee1.tax = KeyboarInput.readDoubleType("Tax: ");
        System.out.println("Update data: " + employee1);

        employee1.addBonus(KeyboarInput.readDoubleType("Which percentage to increase the salary?: "));
        System.out.println("Update data: " + employee1);
    }
}
