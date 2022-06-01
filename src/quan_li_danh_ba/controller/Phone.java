package quan_li_danh_ba.controller;

import quan_li_danh_ba.service.IPhoneBookService;
import quan_li_danh_ba.service.PhoneBookService;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        IPhoneBookService phoneBookService= new PhoneBookService();
        do{
            System.out.println("---CHƯƠNG TRÌNH QUẢN LÍ DANH BẠ---");
            System.out.println("1. Xem danh bạ");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Đọc từ file");
            System.out.println("7. Ghi từ file");
            System.out.println("8. Thoát");
            System.out.println("Chọn chức năng:");
            int choose= Integer.parseInt(scanner.nextLine());

            switch (choose){
                case 1:
                    phoneBookService.displays();
                    break;
                case 2:
                    phoneBookService.addNew();
                    break;
                case 3:
                    phoneBookService.update();
                    break;
                case 4:
                    phoneBookService.delete();
                    break;
                case 5:
                    phoneBookService.search();
                    break;
                case 6:
                    phoneBookService.readFile();
                    break;
                case 7:
                    phoneBookService.writeFile();
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Bạn chọn lại. Không có chức năng này");
            }
        }while(true);

    }
}
