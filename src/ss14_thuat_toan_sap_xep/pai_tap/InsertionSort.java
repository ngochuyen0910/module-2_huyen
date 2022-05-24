package ss14_thuat_toan_sap_xep.pai_tap;

public class InsertionSort {
    static int[] list = {2, 5, 1, 8, 4, 3, 9, 0};

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
    }

    public static void main(String[] args) {
        insertionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
