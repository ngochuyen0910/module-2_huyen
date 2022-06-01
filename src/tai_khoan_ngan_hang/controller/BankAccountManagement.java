package tai_khoan_ngan_hang.controller;

import tai_khoan_ngan_hang.service.Impl.PayAccountServiceImpl;
import tai_khoan_ngan_hang.service.Impl.SavingAccountServiceImpl;

import java.util.Scanner;

public class BankAccountManagement {

    public static void menu() {
        do {
            int choose = 0;
            boolean check = true;
            while (check) {
                System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ TÀI KHOẢN NGÂN HÀNG");
                System.out.println("1. Thêm mới tài khoản");
                System.out.println("2. Xóa tài khoản");
                System.out.println("3. Xem danh sách tài khoản");
                System.out.println("4. Tìm kiếm tài khoản");
                System.out.println("5. Thoát");
                System.out.println("Enter your choice: ");
                Scanner scanner = new Scanner(System.in);
                try {
                    choose = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Bạn đã nhập sai, vui lòng nhập lại đi!!");
                }
                switch (choose) {
                    case 1:
                        addBankAccount();
                        break;
                    case 2:
                        //savingAccount.add();
                        break;
                    case 3:
                        //customer.search();
                        break;
                }

            }
        } while (true);
    }

    public static void addBankAccount() {
        SavingAccountServiceImpl savingAccount = new SavingAccountServiceImpl();
        PayAccountServiceImpl payAccount = new PayAccountServiceImpl();
        boolean check = true;
        int choose = 0;
        while (check) {
            System.out.println("1. Thêm mới tài khoản tiết kiệm");
            System.out.println("2. Thêm mới tài khoản thanh toán");
            System.out.println("3. Quay lại menu chính");
            Scanner scanner = new Scanner(System.in);
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai. Vui lòng nhập lại đi!!");
            }
            switch (choose) {
                case 1:
                    savingAccount.add();
                    break;
                case 2:
                    payAccount.add();
                case 3:
                    menu();
                default:
                    System.out.println("Không có chức năng này!! Bạn chọn lại đi");
            }
        }
    }
}

