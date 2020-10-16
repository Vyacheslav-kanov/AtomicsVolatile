public class ThreadUser extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Поток запущен!");

        try {
            for (int i = 0; i < 10; i++){
                while (TrinketBox.isToggle());
                Thread.sleep(1000);
                TrinketBox.setToggle(true);
                System.out.println(Thread.currentThread().getName() + " включил тринкет!");
            }
        } catch (InterruptedException e) {
        } finally {
            System.out.println(Thread.currentThread().getName() + " Поток завершен!");
        }
    }
}
