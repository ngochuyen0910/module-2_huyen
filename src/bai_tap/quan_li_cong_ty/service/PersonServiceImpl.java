package bai_tap.quan_li_cong_ty.service;

import bai_tap.quan_li_cong_ty.model.ManagementStaff;
import bai_tap.quan_li_cong_ty.model.Person;
import bai_tap.quan_li_cong_ty.model.ProductionStaff;
import bai_tap.quan_li_cong_ty.utils.NotFoundEmployeeException;
import bai_tap.quan_li_cong_ty.utils.ReadAndWrite;
import bai_tap.quan_li_cong_ty.utils.Regex;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PersonServiceImpl implements PersonService {
    static Scanner scanner = new Scanner(System.in);
    List<Person> personList = new LinkedList<>();
    private static final String REGEX_INT = "^[0-9]+$";
    private static final String REGEX_BIRTHDAY = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)" +
            "(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|" +
            "[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$" +
            "|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";

    private String wage() {
        System.out.println("Nhập lương cơ bản");
        return Regex.wage(REGEX_INT);
    }

    private String coefficientsSalary() {
        System.out.println("Nhập hệ số lương");
        return Regex.coefficientsSalary(REGEX_INT);
    }

    private String productNumber() {
        System.out.println("Nhập số lượng sp");
        return Regex.productNumber(REGEX_INT);
    }

    private String price() {
        System.out.println("Nhập giá");
        return Regex.price(REGEX_INT);
    }


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
        String id = "" + (Integer.parseInt(personList.get(personList.size() - 1).getId()) + 1);

        System.out.println("Nhập mã nhân viên");
        String employeeCode = scanner.nextLine();

        System.out.println("Nhập họ và tên");
        String name = scanner.nextLine();

        System.out.println("Nhập ngày tháng năm sinh");
        String dateOfBirth = Regex.regexAge(scanner.nextLine(), REGEX_BIRTHDAY);

        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();

        int productNumber = Integer.parseInt(productNumber());

        double price = Double.parseDouble(price());

        ProductionStaff productionStaff = new ProductionStaff(id, employeeCode, name, dateOfBirth, address, productNumber, price);
        personList.add(productionStaff);
        writeFile();
        System.out.println("Đã thêm mới thành công");
    }

    @Override
    public void addManagementStaff() {
        readFile();
        String id = "" + (Integer.parseInt(personList.get(personList.size() - 1).getId()) + 1);

        System.out.println("Nhập mã nhân viên");
        String employeeCode = scanner.nextLine();

        System.out.println("Nhập họ và tên");
        String name = scanner.nextLine();

        System.out.println("Nhập ngày tháng năm sinh");
        String dateOfBirth = scanner.nextLine();

        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();

        double wage = Double.parseDouble(wage());

        double coefficientsSalary = Double.parseDouble(coefficientsSalary());

        ManagementStaff managementStaff = new ManagementStaff(id, employeeCode, name, dateOfBirth, address, wage, coefficientsSalary);
        personList.add(managementStaff);
        writeFile();
        System.out.println("Đã thêm mới thành công");
    }


    @Override
    public void delete() {
        do {
            readFile();
            System.out.println("Nhập mã nhân viên cần xóa: ");
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
            if (person.getName().contains(inputName)) {
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
                personList.add(new ProductionStaff(item[0], item[1], item[2], item[3], item[4], Integer.parseInt(item[5]),
                        Double.parseDouble(item[6])));
            }
        }
    }
}
