package ss12_java_collection_framework.pai_tap.product.controllect;

import ss12_java_collection_framework.pai_tap.product.service.IProductServices;
import ss12_java_collection_framework.pai_tap.product.service.ProductServices;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        IProductServices productService = new ProductServices();
        do {
            System.out.println("----Danh sách sản phẩm----");
            System.out.println("1.Hiển thị danh sách sản phẩm");
            System.out.println("2.Thêm mới sản phẩm");
            System.out.println("3.Sửa thông tin sản phẩm");
            System.out.println("4.Xóa sản phẩm");
            System.out.println("5.Tìm kiếm sản phẩm");
            System.out.println("6.Sắp xếp sản phẩm tăng dần");
            System.out.println("7.Sắp xếp sản phẩm giảm dần");
            System.out.println("8.Thoát khỏi danh sách");
            System.out.println("Chọn thông tin");
            int choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    productService.displayProducts();
                    break;
                case 2:
                    productService.addNewProducts();
                    break;
                case 3:
                    productService.updateProducts();
                    break;
                case 4:
                    productService.removeProducts();
                    break;
                case 5:
                    productService.searchProducts();
                    break;
                case 6:
                    productService.displaySortUpAscending();
                    break;

                case 7:
                    productService.displaySortDescending();
                    break;
                case 8:
                    System.exit(0);
            }
        } while (true);
    }
}