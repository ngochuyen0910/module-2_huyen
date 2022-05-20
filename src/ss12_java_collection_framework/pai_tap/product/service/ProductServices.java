package ss12_java_collection_framework.pai_tap.product.service;

import ss12_java_collection_framework.pai_tap.product.model.Products;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductServices implements IProductServices {
    private final Scanner scanner = new Scanner(System.in);
    static List<Products> productList = new ArrayList<>();

    static {
        productList.add(new Products(1, "Gạo", 12000));
        productList.add(new Products(6, "Mắm", 5000));
        productList.add(new Products(7, "Muối", 16000));
        productList.add(new Products(4, "Đường", 17000));
        productList.add(new Products(5, "Sữa", 12000));
    }

    @Override
    public void displayProducts() {
        System.out.println("Danh sách sản phẩm: ");
        for (Products product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void displaySortUpAscending() {
        Collections.sort(productList, new ComparatorProduct());
        System.out.println("Danh sách sản phẩm: ");
        for (Products product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void displaySortDescending() {
        Collections.sort(productList, new ComparatorDecreaseProduct());
        System.out.println("Danh sách sản phẩm: ");
        for (Products product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void addNewProducts() {
        int id = productList.get(productList.size() - 1).getId() + 1;
        System.out.println("Nhâp tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá: ");
        double price = Double.parseDouble(scanner.nextLine());
        Products product = new Products(id, name, price);
        productList.add(product);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void searchProducts() {
        int temp = 0;
        System.out.println("Tên sản phẩm muốn tìm");
        String inputSearch = scanner.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getNameProduct().contains(inputSearch)) {
                System.out.println(productList.get(i));
                temp++;
            }
        }
        if (temp == 0) {
            System.out.println("Không tìm thấy");
        }
    }

    @Override
    public void removeProducts() {
        int temp = 0;
        System.out.println("Nhập id cần xóa: ");
        int inputId = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == inputId) {
                productList.remove(inputId - 1);
                System.out.println("Xóa sản phẩm thành công");
                temp++;
            }
            if (temp == 0) {
                System.out.println("Xóa không thành công");
            }
        }
    }

    @Override
    public void updateProducts() {
        System.out.println("Vị trí bạn muốn sửa");
        int inputId = Integer.parseInt(scanner.nextLine());
        for (Products products : productList) {
            if (products.getId() == inputId) {
                System.out.println("Nhập tên sản phẩm");
                String name = scanner.nextLine();
                System.out.println("Nhập giá");
                int price = Integer.parseInt(scanner.nextLine());
                products.setNameProduct(name);
                products.setPrice(price);
                System.out.println(productList);
            }
        }
    }
}