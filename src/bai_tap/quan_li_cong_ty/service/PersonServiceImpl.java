package bai_tap.quan_li_cong_ty.service;

import bai_tap.quan_li_cong_ty.model.ManagementStaff;
import bai_tap.quan_li_cong_ty.model.Person;
import bai_tap.quan_li_cong_ty.model.ProductionStaff;
import bai_tap.quan_li_cong_ty.utils.NotFoundEmployeeException;
import bai_tap.quan_li_cong_ty.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonServiceImpl implements PersonService {
    static Scanner scanner = new Scanner(System.in);
    List<Person> personList = new ArrayList<>();

    @Override
    public void display() {
        readFile();
        for (Person person : personList) {
            System.out.println(person);
        }
    }

    @Override
    public void addProductionStaff() {
        readFile();
        System.out.println("Nhập id");
        String id = scanner.nextLine();

        System.out.println("Nhập mã nhân viên");
        String employeeCode = scanner.nextLine();

        System.out.println("Nhập họ và tên");
        String name = scanner.nextLine();

        System.out.println("Nhập ngày tháng năm sinh");
        String dateOfBirth = scanner.nextLine();

        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();

        System.out.println("Nhập số sản phẩm");
        int productNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập giá");
        double price = Double.parseDouble(scanner.nextLine());

        ProductionStaff productionStaff = new ProductionStaff(id, employeeCode, name, dateOfBirth, address, productNumber, price);
        personList.add(productionStaff);
        writeFile();
        System.out.println("Đã thêm mới thành công");
    }

    @Override
    public void addManagementStaff() {
        readFile();
        System.out.println("Nhập id");
        String id = scanner.nextLine();

        System.out.println("Nhập mã nhân viên");
        String employeeCode = scanner.nextLine();

        System.out.println("Nhập họ và tên");
        String name = scanner.nextLine();

        System.out.println("Nhập ngày tháng năm sinh");
        String dateOfBirth = scanner.nextLine();

        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();

        System.out.println("Nhập lương cơ bản");
        double wage = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập hệ số lương");
        double coefficientsSalary = Double.parseDouble(scanner.nextLine());

        ManagementStaff managementStaff = new ManagementStaff(id, employeeCode, name, dateOfBirth, address, wage, coefficientsSalary);
        personList.add(managementStaff);
        writeFile();
        System.out.println("Đã thêm mới thành công");
    }


    @Override
    public void delete() {
        do {
            readFile();
            System.out.println("Nhập mã bệnh án cần xóa: ");
            String inputEmployeeCode = scanner.nextLine();
            for (Person person : personList) {
                if (person.getEmployeeCode().equals(inputEmployeeCode)) {
                    System.out.println("Bạn có muốn xóa hay không? 1.Yes ; 2. No");
                    int choose = Integer.parseInt(scanner.nextLine());
                    switch (choose) {
                        case 1:
                            personList.remove(person);
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
                throw new NotFoundEmployeeException("Mã nhân viên không tồn tại");
            } catch (NotFoundEmployeeException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    @Override
    public void search() {
        readFile();
        System.out.println("Nhập tên muốn tìm kiếm");
        String inputName = scanner.nextLine();
        for (Person person : personList) {
            if (person.getEmployeeCode().contains(inputName)) {
                System.out.println("Tên cần tìm:" + person);
            }
        }
        System.out.println("Không tìm thấy tên này");
    }

    public void writeFile() {
        ReadAndWrite.deleteFile("src\\bai_tap\\quan_li_cong_ty\\data\\data.csv");
        for (Person item : personList) {
            String line = item.getInfo();
            ReadAndWrite.writeFile("src\\bai_tap\\quan_li_cong_ty\\data\\data.csv", line);
        }
    }

    public void readFile() {
        personList.clear();
        List<String[]> listStr = ReadAndWrite.readFile("src\\bai_tap\\quan_li_cong_ty\\data\\data.csv");
        for (String[] item : listStr) {
            if (item[7].equals("2")) {
                personList.add(new ManagementStaff(item[0], item[1], item[2], item[3], item[4], Double.parseDouble(item[5]),
                        Double.parseDouble(item[6])));
            } else {
                personList.add(new ManagementStaff(item[0], item[1], item[2], item[3], item[4], Integer.parseInt(item[5]),
                        Double.parseDouble(item[6])));
            }
        }
    }
}
