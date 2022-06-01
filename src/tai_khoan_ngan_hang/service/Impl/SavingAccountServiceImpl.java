package tai_khoan_ngan_hang.service.Impl;

import tai_khoan_ngan_hang.model.SavingAccount;
import tai_khoan_ngan_hang.service.SavingAccountService;
import tai_khoan_ngan_hang.untils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SavingAccountServiceImpl implements SavingAccountService {
    static Scanner scanner = new Scanner(System.in);
    List<SavingAccount> savingAccountList = new ArrayList<>();

    @Override
    public void add() {
        //String id = savingAccountList.get( savingAccountList.size() - 1 ).getId() + 1;
        System.out.println("Nhập id");
        String id= scanner.nextLine();
        System.out.println("Nhập mã tài khoản");
        String accountCode = scanner.nextLine();
        System.out.println("Nhập tên chủ tài khoản");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày tạo tài khoản");
        String date = scanner.nextLine();
        System.out.println("Nhập số tiền gửi tiết kiệm");
        Double money = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập ngày gửi tiết kiệm");
        String sentDate = scanner.nextLine();
        System.out.println("Nhập lãi suất");
        Double interestRate = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập kì hạn");
        Double tenor = Double.parseDouble(scanner.nextLine());

        SavingAccount savingAccount= new SavingAccount(id,accountCode,name,date,money,sentDate,interestRate,tenor);
        savingAccountList.add(savingAccount);
        writeFile();
        System.out.println("Đã thêm mới thành công");
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
    public void writeFile(){
        for(SavingAccount savingAccountList: savingAccountList){
            String line = savingAccountList.getInfo();
            ReadAndWrite.writeFile("src\\tai_khoan_ngan_hang\\data\\bank_accounts.csv",line);
        }
    }
    public void readFile(){

    }
}
