package ss7_abstractClass_interface.bai_tap.colorable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Square();
        shapes[1] = new Rectangle();
        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Square) {
                Colorable colorable = (Square) shape;
                System.out.println(colorable.howToColor());
            }
        }
    }
}
