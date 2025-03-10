package mission;

public class Square extends Shape {
    private double width;
    private double height;

    public Square(String type, double width, double height) {
        super("사각형");
        this.width = width;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        area = width * height;
        return area;
    }
}
