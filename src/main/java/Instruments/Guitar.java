package Instruments;

public class Guitar extends Instrument {

    private GuitarType guitarType;


    public Guitar(GuitarType guitarType, String type){
        super(type);
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

    @Override
    public String play() {
        return "Guitar Sound";
    }
}

