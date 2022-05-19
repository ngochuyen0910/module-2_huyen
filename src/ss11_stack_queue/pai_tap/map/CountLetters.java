package ss11_stack_queue.pai_tap.map;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeMap;

public class CountLetters {
    public static void main(String[] args) {
        String string = "My name is An and An is boy";
        String[] stringArr = string.toLowerCase().split(" ");
        System.out.println(string);
        System.out.println(Arrays.toString(stringArr));

        TreeMap<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < stringArr.length; i++) {
            if (!map.containsKey(stringArr[i])) {
                map.put(stringArr[i], 1);
            } else {
                int count = map.get(stringArr[i]);
                map.put(stringArr[i], count + 1);
            }
        }
        display(map);
    }

    public static void display(TreeMap<String, Integer> map1) {
        Set<String> keySet = map1.keySet();
        System.out.println("Số lần xuất hiện của mỗi từ trong chuỗi là: ");
        for (String key : keySet) {
            System.out.println(key + " : " + map1.get(key));
        }
    }
}
