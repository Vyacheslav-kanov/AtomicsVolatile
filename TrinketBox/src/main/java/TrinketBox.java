public class TrinketBox {

   static volatile boolean toggle = true;
   static TrinketBox trinket = new TrinketBox();

   synchronized void set(boolean value){
      toggle = value;
   }
}
