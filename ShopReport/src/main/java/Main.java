public class Main {

    public static void main(String[] args) {

        Shop shop1 = new Shop();
        Shop shop2 = new Shop();
        Shop shop3 = new Shop();

        Thread threadShop1 = new Thread(shop1, "Магазин1 ");
        Thread threadShop2 = new Thread(shop2, "Магазин2 ");
        Thread threadShop3 = new Thread(shop3, "Магазин3 ");

        threadShop1.start();
        threadShop2.start();
        threadShop3.start();

        while (threadShop1.isAlive());
        while (threadShop2.isAlive());
        while (threadShop3.isAlive());


        System.out.println("Магазин 1 выручка составила: " + shop1.getRevenue());
        System.out.println("Магазин 2 выручка составила: " + shop2.getRevenue());
        System.out.println("Магазин 3 выручка составила: " + shop3.getRevenue());
        System.out.println("Общая выручка составила: " + (shop1.getRevenue() + shop2.getRevenue() + shop3.getRevenue()));
    }
}
