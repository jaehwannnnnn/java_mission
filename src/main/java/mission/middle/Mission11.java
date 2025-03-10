package mission.middle;

public class Mission11 {
    public static void main(String[] args) {
        Employee employee = new Employee("정재환", 5000);
        Manager manager = new Manager("홍길동", 10000, "관리자");
        employee.displayInfo();
        manager.displayInfo();
    }
}
