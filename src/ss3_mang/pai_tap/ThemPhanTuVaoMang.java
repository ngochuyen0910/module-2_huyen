package ss3_mang.pai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] numArr = {1, 3, 3, 4, 5, 0, 0, 0, 0, 0};
        Scanner scanner = new Scanner(System.in);
        boolean flag= false;
        int number = scanner.nextInt();
        for (int i = 0; i < numArr.length; i++) {
            if (number == numArr[i]) {
                numArr[i] = numArr[i + 1];
                numArr[i + 1]= numArr[i+2];
            }
        }
        System.out.println(Arrays.toString(numArr));

    }
}
