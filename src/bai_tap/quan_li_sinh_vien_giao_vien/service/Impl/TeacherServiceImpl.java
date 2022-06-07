package bai_tap.quan_li_sinh_vien_giao_vien.service.Impl;

import bai_tap.quan_li_sinh_vien_giao_vien.model.Teacher;
import bai_tap.quan_li_sinh_vien_giao_vien.service.TeacherService;
import bai_tap.quan_li_sinh_vien_giao_vien.utils.NotFoundSavingException;
import bai_tap.quan_li_sinh_vien_giao_vien.utils.ReadAndWrite;
import bai_tap.quan_li_sinh_vien_giao_vien.utils.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherServiceImpl implements TeacherService {
    static Scanner scanner = new Scanner(System.in);
    List<Teacher> teacherList = new ArrayList<>();
    public static final String REGEX_BIRTH = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)" +
            "(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|" +
            "[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$" +
            "|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";

    public String gender() {
        do {
            System.out.println("Chọn giới tính");
            System.out.println("1.Nam");
            System.out.println("2.Nữ");
            System.out.println("3.Giới tính thứ 3");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    return "Nam";
                case 2:
                    return "Nữ";
                case 3:
                    return "Giới tính thứ 3";
                default:
                    System.out.println("Bạn chọn lại nha!! Sai rồi");
                    gender();
            }
        } while (true);
    }

    @Override
    public void display() {
        readFile();
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
    }

    @Override
    public void add() {
        readFile();
        System.out.println("Nhập id");
        String id = scanner.nextLine();

        System.out.println("Nhập họ và tên");
        String name = scanner.nextLine();

        String gender = gender();

        System.out.println("Nhập ngày tháng năm sinh");
        String dateOfBirth = Regex.regexAge(scanner.nextLine(), REGEX_BIRTH);

        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();

        System.out.println("Nhập tên lớp dạy");
        String teachingClass = scanner.nextLine();

        System.out.println("Nhập lương");
        double wage = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập số giờ dạy");
        double teachingHours = Double.parseDouble(scanner.nextLine());

        Teacher teacher = new Teacher(id, name, gender, dateOfBirth, address, teachingClass, wage, teachingHours);
        teacherList.add(teacher);
        writeFile();
        System.out.println("Đã thêm mới thành công");
    }

    @Override
    public void delete() {
        do {
            readFile();
            System.out.println("Nhập id cần xóa: ");
            String inputId = scanner.nextLine();
            for (Teacher teacher : teacherList) {
                if (teacher.getId().equals(inputId)) {
                    System.out.println("Bạn có muốn xóa hay không? 1.Yes ; 2. No");
                    int choose = Integer.parseInt(scanner.nextLine());
                    switch (choose) {
                        case 1:
                            teacherList.remove(teacher);
                            writeFile();
                            display();
                            return;
                        case 2:
                            return;
                        default:
                            System.out.println("Chọn lại đi!!");
                            return;
                    }
                }
            }
            try {
                throw new NotFoundSavingException("Id này không tồn tại");
            } catch (NotFoundSavingException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    @Override
    public void sort() {

    }

    @Override
    public void edit() {
        readFile();
        System.out.println("Nhập id muốn sửa");
        String inputId = scanner.nextLine();
        for (Teacher teacher : teacherList) {
            if (teacher.getId().equals(inputId)) {
                System.out.println("Nhập id");
                String id = scanner.nextLine();
                teacher.setId(id);

                System.out.println("Nhập họ và tên");
                String name = scanner.nextLine();
                teacher.setName(name);

                String gender = gender();
                teacher.setGender(gender);

                System.out.println("Nhập ngày tháng năm sinh");
                String dateOfBirth = scanner.nextLine();
                teacher.setDateOfBirth(dateOfBirth);

                System.out.println("Nhập địa chỉ");
                String address = scanner.nextLine();
                teacher.setAddress(address);

                System.out.println("Nhập tên lớp dạy");
                String teachingClass = scanner.nextLine();
                teacher.setTeachingClass(teachingClass);

                System.out.println("Nhập lương");
                double wage = Double.parseDouble(scanner.nextLine());
                teacher.setWage(wage);

                System.out.println("Nhập số giờ dạy");
                double teachingHours = Double.parseDouble(scanner.nextLine());
                teacher.setTeachingHours(teachingHours);

                System.out.println(teacherList);
            }
        }
        writeFile();
    }

    public void writeFile() {
        ReadAndWrite.deleteFile("src\\bai_tap\\quan_li_sinh_vien_giao_vien\\data\\teacher.csv");
        for (Teacher item : teacherList) {
            String line = item.getInfo();
            ReadAndWrite.writeFile("src\\bai_tap\\quan_li_sinh_vien_giao_vien\\data\\teacher.csv", line);
        }
    }

    public void readFile() {
        teacherList.clear();
        List<String[]> listStr = ReadAndWrite.readFile("src\\bai_tap\\quan_li_sinh_vien_giao_vien\\data\\teacher.csv");
        for (String[] item : listStr) {
            teacherList.add(new Teacher(item[0], item[1], item[2], item[3], item[4], item[5], Double.parseDouble(item[6]), Double.parseDouble(item[7])));
        }
    }
}
