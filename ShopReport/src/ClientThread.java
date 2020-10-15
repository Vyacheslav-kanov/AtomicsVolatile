public class ClientThread extends Thread {

    private static Order order = null;
    private static Order completeOrder = null;

    @Override
    public void run() {
        try {

            System.out.println(Thread.currentThread().getName() + " Зашел в ресторан!");


            Thread.sleep(3000);


        } catch (InterruptedException e) {

        }finally {
            System.out.println(getName() + "вышел из ресторана");
        }
    }


}
