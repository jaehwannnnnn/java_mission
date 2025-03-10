package mission;

public class Triangle extends Shape{
    private double width;
    private double height;

    public Triangle(String type, double width, double height) {
        super("삼각형");
        this.height = height;
        this.width = width;
    }
    @Override
    public double calculateArea() {
        area = width * height / 2;
        return area;
    }
}
