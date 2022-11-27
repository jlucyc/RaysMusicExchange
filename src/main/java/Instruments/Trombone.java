package Instruments;

public class Trombone extends Instrument {

    private int buttons;

    public Trombone(int buttons, String type, int buyPrice, int sellPrice){
        super(type, buyPrice, sellPrice);
        this.buttons = buttons;
    }


    @Override
    public String play() {
        return "Trombone sound";
    }

    public int getButtons() {
        return buttons;
    }

    @Override
    public int calculateMarkup() {
        return sellPrice - buyPrice;
    }
}
