package Instruments;

public class Trumpet extends Instrument {

    private int valves;


    public Trumpet(int valves, String type, int buyPrice, int sellPrice){
        super(type, buyPrice, sellPrice);
        this.valves = valves;
    }


    public int getValves() {
        return valves;
    }

    public String play(){
        return "Trumpet sound";
    }

    @Override
    public int calculateMarkup() {
        return sellPrice - buyPrice;
    }
}
