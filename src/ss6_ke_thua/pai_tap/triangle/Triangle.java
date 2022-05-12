package ss6_ke_thua.pai_tap.triangle;

public class Triangle extends Shape {
    private float side1=1;
    private float side2=1;
    private float side3=1;

    public Triangle(float side1, float side2, float side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public Triangle(){

    }

    public Triangle(String color, float side1, float side2, float side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public float getSide1() {
        return side1;
    }

    public void setSide1(float side1) {
        this.side1 = side1;
    }

    public float getSide2() {
        return side2;
    }

    public void setSide2(float side2) {
        this.side2 = side2;
    }

    public float getSide3() {
        return side3;
    }

    public void setSide3(float side3) {
        this.side3 = side3;
    }

}
