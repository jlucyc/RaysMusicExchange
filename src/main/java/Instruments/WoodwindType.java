package Instruments;

public enum WoodwindType {

    SAXOPHONE(150, 300, "Single"),
    CLARINET(150, 350, "Single"),
    OBOE(200, 250, "Double");

    private int buyPrice;
    private int sellPrice;
    private String reedType;

    WoodwindType(int buyPrice, int sellPrice, String reedType){
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
        this.reedType = reedType;

    }


    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public String getReedType() {
        return reedType;
    }
}
