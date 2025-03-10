package mission.middle;

public class Circle extends Shape {
    private double radius;
    public Circle(String type, double radius) {
        super("원");
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        this.area = Math.PI * radius * radius;
        return this.area;
    }
}
