package secao_00_09.Entities;

public class Employee2 {
    private Integer id;
    private String name;
    private Double salary;

    public Employee2(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setBonus(double bonus) {
        salary *= (1 + (bonus / 100));
    }

}
