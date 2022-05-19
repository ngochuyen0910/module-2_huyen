package ss11_stack_queue.pai_tap.reverse;

import java.util.Stack;

public class ReverseArrayOfIntegers {
    public static void main(String[] args) {
        Stack<Integer> array = new Stack<>();
//        array.push(1);
//        array.push(2);
//        array.push(3);
//        array.push(4);
        for (int i = 0; i < 6; i++) {
            array.push(i);
        }
        System.out.println(array);
        Stack<Integer> arrayReverse = new Stack<>();
        for (int item : array) {
            arrayReverse.push(item);
        }
        for (int i = 0; i < array.size(); i++) {
            array.set(i, arrayReverse.pop());
        }
        System.out.println(array);
    }
}
