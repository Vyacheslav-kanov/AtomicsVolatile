import java.util.Random;

public class Shop extends Thread {

    @Override
    public void run() {
        int[] proceeds = new int[10];
        int summ = 0;

        for (int i = 0; i < proceeds.length; i++) {
            proceeds[i] = (int) new Random().nextInt(1000);
            summ += proceeds[i];
        }
        Revenue.revenue.addAndGet(summ);
        System.out.println(Thread.currentThread().getName() + "выручка составила: " + summ + ".руб");
    }
}
