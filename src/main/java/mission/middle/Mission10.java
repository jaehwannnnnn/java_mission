package mission.middle;

public class Mission10 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12.3, 13.4);

        double area = rectangle.area();
        double circumference = rectangle.circumference();
        System.out.printf("넓이 : %.2f\n", area);
        System.out.printf("둘레 : %.2f\n", circumference);
    }
}
