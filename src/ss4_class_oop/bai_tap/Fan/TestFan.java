package ss4_class_oop.bai_tap.Fan;

public class TestFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3, true, 10, "yellow");
        System.out.println(fan1.toString());
        Fan fan2 = new Fan(2, false, 5, "blue");
        System.out.println(fan2.toString());
    }
}
