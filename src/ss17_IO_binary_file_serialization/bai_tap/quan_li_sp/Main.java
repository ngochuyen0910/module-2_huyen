package ss17_IO_binary_file_serialization.bai_tap.quan_li_sp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        do {
            System.out.println("---QUẢN LÝ SẢN PHẨM---");
            System.out.println("1.Thêm mới sản phẩm");
            System.out.println("2. Hiển thị sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm");
            System.out.println("4.Thoát khỏi chương trình");
            Scanner scanner = new Scanner(System.in);
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    ProductManager.addNew();
                    break;
                case 2:
                    ProductManager.displays();
                    break;
                case 3:
                    ProductManager.search();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng chọn lại!!");
            }
        } while (true);
    }
}
