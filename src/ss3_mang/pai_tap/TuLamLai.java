package ss3_mang.pai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TuLamLai {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = Integer.parseInt(scanner.nextLine());
            i++;
        }
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println("Input number");
        int number = Integer.parseInt(scanner.nextLine());
        boolean flag = true;

        for (i = 0; i < array.length; i++) {
            if (number == array[i]) {
                flag = false;
                break;
            }
        }
        for (; i < array.length-1; i++) {
//            if (i == array.length - 1) {
//                array[i] = 0;
//            } else {
            array[i] = array[i + 1];

        }
        //  }
        array[array.length - 1] = 0;
        if (flag == false) {
            array[array.length - 1] = 0;
        }

        System.out.println(Arrays.toString(array));
    }
}
//    int[] numArr = {1, 3, 3, 4, 5};
//    Scanner scanner = new Scanner(System.in);
//    int number = scanner.nextInt();
//    int index = numArr.length - 1;
//        for (int i = 0; i < numArr.length; i++) {
//        if (number == numArr[i]) {
//        for (int j = i; j < numArr.length - 1; j++) {
//        numArr[j] = numArr[j + 1];
//        }
//        numArr[index] = 0;
//        i--;
//        index--;
//        }
//        }
//        System.out.println(Arrays.toString(numArr));
//        }
//        }