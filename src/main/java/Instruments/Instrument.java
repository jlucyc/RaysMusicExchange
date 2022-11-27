package Instruments;

import Behavoiurs.IPlay;
import Behavoiurs.ISell;

public abstract class Instrument implements IPlay, ISell {


    public String type;
    public int buyPrice;
    public int sellPrice;



    public Instrument(String type, int buyPrice, int sellPrice){

        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;

    }

    public String getType() {
        return type;
    }

}
