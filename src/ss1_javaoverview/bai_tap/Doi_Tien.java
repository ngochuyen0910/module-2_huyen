package ss1_javaoverview.bai_tap;

import java.util.Scanner;

public class Doi_Tien {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền USD: ");
        usd = scanner.nextDouble();
        double quiDoi = usd * 23000;
        System.out.print("Giá tiền VND: " + quiDoi);
    }
}
