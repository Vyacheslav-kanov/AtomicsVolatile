public class ThreadToy extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Поток запущен!");

        try {
            while (!isInterrupted()) {
                while (!TrinketBox.isToggle()) ;
                TrinketBox.setToggle(false);
                System.out.println(Thread.currentThread().getName() + " Выключила тринкет!");
            }
        }finally {
            System.out.println(Thread.currentThread().getName() + " Поток завершен!");
        }
    }
}
