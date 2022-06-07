package bai_tap.quan_li_sinh_vien_giao_vien.utils;

import bai_tap.quan_li_sinh_vien_giao_vien.Exception.AgeException;
import bai_tap.quan_li_sinh_vien_giao_vien.Exception.InvalidIntException;
import bai_tap.quan_li_sinh_vien_giao_vien.Exception.InvalidPointException;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
    static Scanner scanner = new Scanner(System.in);

    public static String point(String regex) {
        boolean check = true;
        String temp;
        do {
            temp = scanner.nextLine();
            check = false;
            try {
                if (!temp.matches(regex)) {
                    check = true;
                    throw new InvalidPointException("Bạn đã nhập sai định dạng. Phải là 0 đến 10 ");
                }

            } catch (InvalidPointException e) {
                System.out.println(e.getMessage());
            }
        } while (check);
        return temp;
    }

    public static String inputInt(String regex) {
        boolean check = true;
        String temp;
        do {
            temp = scanner.nextLine();
            check = false;
            try {
                if (!temp.matches(regex)) {
                    check = true;
                    throw new InvalidIntException("Bạn đã nhập sai định dạng. Phải là số dương ");
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
                    if (current > 18) {
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
