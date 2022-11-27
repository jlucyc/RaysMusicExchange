package Instruments;

public class Woodwind extends Instrument {

    private WoodwindType woodwindType;

    public Woodwind(WoodwindType woodwindType, String type, int buyPrice, int sellPrice){
        super(type, buyPrice, sellPrice);
        this.woodwindType = woodwindType;
    }

    public WoodwindType getWoodwindType() {
        return woodwindType;
    }



    public String getReedType(){
        return woodwindType.getReedType();
    }


    public String play() {
        return "Woodwind sound";
    }

    @Override
    public int calculateMarkup() {
        return sellPrice - buyPrice;
    }
}
