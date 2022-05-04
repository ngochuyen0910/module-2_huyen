package ss1_javaoverview.bai_tap;

import java.util.Scanner;

public class read_number_into_letter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        number = number % 10;
        number = number / 10;

        String numberIntoLetter;
        switch (number % 10) {
            case 0:
                numberIntoLetter = "không";
                break;
            case 1:
                numberIntoLetter = "một";
                break;
            case 2:
                numberIntoLetter = "hai";
                break;
            case 3:
                numberIntoLetter = "ba";
                break;
            case 4:
                numberIntoLetter = "bốn";
                break;
            case 5:
                numberIntoLetter = "năm";
                break;
            case 6:
                numberIntoLetter = "sáu";
                break;
            case 7:
                numberIntoLetter = "bảy";
                break;
            case 8:
                numberIntoLetter = "tám";
                break;
            case 9:
                numberIntoLetter = "chín";
                break;
            default:
                numberIntoLetter = "";
        }
        switch (number / 10) {
            case 0:
                numberIntoLetter = "không";
                break;
            case 1:
                numberIntoLetter = "mười";
                break;
            case 2:
                numberIntoLetter = "hai mươi";
                break;
            case 3:
                numberIntoLetter = "ba mươi";
                break;
            case 4:
                numberIntoLetter = "bốn mươi";
                break;
            case 5:
                numberIntoLetter = "năm mươi";
                break;
            case 6:
                numberIntoLetter = "sáu mươi";
                break;
            case 7:
                numberIntoLetter = "bảy mươi";
                break;
            case 8:
                numberIntoLetter = "tám mươi";
                break;
            case 9:
                numberIntoLetter = "chín mươi";
                break;
            default:
                numberIntoLetter = "";
        }


    }
}
