package ss17_IO_binary_file_serialization.bai_tap.quan_li_sp;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {

    private static Scanner scanner = new Scanner(System.in);

    public static void writeToFile(String path, List<ProductsFile> productsFileList) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(productsFileList);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<ProductsFile> readDataFromFile(String path) {
        List<ProductsFile> productFileList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            productFileList = (List<ProductsFile>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return productFileList;
    }

    static List<ProductsFile> productFileList = new ArrayList<>();

    static {
        productFileList.add(new ProductsFile(1, "Gạo", "Việt Nam", 12000));
        productFileList.add(new ProductsFile(2, "Bánh", "Thái Lan", 15000));
        productFileList.add(new ProductsFile(3, "Kẹo", "Hàn Quốc", 10000));
    }

    public static void displays() {
        //writeToFile("src\\ss17_IO_binary_file_serialization\\bai_tap\\sanpham.csv", productFileList);
        readDataFromFile("src\\ss17_IO_binary_file_serialization\\bai_tap\\sanpham.csv");
        for (ProductsFile productsFile : productFileList) {
            System.out.println(productsFile);
        }
    }

    public static void addNew() {
        System.out.println("Nhập mã của sản phẩm: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất: ");
        String production = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        Double price = Double.parseDouble(scanner.nextLine());
        ProductsFile productsFile = new ProductsFile(id, name, production, price);
        productFileList.add(productsFile);
        writeToFile("src\\ss17_IO_binary_file_serialization\\bai_tap\\sanpham.csv", productFileList);
        //displays();
    }

    public static void search() {
        System.out.println("Nhập tên sản phẩm muốn tìm kiếm: ");
        String inputName = scanner.nextLine();
        readDataFromFile("src\\ss17_IO_binary_file_serialization\\bai_tap\\sanpham.csv");
        for (ProductsFile productsFile : productFileList) {
            if (productsFile.getNameProduct().contains(inputName)) {
                System.out.println("Thông tin sản phẩm cần tìm: " + productsFile);
            }
        }
        System.out.println("Sản phẩm không có trong danh sách");
    }
}
