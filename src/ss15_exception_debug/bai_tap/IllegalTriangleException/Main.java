package ss15_exception_debug.bai_tap.IllegalTriangleException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Nhập vào cạnh thứ 1 của tam giác");
                double edge1 = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập vào cạnh thứ 2 của tam giác");
                double edge2 = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập vào cạnh thứ 3 của tam giác");
                double edge3 = Double.parseDouble(scanner.nextLine());
                Triangle triangle = new Triangle(edge1, edge2, edge3);
                System.out.println(triangle);
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("Giá trị nhập vào không phải cạnh của tam giác! Bạn nhập lại đi!!");
            } catch (IllegalRightTriangleException e) {
                System.out.println(e.getMessage());
                System.out.println("Bạn nhập lại đi !!");
            }
        }
    }
}
