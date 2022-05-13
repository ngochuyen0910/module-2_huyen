package ss7_abstractClass_interface.bai_tap.resizeable;

public class Square extends Shape {
    private double side = 1.0;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square( double side,String color, boolean filled) {
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
    public void resize(double percent) {
        this.side *= percent/100;
    }

}
