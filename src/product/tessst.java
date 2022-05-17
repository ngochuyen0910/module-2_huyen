package product;

public class tessst {
    void method(int[] x) {
        x[0] = 5;
        x[1] = 5;
    }

    public static void main(String[] args) {
        tessst o = new tessst();
        int[] x = {1, 1};
      o.method(x);
        System.out.printf("x=%d, y=%d", x[0], x[1]);
    }
}


