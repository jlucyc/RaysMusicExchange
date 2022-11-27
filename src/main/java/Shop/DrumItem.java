package Shop;

import Behavoiurs.ISell;

public class DrumItem extends Shop implements ISell {

   private String description;
   private int buyPrice;
   private int sellPrice;

   public DrumItem(String description, int buyPrice, int sellPrice){
       this.description = description;
       this.buyPrice = buyPrice;
       this.sellPrice = sellPrice;
   }





    @Override
    public int calculateMarkup() {
        return sellPrice - buyPrice;
    }

    public String getDescription() {
        return description;
    }
}
