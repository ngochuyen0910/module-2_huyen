package ss12_java_collection_framework.pai_tap.product.service;

import product_management.model.Product;
import ss12_java_collection_framework.pai_tap.product.model.Products;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductServices implements IProductServices {
    private Scanner scanner = new Scanner(System.in);
    static List<Products> productList = new ArrayList<>();

    static {
        productList.add(new Products(1, "Gạo",12000));
        productList.add(new Products(2, "Mắm",5000));
        productList.add(new Products(3, "Muối",16000));
        productList.add(new Products(4, "Đường",17000));
        productList.add(new Products(5, "Sữa",12000));
    }

    @Override
    public void displayProducts() {
        System.out.println("Danh sách sản phẩm: ");
        for(Products product:productList){
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
}
