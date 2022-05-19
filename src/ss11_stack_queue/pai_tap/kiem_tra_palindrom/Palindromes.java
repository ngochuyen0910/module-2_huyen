package ss11_stack_queue.pai_tap.kiem_tra_palindrom;

import java.util.*;

public class Palindromes {
    public static void main(String[] args) {
        System.out.print("Nhập vào một chuỗi : ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine().toLowerCase();
        String[] array = inputString.split("");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < inputString.length(); i++) {
            stack.push(array[i]);
        }
        System.out.println(inputString);
        Queue<String> queue = new ArrayDeque<>();
        for (int i = 0; i < inputString.length(); i++) {
            queue.add(array[i]);
        }
        System.out.println(queue);
        boolean check = true;
        for (int i = 0; i < inputString.length(); i++) {
            if (!stack.pop().equals(queue.poll())) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("là chuỗi Palindrome");
        } else {
            System.out.println("không phải chuỗi Palindrome");
        }
    }
}
