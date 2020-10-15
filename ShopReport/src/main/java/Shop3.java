public class Shop3 extends Thread {

    @Override
    public void run() {
        int[] proceeds = new int[10];
        int summ = 0;

        for (int i = 0; i < proceeds.length; i++) {
            proceeds[i] = (int) Math.random()*(10 - 1000) + 10;
            summ += proceeds[i];
        }

        Revenue.revenue.set(summ);
    }
}
