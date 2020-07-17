package Entities;

public class Employee2 {
    private static int id;
    private static String name;
    private double salary;

    public Employee2(int id, String name, double salary) {
        Employee2.id = id;
        Employee2.name = name;
        this.salary = salary;
    }

    public static int getId() {
        return id;
    }

    public static String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setBonus(double bonus) {
        this.salary *= (1 + (bonus/100));
    }

}
