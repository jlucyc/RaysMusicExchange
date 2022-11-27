package Instruments;

public enum GuitarType {

    ELECTRIC(200,400, true),
    ACOUSTIC(100, 200, false),
    BASS(250, 450, true);

    private int guitarBuyPrice;
    private int guitarSellPrice;

    private boolean plugIn;

    GuitarType(int buyPrice, int sellPrice, boolean plugIn){
        this.guitarSellPrice = sellPrice;
        this.guitarBuyPrice = buyPrice;
        this.plugIn = plugIn;
    }

    public int getGuitarBuyPrice() {
        return guitarBuyPrice;
    }

    public int getGuitarSellPrice() {
        return guitarSellPrice;
    }

    public boolean guitarIsPlugIn() {
        return plugIn;
    }
}
