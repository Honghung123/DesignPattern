package main.com.Creational_Pattern.Prototype;

public class EmployeeRecords implements Prototype{
    private int id;
    private String name;
    private String description;
    private Double salary;
    private String address;

    public EmployeeRecords() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public EmployeeRecords(int id, String name, String description, Double salary, String address) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.salary = salary;
        this.address = address;
    }

    public EmployeeRecords(EmployeeRecords clone) {
        this.id = clone.id;
        this.name = clone.name;
        this.description = clone.description;
        this.salary = clone.salary;
        this.address = clone.address;
    }

    public void showRecord() {
        System.out.println("Id: "+ this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Description: " + this.description);
        System.out.println("Salary: " + this.salary);
        System.out.println("Address: " + this.address);
    }

    public Prototype getClone() {
        return new EmployeeRecords(this);
    }
}
