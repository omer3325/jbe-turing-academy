package Tasks.Employee;

public class Employee {

    private double salary;
    private String name;

    public Employee (String name, double salary){
        this.salary = salary;
        this.name = name;

    }

    public double getSalary() {
        return salary;
    }

    public void  setSalary(int salary){
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void displayInfo(){
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
    }

    public double calculateBonus (double percentage){
        return salary * percentage / 100;
    }



}
