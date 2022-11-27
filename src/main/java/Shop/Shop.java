package Shop;

import Behavoiurs.ISell;

import java.util.ArrayList;

public abstract class Shop implements ISell {

    private ArrayList<> stock;

    public Shop(){
        this.stock = new ArrayList<>();
    }

    public ArrayList<ArrayList<DrumItem>> getStock() {
        return stock;
    }

    public void addItem(){
        stock.add(0, drumItem);
    }

    public void removeItem(){
        stock.remove();
    }

}
