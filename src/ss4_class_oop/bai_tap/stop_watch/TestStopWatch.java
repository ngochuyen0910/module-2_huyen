package ss4_class_oop.bai_tap.stop_watch;

public class TestStopWatch {
    public static void main(String[] args) {
        double[] arr = new double[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i] = Math.random();
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    double tempt = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tempt;
                }
            }
        }
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }
}
