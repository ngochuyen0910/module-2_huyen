package ss3_mang.pai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] numArr = {1, 3, 3, 4, 5, 0};
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int index = scanner.nextInt();
        for (int i = numArr.length - 1; i > index; i--) {
            numArr[i] = numArr[i - 1];
        }
        numArr[index] = number;
        System.out.print(Arrays.toString(numArr));
    }
}
