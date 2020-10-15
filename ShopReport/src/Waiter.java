public class Waiter {

    Restaurant restaurant = new Restaurant();
    synchronized ClientThread waiteClient(){
            System.out.println(Thread.currentThread().getName() + " Жду поситителей!");
            try {
                wait();

            } catch (InterruptedException e) {}



            return null;
    }

    synchronized void service(){

    }
}
