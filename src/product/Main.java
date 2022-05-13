package product;

import java.util.Scanner;

public class Main {
    public static Product[] productList = new Product[100];
    public static int count;
    static Scanner scanner = new Scanner(System.in);

    static {
        productList[0] = new Product(1, "Iphone", 1000, 10, "Apple");
        productList[1] = new Product(2, "SamSung", 1000, 10, "SamSung");
        productList[2] = new Product(3, "Sony", 1000, 10, "Sony");
        productList[3] = new Product(4, "Dell", 1000, 10, "Dell");
        productList[4] = new Product(5, "Nokia", 1000, 10, "Nokia");
        count = 5;
    }

    public static void displayList() {
        for (Product item : productList) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }

    public static void addNewProduct() {
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập giá");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số lượng");
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập nhà sản xuất");
        String production = scanner.nextLine();

        Product product = new Product(count + 1, name, price, amount, production);
        productList[count] = product;
        count++;
    }

    public static void updateProduct() {
        System.out.println("Vị trí bạn muốn sửa");
        int inputUp = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productList.length; i++) {
            if (productList[i] != null && productList[i].getId() == inputUp) {
                System.out.println("Nhập tên");
                String name = scanner.nextLine();
                System.out.println("Nhập giá");
                double price = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập số lượng");
                int amount = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập nhà sản xuất");
                String production = scanner.nextLine();
                productList[i] = new Product(i + 1, name, price, amount, production);
                System.out.println("Sửa thành công");
            }
        }
    }

    public static void searchProduct() {
        int temp = 0;
        System.out.println("Tên muốn tìm");
        String inputSearch = scanner.nextLine();
        for (int i = 0; i < productList.length; i++) {
            if (productList[i] != null && productList[i].getName().contains(inputSearch)) {
                System.out.println(productList[i]);
                temp++;
            }
        }
        if (temp == 0) {
            System.out.println("Không tìm thấy");
        }
    }

    public static void deleteProduct() {
        int temp = 0;
        System.out.println("Nhập id muốn xóa");
        int inputSearch = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productList.length; i++) {
            if (productList[i] != null && productList[i].getId() == inputSearch) {
                for (int j = i; j < productList.length && productList[j] != null; j++) {
                    productList[j] = productList[j + 1];
                }
                System.out.println("Xoá thành công");
                temp++;
            }
            if (temp == 0) {
                System.out.println("Xóa không thành công");
            }
        }
    }

    public static void main(String[] args) {
        do {
            System.out.println("Product Management");
            System.out.println("1. Display list Product");
            System.out.println("2. Add new Product");
            System.out.println("3. Search Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Update Product");
            System.out.println("6.Exit");
            System.out.println("Choose options: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Display list");
                    displayList();
                    break;
                case 2:
                    System.out.println("Add new");
                    addNewProduct();
                    break;
                case 3:
                    System.out.println("Search");
                    searchProduct();
                    break;
                case 4:
                    System.out.println("Delete");
                    deleteProduct();
                    break;
                case 5:
                    System.out.println("Update");
                    updateProduct();
                    break;
                case 6:
                    System.exit(0);
            }
        } while (true);
    }
}


