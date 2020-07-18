package Application;

import Entities.Employee2;
import Entities.KeyboarInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class ProgramEmployee2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        /*Especificação do tipo da lista*/
        List<Employee2> listOfEmployees = new ArrayList<>();
        Employee2 employee;

        int numberOfEmployees = KeyboarInput.
                readIntegerType("How many employees will be registered? ");

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.printf("Employee #%s:%n", i + 1);

            int id = KeyboarInput.readIntegerType("Id: ");
            String nome = KeyboarInput.readAString("Name: ");
            double salario = KeyboarInput.readDoubleType("Salary: ");

            employee = new Employee2(id, nome, salario);
            listOfEmployees.add(i, employee);
        }

        int employeeId = KeyboarInput.readIntegerType("\nEnter the employee id that will have salary increase: ");

        Integer position = idPosition(listOfEmployees, employeeId);


        if (Objects.isNull(position)) {
            System.out.println("\nId does not exist");

        } else {
            double bonus = KeyboarInput.readDoubleType("\nEnter the percentage: ");
            listOfEmployees.get(position).setBonus(bonus);
        }

        System.out.println("\nList of employees:");

        for (Employee2 employeeData : listOfEmployees) {
            System.out.printf("%d, %s, %.2f%n", employeeData.getId(), employeeData.getName(), employeeData.getSalary());
        }
    }

    /*
    recebe lista e valor para procurar
    Retorna a posição do funcionário na lista
    */
    public static Integer idPosition(List<Employee2> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}

