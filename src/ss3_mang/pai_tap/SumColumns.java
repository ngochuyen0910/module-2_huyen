package ss3_mang.pai_tap;

import java.util.Scanner;

public class SumColumns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Chiều dài của mảng là : ");
        int length = Integer.parseInt(input.nextLine());
        System.out.println("Chiều rộng của mảng là : ");
        int width = Integer.parseInt(input.nextLine());

        int[][] array = new int[width][];
        for (int i = 0; i < width; i++) {
            array[i] = new int[length];
            for (int j = 0; j < length; j++) {
                System.out.print("Nhập phần tử mảng : ");
                array[i][j] = Integer.parseInt(input.nextLine());
            }
        }
        System.out.println("Mảng 2 chiều : ");
        for (int[] item : array) {
            for (int anInt : item) {
                System.out.print(anInt + " ");
            }
            System.out.print(" ");
        }
        int total = 0;
        System.out.print("Cột muốn tính tổng là : ");
        int column = Integer.parseInt(input.nextLine());
        for (int[] item : array) {
            total = total + item[column];
        }
        System.out.print("Tổng giá trị của cột " + column + " là: " + total);
    }
}
