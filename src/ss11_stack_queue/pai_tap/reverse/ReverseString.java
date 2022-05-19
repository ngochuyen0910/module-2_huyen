package ss11_stack_queue.pai_tap.reverse;

import java.util.Arrays;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String string = "Da Nang dep lam";
        String[] stringArr = string.split(" ");
        System.out.println(Arrays.toString(stringArr));

        Stack<String> stringReverse = new Stack<>();
        for (String item : stringArr) {
            stringReverse.push(item);
        }
        string = "";
        while (!stringReverse.isEmpty()) {
            string += stringReverse.pop() + " ";
        }
        System.out.println(string);
    }
}
