package manager;

import java.util.Scanner;

public class Test {
    public static Person[] array = new Person[100];
    static Scanner scanner = new Scanner(System.in);
    public static int count = 0;

    static {
        array[0] = new Student(1, "Huyen", 12, true, 5);
        array[1] = new Teacher(2, "Lan", 34, false, 9000);
        array[2] = new Student(3, "An", 13, true, 9);
        array[3] = new Teacher(4, "An", 13, true, 7000);
        count = 4;
    }

    public static void displayList() {
        for (Person person : array) {
            if (person != null) {
                System.out.println(person);
            }
        }
    }

    public static void addNew() {
        System.out.println("1. Add new student");
        System.out.println("2. Add new teacher");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                System.out.println("Add new");
                System.out.println("Nhập tên");
                String name = scanner.nextLine();
                System.out.println("Nhập tuổi");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập giới tính");
                boolean gender = Boolean.parseBoolean(scanner.nextLine());
                System.out.println("Nhập điểm");
                double point = Double.parseDouble(scanner.nextLine());

                Student student = new Student(count + 1, name, age, gender, point);
                array[count] = student;
                count++;
                break;
            case 2:
                System.out.println("Add new");
                System.out.println("Nhập tên");
                String name1 = scanner.nextLine();
                System.out.println("Nhập tuổi");
                int age1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập giới tính");
                boolean gender1 = Boolean.parseBoolean(scanner.nextLine());
                System.out.println("Nhập lương");
                double salary = Double.parseDouble(scanner.nextLine());

                Teacher teacher = new Teacher(count + 1, name1, age1, gender1, salary);
                array[count] = teacher;
                count++;
        }
    }

    public static void search() {
        int temp = 0;
        System.out.println("Tên muốn tìm");
        String inputSearch = scanner.nextLine();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].getName().contains(inputSearch)) {
                System.out.println(array[i]);
                temp++;
            }
        }
        if (temp == 0) {
            System.out.println("Không tìm thấy");
        }
    }

    public static void delete() {
        int temp = 0;
        System.out.println("Vị trí muốn xóa");
        int inputId = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].getId() == inputId) {
                for (int j = i; j < array.length && array[j] != null; j++) {
                    array[j] = array[j + 1];
                }
                System.out.println("Xóa thành công");
                temp++;
            }
        }
        if (temp == 0) {
            System.out.println("Xóa không thành công");
        }
    }

    public static void main(String[] args) {
        do {
            System.out.println("Employee and student management");
            System.out.println("1. Display list");
            System.out.println("2. Add new");
            System.out.println("3. Search");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.println("Choose options: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Display list");
                    displayList();
                    break;
                case 2:
                    System.out.println("Add new");
                    addNew();
                    break;
                case 3:
                    System.out.println("Search");
                    search();
                    break;
                case 4:
                    System.out.println("Delete");
                    delete();
                    break;
                case 5:
                    System.exit(0);
            }
        } while (true);
    }
}
