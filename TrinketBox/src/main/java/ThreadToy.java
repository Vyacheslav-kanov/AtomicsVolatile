public class ThreadToy extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Поток запущен!");

        while (!isInterrupted()){
                Toy.toy.waiting();
                User.user.awaking();
            }
    }
}
