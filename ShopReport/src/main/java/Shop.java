import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;

public class Shop extends Thread {

    private LongAdder revenue;
    private final Random rand = new Random();

    public Shop(LongAdder revenue) {
        this.revenue = revenue;
    }

    @Override
    public void run() {
        int[] proceeds = new int[10];

        for (int i = 0; i < proceeds.length; i++) {
            proceeds[i] = rand.nextInt(10000);
            revenue.add(proceeds[i]);
        }
    }
}
