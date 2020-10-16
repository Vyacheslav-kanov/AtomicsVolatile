public class TrinketBox {

   static private volatile boolean toggle = true;

   public static boolean isToggle() {
      return toggle;
   }

   public static void setToggle(boolean toggle) {
      TrinketBox.toggle = toggle;
   }
}
