package bai_tap.quan_li_cong_ty.utils;


import java.util.Scanner;

public class Regex {
    static Scanner scanner = new Scanner(System.in);

    public static String regexStr(String regex) {
        boolean check = true;
        String temp;
        do {
            temp = scanner.nextLine();
            check = false;
            try {
                if (!temp.matches(regex)) {
                    check = true;
                    throw new NotFoundEmployeeException("Bạn đã nhập sai mã định dạng");
                }

            } catch (NotFoundEmployeeException e) {
                System.out.println(e.getMessage());
            }
        } while (check);
        return temp;
    }

}
