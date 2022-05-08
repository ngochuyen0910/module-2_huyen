package ss3_mang.pai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        int[] numArr = {1, 3, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int index = numArr.length - 1;
        for (int i = 0; i < numArr.length; i++) {
            if (number == numArr[i]) {
                for (int j = i; j < numArr.length - 1; j++) {
                    numArr[j] = numArr[j + 1];
                }
                numArr[index] = 0;
                i--;
                index--;
            }
        }
        System.out.println(Arrays.toString(numArr));
    }
}
