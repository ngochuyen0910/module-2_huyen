package ss3_mang.pai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        int[] numArr = {1, 3, 3, 4, 5, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number : ");
        int number = scanner.nextInt();
        System.out.print("Input index : ");
        int index = scanner.nextInt();
        for (int i = numArr.length - 1; i > index; i--) {
            numArr[i] = numArr[i - 1];
        }
        numArr[index] = number;
        System.out.print(Arrays.toString(numArr));
    }
}
