package ss15_exception_debug.thuc_hanh;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Hãy nhập y: ");
        int y = scanner.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x, y);
    }

    private void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            System.out.println("Thương x / y = " + d);
        } catch (Exception e) {
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }

    public static class Demo {
        static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
    //        int number = scanner.nextInt();
            inputArray();
    //        try {
    //            inputArray();
    //        } catch (InputMismatchException e) {
    //            System.out.println("Không được nhập ký tự chữ");
    //            e.printStackTrace();
    //        } catch (NegativeArraySizeException e) {
    //            System.out.println("Không được nhập số âm");
    //            e.printStackTrace();
    //        } catch (ArrayIndexOutOfBoundsException exception) {
    //            System.out.println("Truy cập quá size");
    //        } catch (Exception e) {
    //            System.out.println("NHập lỗi");
    //        } finally {
    //            System.out.println("Chạy FInally!");
    //        }

    //        try {
    //            checkedException();
    //        } catch (FileNotFoundException e) {
    //            e.printStackTrace();
    //        }
        }

        public static void checkedException() throws FileNotFoundException {
            FileReader fileReader = new FileReader("abc");
        }

        public static void inputArray() {
            System.out.println("Nhập kích thước của mảng");
            boolean check = false;
            int size = 0;
            do {
                check = false;
                try {
                    size = Integer.parseInt(scanner.nextLine());
    //            if (size % 2 == 0){
    //                throw new MyException("Size phải là số lẻ!");
    //            }
                    int[] numArr = new int[size];
                    System.out.println(numArr[100]);
                } catch (InputMismatchException e) {
                    System.out.println("Không được nhập ký tự chữ, vui lòng nhập lại: ");
                    check = true;
                    e.printStackTrace();
                } catch (NegativeArraySizeException e) {
                    System.out.println("Không được nhập số âm, vui lòng nhập lại: ");
                    check = true;
    //                e.printStackTrace();
                } catch (ArrayIndexOutOfBoundsException exception) {
                    System.out.println("Truy cập quá size, vui lòng nhập lại: ");
                    check = true;
                } catch (Exception e) {
                    System.out.println("NHập lỗi, vui lòng nhập lại: ");
                    check = true;
                }
            } while (check);
        }
    }
}

