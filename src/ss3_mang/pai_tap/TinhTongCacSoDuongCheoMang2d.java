package ss3_mang.pai_tap;

import java.util.Scanner;

public class TinhTongCacSoDuongCheoMang2d {
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
                System.out.print("Các phần tử của mảng là : ");
                array[i][j] = Integer.parseInt(input.nextLine());
            }
        }
        System.out.println("Mảng 2 chiều là : ");
        for (int[] items : array) {
            for (int anInt : items) {
                System.out.print(anInt + " ");
            }
            System.out.print(" ");
        }
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    total = total + array[i][j];
                }
            }
        }
        System.out.println("tổng đường chéo của mảng là :" + total);
    }
}