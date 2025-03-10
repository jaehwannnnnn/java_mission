package mission.middle;

public class Employee {
    private String name;
    private int salary;
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public void displayInfo() {
        System.out.println("이름 : " + this.name);
        System.out.println("급여 : " + this.salary);
    }
}
