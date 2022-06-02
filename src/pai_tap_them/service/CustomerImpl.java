package pai_tap_them.service;

import pai_tap_them.models.CustomerVietNam;
import pai_tap_them.models.ForeignCustomer;
import pai_tap_them.untils.ReadAndWrite;
import pai_tap_them.untils.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerImpl implements Customer {
    private List<CustomerVietNam> customerList = new ArrayList<>();
    private List<ForeignCustomer> customerLists = new ArrayList<>();
    public static final String REGEX_ID_CUSTOMER_VN = "(KHVN)[-][\\d]{5}";
    public static final String REGEX_ID_FOREIGN_CUSTOMER = "(KHNN)[-][\\d]{5}";
    private Scanner scanner = new Scanner(System.in);

    public String getCustomerType() {
        List<String[]> list = ReadAndWrite.readFile("src\\pai_tap_them\\data\\customertype.csv");
        System.out.println("Nhập loại khách hàng");
        String type = scanner.nextLine();
        switch (type) {
            case "1":
                type = "LKH-001";
                break;
            case "2":
                type = "LKH-002";
                break;
            case "3":
                type = "LKH-003";
                break;
            default:
                System.out.println("Không có loại này!! Bạn chọn lại điiiii!!!!!!");
        }
        String typeCustomer = null;
        for (String[] customer : list) {
            if (type.equals(customer[0])) {
                typeCustomer = customer[1];
            }
        }
        return typeCustomer;
    }

    public String inputIdVN() {
        System.out.println("Nhập mã khách hàng:");
        return Regex.regexStr(scanner.nextLine(), REGEX_ID_CUSTOMER_VN, "Bạn nhập sai định dạng rồi!! Định dạng là KHVN-XXXXX");
    }

    public String inputId() {
        System.out.println("Nhập mã khách hàng:");
        return Regex.regexStr(scanner.nextLine(), REGEX_ID_FOREIGN_CUSTOMER, "Bạn nhập sai định dạng rồi!! Định dạng là KHNN-XXXXX");
    }

    @Override
    public void addCustomerVN() {
        String idCustomer = inputIdVN();
        System.out.println("Nhập họ và tên");
        String name = scanner.nextLine();
        String customerType = getCustomerType();
        System.out.println("Nhập định mức tiêu thụ");
        Double consumptionNorms = Double.parseDouble(scanner.nextLine());

        CustomerVietNam customerVN = new CustomerVietNam(idCustomer, name, customerType, consumptionNorms);
        customerList.add(customerVN);
        writeFile();
        System.out.println("Đã thêm mới thành công");
    }

    public void writeFile() {
        for (CustomerVietNam customerVietNam : customerList) {
            String line = customerVietNam.getInfo();
            ReadAndWrite.writeFile("src\\pai_tap_them\\data\\customer.csv", line);
        }
    }

    @Override
    public void addForeignCustomer() {
        String idCustomer = inputId();
        System.out.println("Nhập họ và tên");
        String name = scanner.nextLine();
        System.out.println("Nhập quốc tịch");
        String nationality = scanner.nextLine();

        ForeignCustomer foreignCustomer = new ForeignCustomer(idCustomer, name, nationality);
        customerLists.add(foreignCustomer);
        writeFiles();
        System.out.println("Đã thêm mới thành công");
    }

    public void writeFiles() {
        for (ForeignCustomer foreignCustomer : customerLists) {
            String line = foreignCustomer.getInfo();
            ReadAndWrite.writeFile("src\\pai_tap_them\\data\\customer.csv", line);
        }
    }

    public void readFiles() {
        List<String[]> list = ReadAndWrite.readFile("src\\pai_tap_them\\data\\customer.csv");
        customerLists.clear();
        customerList.clear();
        for (String[] item : list) {
            if (item[0].contains("KHNN")) {
                ForeignCustomer foreignCustomer = new ForeignCustomer(item[0], item[1], item[2]);
                customerLists.add(foreignCustomer);
            } else {
                CustomerVietNam customerVietNam = new CustomerVietNam(item[0], item[1], item[2], Double.parseDouble(item[3]));
                customerList.add(customerVietNam);
            }
        }
    }

    @Override
    public void display() {
        readFiles();
        for (CustomerVietNam customerVietNam : customerList) {
            System.out.println(customerVietNam);
        }
        for (ForeignCustomer foreignCustomer : customerLists) {
            System.out.println(foreignCustomer);
        }
    }

    @Override
    public void search() {
        readFiles();
        boolean check = true;
        System.out.println("Nhập tên muốn tìm kiếm");
        String inputName = scanner.nextLine();
        for (CustomerVietNam customerVietNam : customerList) {
            if (customerVietNam.getName().contains(inputName)) {
                check = false;
                System.out.println("Tên cần tìm:" + customerVietNam);
            }
        }
        for (ForeignCustomer foreignCustomer : customerLists) {
            if (foreignCustomer.getName().contains(inputName)) {
                check = false;
                System.out.println("Tên cần tìm:" + foreignCustomer);
            }
        }
        if (check) {
            System.out.println("Không tìm thấy tên này");
        }
    }
}