package mission;

public class Manager extends Employee {
    private String position;
    public Manager(String name, int salary, String position) {
        super(name, salary);
        this.position = position;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("직책 : " + this.position);
    }
}
