package ss7_abstractClass_interface.bai_tap.resizeable;

public class Test {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 10);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(x, x, "blue", true);
        shapes[1] = new Circle(x, "red", false);
        shapes[2] = new Square(x, "white", true);
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        for (Shape shape : shapes) {
            shape.resize(Math.random() * 100);
        }
        Shape.printShape(shapes);
    }
}
