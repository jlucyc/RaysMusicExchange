package Instruments;

import Behavoiurs.IPlay;

public abstract class Instrument implements IPlay {


    public String type;



    public Instrument(String type){

        this.type = type;

    }



    public String getType() {
        return type;
    }
}
