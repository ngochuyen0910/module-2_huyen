package pai_tap_lon.controller;

import pai_tap_lon.service.IPersonIService;
import pai_tap_lon.service.IService;
import pai_tap_lon.service.Impl.PersonServiceImplArrayList;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        IService iPersonIService = new PersonServiceImplArrayList();
        System.out.println("1. Hiển thị nhân viên");
        System.out.println("2. Sắp xếp lương tăng dần");
        System.out.println("3. Sắp xếp lương giảm dần");
        System.out.println("4.Sắp xếp theo tên");
        System.out.println("Chọn mục hiển thị");
        do {
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iPersonIService.display();
                    break;
                case 2:
                    iPersonIService.sort();
                    iPersonIService.display();
                    break;
                case 3:
                    iPersonIService.sortGiam();
                    iPersonIService.display();
                    break;
                case 4:
                    iPersonIService.sortName();
                    iPersonIService.display();
            }
        } while (true);
    }
}