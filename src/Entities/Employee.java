package Entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;
    double salaryBonus;

    public double netIncome () {
        return this.grossSalary + this.salaryBonus - this.tax;
    }

    public void addBonus (double salaryBonus) {
        this.salaryBonus += (this.grossSalary * (salaryBonus/100));
    }

    public String toString() {
        return this.name + ", $ " + String.format("%.2f%n", netIncome());
    }

}
