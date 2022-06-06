package bai_tap.quan_li_cong_ty.controller;

import bai_tap.quan_li_cong_ty.service.PersonServiceImpl;

import java.util.Scanner;

public class QuanLyCongTy {
    public static int choose = 0;
    public static Scanner scanner = new Scanner(System.in);

    public static int checkException(int inputChoose) {
        boolean check = false;
        do {
            try {
                inputChoose = Integer.parseInt(scanner.nextLine());
                check = false;
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại: ");
                check = true;
            }
        } while (check);
        return inputChoose;
    }

    public static void menu() {
        PersonServiceImpl personService = new PersonServiceImpl();
        do {
            System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ CÔNG TY---");
            System.out.println("1. Hiển thị danh sách nhân viên");
            System.out.println("2. Thêm mới nhân viên ");
            System.out.println("3. Xóa nhân viên");
            System.out.println("4. Tìm kiếm nhân viên");
            System.out.println("5. Thoát");
            System.out.println("Enter your choice: ");

            switch (checkException(choose)) {
                case 1:
                    personService.display();
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    personService.delete();
                    break;
                case 4:
                    personService.search();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Không có chức năng này!! Bạn chọn lại đi!!!");
            }

        } while (true);
    }

    public static void add() {
        PersonServiceImpl personService = new PersonServiceImpl();
        do {
            System.out.println("1. Thêm mới nhân viên quản lý");
            System.out.println("2. Thêm mới nhân viên sản xuất");
            System.out.println("3. Quay lại menu chính");

            switch (checkException(choose)) {
                case 1:
                    personService.addManagementStaff();
                    break;
                case 2:
                    personService.addProductionStaff();
                    break;
                case 3:
                    menu();
                default:
                    System.out.println("Không có chức năng này!! Bạn chọn lại đi");
            }
        } while (true);
    }
}