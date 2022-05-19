package ss11_stack_queue.pai_tap.he_thong_nhan_vien;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<Personnel> personnels = new ArrayList<>();
        personnels.add(new Personnel("Huyền", "nữ", "09/10/1997"));
        personnels.add(new Personnel("An", "nam", "09/01/1990"));
        personnels.add(new Personnel("Lan", "nữ", "19/08/1998"));
        personnels.add(new Personnel("Hà", "nam", "09/05/1996"));
        System.out.println("Danh sách nhân viên: ");
        for (Personnel personnel : personnels) {
            System.out.println(personnel);
        }
        Collections.sort(personnels);
        System.out.println("Danh sách sau sắp xếp");
        for (Personnel personnel : personnels) {
            System.out.println(personnel);
        }
        Queue<Personnel> male = new LinkedList<>();
        Queue<Personnel> female = new LinkedList<>();
        for (Personnel personnel : personnels) {
            if (personnel.getGender().equals("Nam")) {
                male.add(personnel);
            } else {
                female.add(personnel);
            }
        }
        Queue<Personnel> person = new LinkedList<>();
        while (!male.isEmpty()) {
            person.add(male.poll());
        }
        while (!female.isEmpty()) {
            person.add(female.poll());
        }
        System.out.println("Danh sách liệt kê nữ trước nay nam và sắp xếp theo ngày tháng năm sinh: ");
        for (Personnel personnel : person) {
            System.out.println(personnel);
        }
    }
}