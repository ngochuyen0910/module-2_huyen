package bai_tap.quan_li_cong_ty.utils;


import casestudy.exception.AgeException;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
    static Scanner scanner = new Scanner(System.in);

    public static String wage(String regex) {
        boolean check = true;
        String temp;
        do {
            temp = scanner.nextLine();
            check = false;
            try {
                if (!temp.matches(regex)) {
                    check = true;
                    throw new InvalidIntException("Bạn đã nhập sai mã định dạng.Phải nhập số dương");
                }

            } catch (InvalidIntException e) {
                System.out.println(e.getMessage());
            }
        } while (check);
        return temp;
    }

    public static String coefficientsSalary(String regex) {
        boolean check = true;
        String temp;
        do {
            temp = scanner.nextLine();
            check = false;
            try {
                if (!temp.matches(regex)) {
                    check = true;
                    throw new InvalidIntException("Bạn đã nhập sai mã định dạng.Phải nhập số dương");
                }

            } catch (InvalidIntException e) {
                System.out.println(e.getMessage());
            }
        } while (check);
        return temp;
    }
    public static String productNumber(String regex) {
        boolean check = true;
        String temp;
        do {
            temp = scanner.nextLine();
            check = false;
            try {
                if (!temp.matches(regex)) {
                    check = true;
                    throw new InvalidIntException("Bạn đã nhập sai mã định dạng.Phải nhập số dương");
                }

            } catch (InvalidIntException e) {
                System.out.println(e.getMessage());
            }
        } while (check);
        return temp;
    }
    public static String price(String regex) {
        boolean check = true;
        String temp;
        do {
            temp = scanner.nextLine();
            check = false;
            try {
                if (!temp.matches(regex)) {
                    check = true;
                    throw new InvalidIntException("Bạn đã nhập sai mã định dạng.Phải nhập số dương");
                }

            } catch (InvalidIntException e) {
                System.out.println(e.getMessage());
            }
        } while (check);
        return temp;
    }

    public static String regexAge(String temp, String regex) {
        boolean check = true;
        while (check) {
            try {
                if (Pattern.matches(regex, temp)) {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate age = LocalDate.parse(temp, formatter);
                    LocalDate now = LocalDate.now();
                    int current = Period.between(age, now).getYears();
                    if (current < 100 && current > 18) {
                        check = false;
                    } else {
                        throw new AgeException("Tuổi phải lớn hơn 18");
                    }
                } else {
                    throw new AgeException("Định dạng nhập vào không đúng");
                }
            } catch (AgeException e) {
                System.out.println(e.getMessage());
                temp = scanner.nextLine();
            }
        }
        return temp;
    }
}
