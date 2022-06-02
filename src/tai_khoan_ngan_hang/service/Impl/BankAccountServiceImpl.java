package tai_khoan_ngan_hang.service.Impl;

import tai_khoan_ngan_hang.model.PaymentAccount;
import tai_khoan_ngan_hang.model.SavingAccount;
import tai_khoan_ngan_hang.service.BankAccountService;
import tai_khoan_ngan_hang.untils.ReadAndWrite;
import tai_khoan_ngan_hang.untils.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankAccountServiceImpl implements BankAccountService {
    static Scanner scanner = new Scanner(System.in);
    List<PaymentAccount> paymentAccountList = new ArrayList<>();
    List<SavingAccount> savingAccountList = new ArrayList<>();
    public static final String REGEX_NUMBER = "^[0-9]+$";

    private String moneySave() {
        System.out.println("Nhập số tiền gửi tiết kiệm: ");
        return Regex.number(REGEX_NUMBER);
    }

    private String cardNumber() {
        System.out.println("Nhập số thẻ");
        return Regex.number(REGEX_NUMBER);
    }

    private String money() {
        System.out.println("Nhập số tiền trong tài khoản");
        return Regex.number(REGEX_NUMBER);
    }

    @Override
    public void addSavingAccount() {
        //String id = savingAccountList.get( savingAccountList.size() - 1 ).getId() + 1;
        System.out.println("Nhập id");
        String id = scanner.nextLine();
        System.out.println("Nhập mã tài khoản");
        String accountCode = scanner.nextLine();
        System.out.println("Nhập tên chủ tài khoản");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày tạo tài khoản");
        String date = scanner.nextLine();
        Double money = Double.parseDouble(moneySave());
        System.out.println("Nhập ngày gửi tiết kiệm");
        String sentDate = scanner.nextLine();
        System.out.println("Nhập lãi suất");
        Double interestRate = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập kì hạn");
        Double tenor = Double.parseDouble(scanner.nextLine());

        SavingAccount savingAccount = new SavingAccount(id, accountCode, name, date, money, sentDate, interestRate, tenor);
        savingAccountList.add(savingAccount);
        writeFile();
        System.out.println("Đã thêm mới thành công");
    }

    public void writeFile() {
        for (SavingAccount savingAccountList : savingAccountList) {
            String line = savingAccountList.getInfo();
            ReadAndWrite.writeFile("src\\tai_khoan_ngan_hang\\data\\bank_accounts.csv", line);
        }
    }

    public void readFile() {
        List<String[]> list = ReadAndWrite.readFile("src\\tai_khoan_ngan_hang\\data\\bank_accounts.csv");
        savingAccountList.clear();
        for (String[] item : list) {
            SavingAccount savingAccount = new SavingAccount(item[0], item[1], item[2], item[3], Double.parseDouble(item[4])
                    , item[5], Double.parseDouble(item[6]), Double.parseDouble(item[7]));
            savingAccountList.add(savingAccount);
        }
    }

    @Override
    public void addPayAccount() {
        System.out.println("Nhập id");
        String id = scanner.nextLine();
        System.out.println("Nhập mã tài khoản");
        String accountCode = scanner.nextLine();
        System.out.println("Nhập tên chủ tài khoản");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày tạo tài khoản");
        String date = scanner.nextLine();
        int cardNumber = Integer.parseInt(cardNumber());
        double money = Double.parseDouble(money());

        PaymentAccount paymentAccount = new PaymentAccount(id, accountCode, name, date, cardNumber, money);
        paymentAccountList.add(paymentAccount);
        writeFiles();
        System.out.println("Đã thêm mới thành công");
    }

    public void writeFiles() {
        for (PaymentAccount paymentAccount : paymentAccountList) {
            String line = paymentAccount.getInfo();
            ReadAndWrite.writeFile("src\\tai_khoan_ngan_hang\\data\\bank_accounts.csv", line);
        }
    }

    public void readFiles() {
        List<String[]> list = ReadAndWrite.readFile("src\\tai_khoan_ngan_hang\\data\\bank_accounts.csv");
        paymentAccountList.clear();
        for (String[] item : list) {
            PaymentAccount paymentAccount = new PaymentAccount(item[0], item[1], item[2], item[3], Integer.parseInt(item[4]), Double.parseDouble(item[5]));
            paymentAccountList.add(paymentAccount);
        }
    }

    @Override
    public void delete() {

    }

    @Override
    public void display() {
        readFiles();
        for (PaymentAccount paymentAccount : paymentAccountList) {
            System.out.println(paymentAccount);
        }
        readFile();
        for (SavingAccount savingAccount : savingAccountList) {
            System.out.println(savingAccount);
        }
    }

    @Override
    public void search() {
        boolean check = true;
        System.out.println("Nhập tên muốn tìm kiếm");
        String inputName = scanner.nextLine();
        for (SavingAccount savingAccount: savingAccountList) {
            if (savingAccount.getName().contains(inputName)) {
                check = false;
                System.out.println("Tên cần tìm:" + savingAccount);
            }
        }
        for (PaymentAccount paymentAccount: paymentAccountList) {
            if (paymentAccount.getName().contains(inputName)) {
                check = false;
                System.out.println("Tên cần tìm:" + paymentAccount);
            }
        }
        if (check) {
            System.out.println("Không tìm thấy tên này");
        }
    }
}
