public class Toy {

    static Toy toy = new Toy();

    synchronized void waiting(){
        try {
            if(!TrinketBox.toggle) wait();
            TrinketBox.trinket.set(false);
            System.out.println(Thread.currentThread().getName() + " Выключила тринкет!");

        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " Поток завершен!");
        }
    }

    synchronized void awaking(){
        notify();
    }
}
