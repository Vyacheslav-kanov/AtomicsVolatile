public class Client {

    private Restaurant restaurant = new Restaurant();

//    synchronized WaiterThread newClient(){
//
//        try {
//            wait();
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        WaiterThread task = restaurant.waiterThreads.get(0);
//        restaurant.waiterThreads.remove(task);
//        return task;
//    }

    synchronized WaiterThread newClient(ClientThread client){
        restaurant.clientThreads.add(client);
        try {
            Thread.sleep(3000);
            wait();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        restaurant.clientThreads.remove(client);
        System.out.println(Thread.currentThread().getName() + "Вышел из ресторана!");

        return
    }

}
