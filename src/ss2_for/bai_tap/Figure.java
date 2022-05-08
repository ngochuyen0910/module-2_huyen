package ss2_for.bai_tap;

import java.util.Scanner;

public class Figure {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the triangle");
            System.out.println("3. Draw the triangle");
            System.out.println("4. Draw the isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập chiều dài");
                    int length = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập chiều rộng");
                    int width = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < width; i++) {
                        for (int j = 0; j < length; j++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 2:
                    System.out.println("Nhập chiều cao");
                    int height = Integer.parseInt(scanner.nextLine());
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    System.out.println(" ");
                    for (int i = height; i > 0; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    System.out.println(" ");
                    for (int i = 1; i <= height; i++) {
                        for (int k = i; k < height; k++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    System.out.println(" ");
                    for (int i = height; i > 0; i--) {
                        for (int k = i; k < height; k++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 3:
                    System.out.println("Nhập chiều cao");
                    int height1 = Integer.parseInt(scanner.nextLine());
                    for (int i = height1; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 4:
                    System.out.println("Nhập chiều cao");
                    int height2 = Integer.parseInt(scanner.nextLine());
                    for (int i = 1; i <= height2; i++) {
                        for (int k = i; k < height2; k++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i * 2 - 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
            }
        }
    }
}
