package Instruments;

public class Woodwind extends Instrument {

    private WoodwindType woodwindType;

    public Woodwind(WoodwindType woodwindType, String type){
        super(type);
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


    public String play() {
        return "Woodwind sound";
    }
}
