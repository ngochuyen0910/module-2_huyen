package ss13_thuat_toan_tim_kiem.pai_tap.tim_kiem_nhi_phan_sd_de_quy;

public class BinarySearch {
    public static int binarySearch(int[] arr, int keySearch) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (high >= low) {
            mid = (low + high) / 2;
            if (arr[mid] < keySearch) {
                low = mid + 1;
            } else if (arr[mid] > keySearch) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 6, 7, 8, 9};
        System.out.println(binarySearch(array, 7));
    }
}
