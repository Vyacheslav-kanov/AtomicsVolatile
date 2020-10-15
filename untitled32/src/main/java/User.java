public class User {

    static User user = new User();

    synchronized void waiting(){
        try {
            if(TrinketBox.toggle) wait();
            Thread.sleep(1000);
        } catch (InterruptedException e) {}

        TrinketBox.trinket.set(true);
        System.out.println(Thread.currentThread().getName() + " Включил тренкет!");
    }

    synchronized void awaking(){
        notify();
    }
}
