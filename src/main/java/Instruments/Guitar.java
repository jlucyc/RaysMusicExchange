package Instruments;

public class Guitar extends Instrument {

    private GuitarType guitarType;


    public Guitar(GuitarType guitarType, String type, int buyPrice, int sellPrice){
        super(type, buyPrice, sellPrice);
        this.guitarType = guitarType;
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }



    public boolean guitarIsPlugIn(){
        return guitarType.guitarIsPlugIn();
    }

    @Override
    public String play() {
        return "Guitar Sound";
    }

    @Override
    public int calculateMarkup() {
        return sellPrice - buyPrice;
    }
}

