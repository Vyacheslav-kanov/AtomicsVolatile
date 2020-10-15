public class Main {


    public static void main(String[] args) {

        ThreadUser threadUser = new ThreadUser();
        Thread user = new Thread(threadUser, "Пользователь");
        user.start();

        ThreadToy threadToy = new ThreadToy();
        Thread toy = new Thread(threadToy, "Игрушка");
        toy.start();

        while (user.isAlive()) continue;
        toy.interrupt();
    }
}
