package Instruments;

public class Woodwind {

    private WoodwindType woodwindType;

    public Woodwind(WoodwindType woodwindType){
        this.woodwindType = woodwindType;
    }

    public WoodwindType getWoodwindType() {
        return woodwindType;
    }

    public int getWoodwindBuyPrice(){
        return woodwindType.getBuyPrice();
    }

    public int getWoodwindSellPrice(){
        return woodwindType.getSellPrice();
    }

    public String getReedType(){
        return woodwindType.getReedType();
    }
}
