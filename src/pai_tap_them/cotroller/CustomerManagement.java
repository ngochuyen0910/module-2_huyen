package pai_tap_them.cotroller;

import pai_tap_them.service.CustomerImpl;

import java.util.Scanner;

public class CustomerManagement {
    static CustomerImpl customer = new CustomerImpl();

    public static void menu() {
        do {
            int choose = 0;
            boolean check = true;
            while (check) {
                System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ HÓA ĐƠN TIỀN ĐIỆN");
                System.out.println("1. Thêm mới khách hàng");
                System.out.println("2. Hiển thị thông tin khách hàng");
                System.out.println("3. Tìm kiếm khách hàng");
                System.out.println("4.Thêm mới hóa đơn");
                System.out.println("5. Chỉnh sửa hóa đơn");
                System.out.println("6. Hiển thị thông tin chi tiết hóa đơn");
                System.out.println("7. Thoát");
                System.out.println("Enter your choice: ");
                Scanner scanner = new Scanner(System.in);
                try {
                    choose = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Bạn đã nhập sai, vui lòng nhập lại đi!!");
                }
                switch (choose) {
                    case 1:
                        addCustomer();
                        break;
                    case 2:
                        customer.display();
                        break;
                    case 3:
                        customer.search();
                        break;
                }

            }
        } while (true);
    }

    public static void addCustomer() {
        CustomerImpl customer = new CustomerImpl();
        boolean check = true;
        int choose = 0;
        while (check) {
            System.out.println("1.Thêm khách hàng Việt Nam");
            System.out.println("2. Thêm khách hàng nước ngoài");
            System.out.println("3. Quat lại menu chính");
            Scanner scanner = new Scanner(System.in);
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai. Vui lòng nhập lại đi!!");
            }
            switch (choose) {
                case 1:
                    customer.addCustomerVN();
                    break;
                case 2:
                    customer.addForeignCustomer();
                case 3:
                    menu();
                default:
                    System.out.println("Không có chức năng này!! Bạn chọn lại đi");
            }
        }
    }
}