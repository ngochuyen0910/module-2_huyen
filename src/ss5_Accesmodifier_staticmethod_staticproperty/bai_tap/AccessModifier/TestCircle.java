package ss5_Accesmodifier_staticmethod_staticproperty.bai_tap.AccessModifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Radius is : " + circle.getRadius() + "Area is : "
                + circle.getArea() + "Color is : " + circle.getColor());
        Circle circle1 = new Circle(2, "blue");
        System.out.print("Radius is : " + circle1.getRadius() + "Area is : "
                + circle1.getArea() + "Color is : " + circle1.getColor());
    }
}
