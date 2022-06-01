package tai_khoan_ngan_hang.service.Impl;

import tai_khoan_ngan_hang.model.PaymentAccount;
import tai_khoan_ngan_hang.model.SavingAccount;
import tai_khoan_ngan_hang.service.SavingAccountService;
import tai_khoan_ngan_hang.untils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PayAccountServiceImpl implements SavingAccountService {
    static Scanner scanner = new Scanner(System.in);
    List<PaymentAccount> paymentAccountList = new ArrayList<>();

    @Override
    public void add() {
        System.out.println("Nhập id");
        String id = scanner.nextLine();
        System.out.println("Nhập mã tài khoản");
        String accountCode = scanner.nextLine();
        System.out.println("Nhập tên chủ tài khoản");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày tạo tài khoản");
        String date = scanner.nextLine();
        System.out.println("Nhập số thẻ");
        int cardNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số tiền trong tài khoản");
        double money = Double.parseDouble(scanner.nextLine());

        PaymentAccount paymentAccount = new PaymentAccount(id, accountCode, name, date, cardNumber, money);
        writeFile();
        paymentAccountList.add(paymentAccount);

        System.out.println("Đã thêm mới thành công");
    }

    public void writeFile() {
        for (PaymentAccount paymentAccount : paymentAccountList) {
            String line = paymentAccount.getInfo();
            ReadAndWrite.writeFile("src\\tai_khoan_ngan_hang\\data\\bank_accounts.csv", line);
        }
    }

    @Override
    public void delete() {

    }

    @Override
    public void display() {

    }

    @Override
    public void search() {

    }
}
