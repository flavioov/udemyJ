package secao_00_09.Entities;

public class Student {
    public String studentName;
    public double firstTest;
    public double secondTest;
    public double thirdTest;

    public double average() {
        return (firstTest + secondTest + thirdTest);
    }

    private String status() {
        return average() < 60 ? "FAILED" : "PASS";
    }

    private double pendignPoints() {
        return 60 - average();
    }

    public String toString() {
        return status().equals("FAILED") ? String.format("%s%nMISSING %.2f POINTS%n", status(), pendignPoints()) : "PASS" ;
    }

}
