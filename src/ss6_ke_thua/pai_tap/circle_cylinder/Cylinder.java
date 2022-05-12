package ss6_ke_thua.pai_tap.circle_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.pow(this.getRadius(), 2) * height * Math.PI;
    }

    @Override
    public String toString() {
        return "Cylinder is height" + height
                + super.toString();
    }
}
