package bai_tap.quan_li_sinh_vien_giao_vien.service.Impl;

import bai_tap.quan_li_sinh_vien_giao_vien.model.Student;
import bai_tap.quan_li_sinh_vien_giao_vien.service.StudentService;
import bai_tap.quan_li_sinh_vien_giao_vien.utils.NotFoundSavingException;
import bai_tap.quan_li_sinh_vien_giao_vien.utils.ReadAndWrite;
import bai_tap.quan_li_sinh_vien_giao_vien.utils.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentServiceImpl implements StudentService {
    static Scanner scanner = new Scanner(System.in);
    List<Student> studentList = new ArrayList<>();
    public static final String REGEX_POINT = "^[0-9]|([1][0-9])|(10)$";
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
    private String point() {
        System.out.println("Nhập điểm");
        return Regex.point(REGEX_POINT);
    }

    @Override
    public void display() {
        readFile();
        for(Student student: studentList){
            System.out.println(student);
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

        System.out.println("Nhập mã sinh viên");
        int studentCode = Integer.parseInt(scanner.nextLine());

        double point = Double.parseDouble(point());

        Student student = new Student(id, name, gender, dateOfBirth, address, studentCode, point);
        studentList.add(student);
        writeFile();
        System.out.println("Đã thêm mới thành công");
    }

    @Override
    public void delete() {
        do {
            readFile();
            System.out.println("Nhập id cần xóa: ");
            String inputId = scanner.nextLine();
            for (Student student : studentList) {
                if (student.getId().equals(inputId)) {
                    System.out.println("Bạn có muốn xóa hay không? 1.Yes ; 2. No");
                    int choose = Integer.parseInt(scanner.nextLine());
                    switch (choose) {
                        case 1:
                            studentList.remove(student);
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
        for(Student student: studentList){
            if(student.getId().equals(inputId)){
                System.out.println("Nhập id");
                String id = scanner.nextLine();
                student.setId(id);

                System.out.println("Nhập họ và tên");
                String name = scanner.nextLine();
                student.setName(name);

                String gender = gender();
                student.setGender(gender);

                System.out.println("Nhập ngày tháng năm sinh");
                String dateOfBirth = scanner.nextLine();
                student.setDateOfBirth(dateOfBirth);

                System.out.println("Nhập địa chỉ");
                String address = scanner.nextLine();
                student.setAddress(address);

                System.out.println("Nhập mã sinh viên");
                int studentCode = Integer.parseInt(scanner.nextLine());
                student.setStudentCode(studentCode);

                System.out.println("Nhập điểm số");
                double point = Double.parseDouble(scanner.nextLine());
                student.setPoint(point);

                System.out.println(studentList);
            }
        }
        writeFile();
    }

    public void writeFile() {
        ReadAndWrite.deleteFile("src\\bai_tap\\quan_li_sinh_vien_giao_vien\\data\\student.csv");
        for (Student item : studentList) {
            String line = item.getInfo();
            ReadAndWrite.writeFile("src\\bai_tap\\quan_li_sinh_vien_giao_vien\\data\\student.csv", line);
        }
    }

    public void readFile() {
        studentList.clear();
        List<String[]> listStr = ReadAndWrite.readFile("src\\bai_tap\\quan_li_sinh_vien_giao_vien\\data\\student.csv");
        for (String[] item : listStr) {
            studentList.add(new Student(item[0], item[1], item[2], item[3], item[4], Integer.parseInt(item[5]), Double.parseDouble(item[6])));
        }
    }
}
