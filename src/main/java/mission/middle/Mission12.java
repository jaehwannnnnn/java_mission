package mission.middle;

public class Mission12 {
    public static void main(String[] args) {
        Shape shape[] = new Shape[3];
        shape[0] = new Triangle("삼각형", 4.0, 8.0);
        shape[1] = new Circle("원", 5.0);
        shape[2] = new Square("사각형", 4.0, 8.0);
        for (int i = 0; i < shape.length; i++) {
            System.out.println(shape[i].getType() + "의 면적 : " + shape[i].calculateArea());
        }
    }
}
