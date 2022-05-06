package ss3_mang.pai_tap;

import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        int[] numArr1 = {1, 3, 3, 4, 5};
        int[] numArr2 = {2, 3, 5, 6, 7};
        int[] numArr3 = new int[10];
        int pos = 0;
        for (int element : numArr1) {
            numArr3[pos] = element;
            pos++;
        }
        for (int element : numArr2) {
            numArr3[pos] = element;
            pos++;
        }
        System.out.println(Arrays.toString(numArr3));
    }
}
