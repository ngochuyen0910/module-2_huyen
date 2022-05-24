package ss14_thuat_toan_sap_xep.pai_tap;

import java.util.Scanner;

public class InsertSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println("Array after sorting is: ");
        insertionSort(list);
    }

    public static void insertionSort(int[] list) {
        int pos, x;
        for (int i = 1; i < list.length; i++) {
            x = list[i];
            pos = i;
            while (pos > 0 && x < list[pos - 1]) {
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = x;
        }
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
