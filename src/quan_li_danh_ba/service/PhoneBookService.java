package quan_li_danh_ba.service;

import quan_li_danh_ba.models.PhoneBook;
import quan_li_danh_ba.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBookService implements IPhoneBookService {
    private static Scanner scanner = new Scanner(System.in);
    static List<PhoneBook> phoneBookList = new ArrayList<>();

    static {
        phoneBookList.add(new PhoneBook(1, 123, "học sinh", "Trần Thị Hà", false, "Đà Nẵng", "12/03/1999", "ha@gmail.com"));
        phoneBookList.add(new PhoneBook(2, 456, "giáo viên", "Trần Thị Lan", false, "Huế", "12/12/1989", "lan123@gmail.com"));
        phoneBookList.add(new PhoneBook(3, 789, "học sinh", "Trần An", false, "Đà Nẵng", "02/09/1999", "an@gmail.com"));
    }


    @Override
    public void displays() {
        System.out.println("Danh sách danh bạ: ");
        for (PhoneBook phoneBook : phoneBookList) {
            System.out.println(phoneBook);
        }
    }

    @Override
    public void addNew() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số điện thoại: ");
        int numberPhone = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập nhóm: ");
        String groupPhone = scanner.nextLine();
        System.out.println("Nhập họ và tên: ");
        String name = scanner.nextLine();
        System.out.println("Chọn giới tính: 1. Nam ;  2. Nữ ");
        int isGender = Integer.parseInt(scanner.nextLine());
        boolean gender = false;
        boolean checkGender = isGender == 1;
        if (checkGender) {
            gender = false;
        } else {
            gender = true;
        }
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("Nhập ngày sinh");
        String dayOfBirth = scanner.nextLine();
        System.out.println("Nhập email");
        String email = scanner.nextLine();
        PhoneBook phoneBook = new PhoneBook(id, numberPhone, groupPhone, name, gender, address, dayOfBirth, email);
        phoneBookList.add(phoneBook);
        System.out.println("Đã thêm mới thành công");
    }

    @Override
    public void update() {
        System.out.println("Nhập số điện thoại cần sửa: ");
        int inputPhone = Integer.parseInt(scanner.nextLine());
        for (PhoneBook phoneBook : phoneBookList) {
            if (phoneBook.getPhoneNumber() == inputPhone) {
                try {
                    System.out.println("Nhập id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập nhóm: ");
                    String groupPhone = scanner.nextLine();
                    System.out.println("Nhập họ và tên: ");
                    String name = scanner.nextLine();
                    System.out.println("Nhập giới tính: ");
                    Boolean gender = Boolean.parseBoolean(scanner.nextLine());
                    System.out.println("Nhập địa chỉ");
                    String address = scanner.nextLine();
                    System.out.println("Nhập ngày sinh");
                    String dayOfBirth = scanner.nextLine();
                    System.out.println("Nhập email");
                    String email = scanner.nextLine();
                    phoneBook.setId(id);
                    phoneBook.setGroupPhone(groupPhone);
                    phoneBook.setName(name);
                    phoneBook.setGender(gender);
                    phoneBook.setAddress(address);
                    phoneBook.setDateOfBirth(dayOfBirth);
                    phoneBook.setEmail(email);
                    System.out.println(phoneBookList);
                } catch (NumberFormatException e) {
                    System.out.println("Bạn nhập thiếu thông tin rồi. Nhập lại đi");
                }
            }
        }
    }

    @Override
    public void delete() {
        System.out.println("Nhập số điện thoại muốn xóa");
        int inputPhone = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < phoneBookList.size(); i++) {

        }

    }

    @Override
    public void search() {
        System.out.println("Nhập tên muốn tìm kiếm");
        String inputName = scanner.nextLine();
        for (PhoneBook phoneBook : phoneBookList) {
            if (phoneBook.getName().contains(inputName)) {
                System.out.println("Tên cần tìm:" + phoneBook);
            }
        }
        System.out.println("Không tìm thấy tên này");
    }

    @Override
    public void readFile() {
        writeFile();
        List<String[]> listStr = ReadAndWrite.readFile("src\\quan_li_danh_ba\\data\\contacts.csv");
        phoneBookList.clear();
        for (String[] item : listStr) {
            PhoneBook phoneBook = new PhoneBook(Integer.parseInt(item[0]), Integer.parseInt(item[1]), item[2], item[3], Boolean.parseBoolean(item[4]), item[5], item[6], item[7]);
            phoneBookList.add(phoneBook);
        }
        System.out.println("Danh sách danh bạ: ");
        for (PhoneBook phoneBook : phoneBookList) {
            System.out.println(phoneBook);
        }
    }

    @Override
    public void writeFile() {
        for (PhoneBook phoneBook : phoneBookList) {
            String line = phoneBook.getId() + "," + phoneBook.getPhoneNumber() + "," + phoneBook.getGroupPhone() + "," + phoneBook.getName() + "," +
                    phoneBook.isGender() + "," + phoneBook.getAddress() + "," + phoneBook.getDateOfBirth() + "," + phoneBook.getEmail();
            ReadAndWrite.writeFile("src\\quan_li_danh_ba\\data\\contacts.csv", line);
        }
    }
}
