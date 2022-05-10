package ss4_class_oop.bai_tap.quadratic_equation;

import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a : ");
        double a = scanner.nextDouble();
        System.out.print("Input b : ");
        double b = scanner.nextDouble();
        System.out.print("Input c : ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("The equation has no roots");
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("The equation has one roots :" + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has two roots :");
            System.out.println("Data: " + quadraticEquation.getDiscriminant());
            System.out.println("Root1: " + quadraticEquation.getRoot1());
            System.out.println("Root2: " + quadraticEquation.getRoot2());
        }
    }
}