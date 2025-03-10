package mission;

public abstract class Shape {
    public String type;
    public double area;

    public String getType() {
        return type;
    }

    public Shape(String type) {
        this.type = type;
    }
    public abstract double calculateArea();
}
