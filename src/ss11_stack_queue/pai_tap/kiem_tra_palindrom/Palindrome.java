package ss11_stack_queue.pai_tap.kiem_tra_palindrom;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        System.out.print("Nhập một chuỗi : ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine().toLowerCase();
        Stack stack = new Stack();
        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }
        System.out.println(inputString);
        String reverseString = "";
        while (!stack.isEmpty()) {
            reverseString += stack.pop();
        }
        if (inputString.equals(reverseString)) {
            System.out.println("Là chuỗi Palindrome");
        } else {
            System.out.println("Không phải chuỗi Palindrome");
        }
    }
}
