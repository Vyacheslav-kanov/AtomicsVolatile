public class ThreadUser extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Поток запущен!");

        try {
            for (int i = 0; i < 10; i++){
                User.user.waiting();
                Toy.toy.awaking();
            }
        } finally {
            System.out.println(Thread.currentThread().getName() + " Поток завершен!");
        }
    }
}
