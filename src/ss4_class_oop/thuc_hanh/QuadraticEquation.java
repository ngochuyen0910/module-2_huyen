package ss4_class_oop.thuc_hanh;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        if (this.getDiscriminant() < 0) {
            return 0;
        } else {
            return (-b + Math.sqrt(this.getDiscriminant())) / (2 * a);
        }
    }

    public double getRoot2() {
        if (this.getDiscriminant() < 0) {
            return 0;
        } else {
            return (-b - Math.sqrt(this.getDiscriminant())) / (2 * a);
        }
    }

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


