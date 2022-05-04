package ss1_javaoverview.bai_tap;

import java.util.Scanner;

public class read_number_into_letter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int number1 = number % 10;
        int number2 = number / 10;
        int number3 = number / 100;
        int number4 = (number % 100) / 10;
        int number5 = (number % 100) % 10;

        String numberIntoLetter = "";
        String s1, s2, s3;
        switch (number2) {
            case 1:
                numberIntoLetter = "ten";
                break;
            case 2:
                numberIntoLetter = "twenty";
                break;
            case 3:
                numberIntoLetter = "thirty";
                break;
            case 4:
                numberIntoLetter = "forty";
                break;
            case 5:
                numberIntoLetter = "fifty";
                break;
            case 6:
                numberIntoLetter = "sixty";
                break;
            case 7:
                numberIntoLetter = "seventy";
                break;
            case 8:
                numberIntoLetter = "eighty";
                break;
            case 9:
                numberIntoLetter = "ninety";
                break;
        }
        switch (number1) {
            case 0:
                if (number2 == 0) {
                    numberIntoLetter = "không";
                }
                break;
            case 1:
                if (number2 == 1) {
                    numberIntoLetter = "eleven";
                    break;
                }
                numberIntoLetter = numberIntoLetter + "one";
                break;
            case 2:
                if (number2 == 1) {
                    numberIntoLetter = "twelve";
                    break;
                }
                numberIntoLetter = numberIntoLetter + "two";
                break;
            case 3:
                if (number2 == 1) {
                    numberIntoLetter = "thirteen";
                    break;
                }
                numberIntoLetter = numberIntoLetter + "three";
                break;
            case 4:
                if (number2 == 1) {
                    numberIntoLetter = "fourteen";
                    break;
                }
                numberIntoLetter = numberIntoLetter + "four";
                break;
            case 5:
                if (number2 == 1) {
                    numberIntoLetter = "fifteen";
                    break;
                }
                numberIntoLetter = numberIntoLetter + "five";
                break;
            case 6:
                if (number2 == 1) {
                    numberIntoLetter = "sixteen";
                    break;
                }
                numberIntoLetter = numberIntoLetter + "six";
                break;
            case 7:
                if (number2 == 1) {
                    numberIntoLetter = "seventeen";
                    break;
                }
                numberIntoLetter = numberIntoLetter + "seven";
                break;
            case 8:
                if (number2 == 1) {
                    numberIntoLetter = "eighteen";
                    break;
                }
                numberIntoLetter = numberIntoLetter + "eight";
                break;
            case 9:
                if (number2 == 1) {
                    numberIntoLetter = "nineteen";
                    break;
                }
                numberIntoLetter = numberIntoLetter + "nine";
                break;

        }
        switch (number3) {
            case 1:
                s1 = "one hundred";
                break;
            case 2:
                s1 = "two hundred";
                break;
            case 3:
                s1 = "three hundred";
                break;
            case 4:
                s1 = "four hundred";
                break;
            case 5:
                s1 = "five hundred";
                break;
            case 6:
                s1 = "six hundred";
                break;
            case 7:
                s1 = "seven hundred";
                break;
            case 8:
                s1 = "eight hundred";
                break;
            case 9:
                s1 = "nine hundred";
                break;
        }
        switch (number4) {
            case 1:
                s2 = "ten";
                break;
            case 2:
                s2 = "twenty";
                break;
            case 3:
                s2 = "thirty";
                break;
            case 4:
                s2 = "forty";
                break;
            case 5:
                s2 = "fifty";
                break;
            case 6:
                s2 = "sixty";
                break;
            case 7:
                s2 = "seventy";
                break;
            case 8:
                s2 = "eighty";
                break;
            case 9:
                s2 = "ninety";
                break;
        }
        switch (number5) {
            case 0:
                if (number4 == 0) {
                    s3 = "không";
                }
                break;
            case 1:
                if (number4 == 1) {
                    s3 = "eleven";
                    break;
                }
                s3 = "s3" + "s2" + "one";
                break;
            case 2:
                if (number4 == 1) {
                    s3 = "twelve";
                    break;
                }
                s3 = "s3" + "s2" + "two";
                break;
            case 3:
                if (number4 == 1) {
                    s3 = "thirteen";
                    break;
                }
                s3 = "s3" + "s2" + "three";
                break;
            case 4:
                if (number4 == 1) {
                    s3 = "fourteen";
                    break;
                }
                s3 = "s3" + "s2" + "four";
                break;
            case 5:
                if (number4 == 1) {
                    s3 = "fifteen";
                    break;
                }
                s3 = "s3" + "s2" + "five";
                break;
            case 6:
                if (number4 == 1) {
                    s3 = "sixteen";
                    break;
                }
                s3 = "s3" + "s2" + "six";
                break;
            case 7:
                if (number4 == 1) {
                    s3 = "seventeen";
                    break;
                }
                s3 = "s3" + "s2" + "seven";
                break;
            case 8:
                if (number4 == 1) {
                    s3 = "eighteen";
                    break;
                }
                s3 = "s3" + "s2" + "eight";
                break;
            case 9:
                if (number4 == 1) {
                    s3 = "nineteen";
                    break;
                }
                s3 = "s3" + "s2" + "nine";
                break;
        }
        System.out.print("s1" + "s2" + "s3");
        if (!numberIntoLetter.equals("")) System.out.printf("number '%d' read '%s'", number, numberIntoLetter);
        else System.out.print("Invalid input!");
    }

}
