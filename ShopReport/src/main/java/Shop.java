import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

public class Shop extends Thread {

    static AtomicLong revenue = new AtomicLong(0);

    @Override
    public void run() {
        int[] proceeds = new int[10];
        int summ = 0;

        for (int i = 0; i < proceeds.length; i++) {
            proceeds[i] = (int) new Random().nextInt(1000);
            summ += proceeds[i];
        }
        revenue.addAndGet(summ);
        System.out.println(Thread.currentThread().getName() + "выручка составила: " + summ + ".руб");
    }
}
