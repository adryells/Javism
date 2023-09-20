package IFMA_2019;

import java.util.Date;

public class PlayingGetAndSetMethods {

    public static void main(String[] args) {
        System.out.println("Initializing...");
    }

    private String name;
    private String department;
    private double salary;
    private String date;
    private String rg;

    public String getName() {
        return this.name;
    }

    public String getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    public String getDate() {
        return this.date;
    }

    public String getRg() {
        return this.rg;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    private double annualEarnings;

    private double increasedSalary;

    public double getIncreasedSalary() {
        return this.increasedSalary;
    }

    public void setIncreasedSalary(double increasedAmount) {
        this.increasedSalary = this.salary + increasedAmount;
    }

    public double getAnnualEarnings() {
        return this.annualEarnings;
    }

    public void setAnnualEarnings() {
        this.annualEarnings = this.salary * 12;
    }
}

class Outputer{
    public static void main(String[] args) {
        PlayingGetAndSetMethods oi = new PlayingGetAndSetMethods();

        oi.setName("Adryell");
        System.out.println(oi.getName());

        oi.setSalary(5000);
        oi.setAnnualEarnings();
        System.out.println(oi.getSalary());
        System.out.println(oi.getAnnualEarnings());

        oi.setDate(new Date().toString());
        System.out.println(oi.getDate());

        oi.setIncreasedSalary(20);
        System.out.println(oi.getIncreasedSalary());

        oi.setDepartment("World");
        System.out.println(oi.getDepartment());

        oi.setRg("2isw8wh3");
        System.out.println(oi.getRg());
    }
}
