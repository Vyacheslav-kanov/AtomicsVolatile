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

        System.out.println("Общая выручка составила: " + Revenue.revenue.get());
    }
}
