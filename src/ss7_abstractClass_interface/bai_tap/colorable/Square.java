package ss7_abstractClass_interface.bai_tap.colorable;

public class Square extends Shape implements Colorable {
    private double side = 2.0;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "A square with side " +
                side +
                "Area is " +
                getArea() +
                ", which is a subclass of " +
                super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
