package Instruments;

public class Guitar {

    private GuitarType guitarType;

    public Guitar(GuitarType guitarType){
        this.guitarType = guitarType;
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }

    public int getGuitarBuyPrice(){
        return guitarType.getGuitarBuyPrice();
    }

    public int getGuitarSellPrice(){
        return guitarType.getGuitarSellPrice();
    }

    public boolean guitarIsPlugIn(){
        return guitarType.guitarIsPlugIn();
    }
}

