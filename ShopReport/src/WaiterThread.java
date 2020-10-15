public class WaiterThread extends Thread {

    Waiter waiter = new Waiter();
    Restaurant restaurant = new Restaurant();

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "На работе!");

    }
}
