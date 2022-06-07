package bai_tap.quan_li_sinh_vien_giao_vien.controller;

import bai_tap.quan_li_sinh_vien_giao_vien.service.Impl.StudentServiceImpl;
import bai_tap.quan_li_sinh_vien_giao_vien.service.Impl.TeacherServiceImpl;

import java.util.Scanner;

public class QuanLySinhVienGiaoVien {
    static int choose = 0;
    static Scanner scanner = new Scanner(System.in);

    static StudentServiceImpl studentService = new StudentServiceImpl();

    static TeacherServiceImpl teacherService = new TeacherServiceImpl();

    public static int exceptionPerson(int inputChoose) {
        boolean checkChoose = false;
        do {
            try {
                inputChoose = Integer.parseInt(scanner.nextLine());
                checkChoose = false;
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại: ");
                checkChoose = true;
            }
        } while (checkChoose);

        return inputChoose;
    }

    public static void menu() {
        do {
            System.out.println("-----------Manager CodeGym------------");
            System.out.println("1. Xem danh sách giáo viên hoặc sinh viên");
            System.out.println("2. Thêm mới giáo viên hoặc sinh viên");
            System.out.println("3. Xóa giáo viên hoặc sinh viên");
            System.out.println("4. Sắp xếp giáo viên hoặc sinh viên");
            System.out.println("5. Chỉnh sửa giáo viên hoặc sinh viên");
            System.out.println("6. Thoát");
            System.out.println("Enter your choose");

            switch (exceptionPerson(choose)) {
                case 1:
                    displayPerson();
                    break;
                case 2:
                    addPerson();
                    break;
                case 3:
                    deletePerson();
                    break;
                case 4:
                    sortPerson();
                    break;
                case 5:
                    editPerson();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có option này, xin hãy nhập lại");
            }
        } while (true);
    }

    public static void displayPerson() {
        do {
            System.out.println("--------Xem danh sách giáo viên hoặc sinh viên---------");
            System.out.println("1. xem danh sách sinh viên");
            System.out.println("2. xem danh sách giáo viên");
            System.out.println("3. quay lại menu chính");
            System.out.println("Enter your choose");

            switch (exceptionPerson(choose)) {
                case 1:
                    System.out.println("danh sách sinh viên");
                    studentService.display();
                    break;
                case 2:
                    System.out.println("danh sách giáo viên");
                    teacherService.display();
                    break;
                case 3:
                    menu();
                    break;
                default:
                    System.out.println("Không có option này, xin hãy nhập lại");
            }
        } while (true);
    }

    public static void addPerson() {
        do {
            System.out.println("--------Thêm mới giáo viên hoặc sinh viên----------");
            System.out.println("1. Thêm mới sinh viên");
            System.out.println("2. Thêm mới giáo viên");
            System.out.println("3. quay lại menu chính");
            System.out.println("Enter your choose");

            switch (exceptionPerson(choose)) {
                case 1:
                    System.out.println("Thêm mới học sinh");
                    studentService.add();
                    break;
                case 2:
                    System.out.println("Thêm mới giảng viên");
                    teacherService.add();
                    break;
                case 3:
                    menu();
                    break;
                default:
                    System.out.println("Không có option này, xin hãy nhập lại");
                    break;
            }
        } while (true);
    }

    public static void deletePerson() {
        do {
            System.out.println("--------Xóa giáo viên hoặc sinh viên----------");
            System.out.println("1. xóa sinh viên");
            System.out.println("2. xóa giáo viên");
            System.out.println("3. quay lại menu chính");
            System.out.println("Enter your choose");

            switch (exceptionPerson(choose)) {
                case 1:
                    System.out.println("danh sách sinh viên");
                    studentService.delete();
                    break;
                case 2:
                    System.out.println("danh sách giáo viên");
                    teacherService.delete();
                    break;
                case 3:
                    menu();
                    break;
                default:
                    System.out.println("Không có option này, xin hãy nhập lại");
            }
        } while (true);
    }

    public static void editPerson() {
        do {
            System.out.println("--------Chỉnh sửa giáo viên hoặc sinh viên----------");
            System.out.println("1. Chỉnh sửa sinh viên");
            System.out.println("2. Chỉnh sửa giáo viên");
            System.out.println("3. quay lại menu chính");
            System.out.println("Enter your choose");

            switch (exceptionPerson(choose)) {
                case 1:
                    System.out.println("danh sách sinh viên");
                    studentService.edit();
                    break;
                case 2:
                    System.out.println("danh sách giáo viên");
                    teacherService.edit();
                    break;
                case 3:
                    menu();
                    break;
                default:
                    System.out.println("Không có option này, xin hãy nhập lại");
            }
        } while (true);
    }

    public static void sortStudent() {
        do {
            System.out.println("--------Sắp xếp sinh viên----------");
            System.out.println("1. Sắp xếp tên tăng dần");
            System.out.println("2. Sắp xếp ngày sinh giảm dần");
            System.out.println("3. quay lại menu chính");
            System.out.println("Enter your choose");

            switch (exceptionPerson(choose)) {
                case 1:
                    System.out.println("Sắp xếp tên tăng dần");
                    studentService.sortName();
                    break;
                case 2:
                    System.out.println("Sắp xếp ngày sinh giảm dần");
                    studentService.sortDateOfBirth();
                    break;
                case 3:
                    menu();
                    break;
                default:
                    System.out.println("Không có option này, xin hãy nhập lại");
            }
        } while (true);
    }
    public static void sortTeacher() {
        do {
            System.out.println("--------Sắp xếp giảng viên----------");
            System.out.println("1. Sắp xếp tên tăng dần");
            System.out.println("2. Sắp xếp ngày sinh giảm dần");
            System.out.println("3. quay lại menu chính");
            System.out.println("Enter your choose");

            switch (exceptionPerson(choose)) {
                case 1:
                    System.out.println("Sắp xếp tên tăng dần");
                    studentService.sortName();
                    break;
                case 2:
                    System.out.println("Sắp xếp ngày sinh giảm dần");
                    studentService.sortDateOfBirth();
                    break;
                case 3:
                    menu();
                    break;
                default:
                    System.out.println("Không có option này, xin hãy nhập lại");
            }
        } while (true);
    }
    public static void sortPerson() {
        do {
            System.out.println("--------Sắp xếp giảng viên hoặc sinh viên----------");
            System.out.println("1. Sắp xếp giảng viên");
            System.out.println("2. Sắp xếp sinh viên");
            System.out.println("3. quay lại menu chính");
            System.out.println("Enter your choose");

            switch (exceptionPerson(choose)) {
                case 1:
                    System.out.println("Sắp xếp giảng viên");
                    sortTeacher();
                    break;
                case 2:
                    System.out.println("Sắp xếp sinh viên");
                    sortStudent();
                    break;
                case 3:
                    menu();
                    break;
                default:
                    System.out.println("Không có option này, xin hãy nhập lại");
            }
        } while (true);
    }
}
