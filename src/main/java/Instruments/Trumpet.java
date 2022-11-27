package Instruments;

public class Trumpet extends Instrument {

    private int valves;


    public Trumpet(int valves, String type){
        super(type);
        this.valves = valves;
    }


    public int getValves() {
        return valves;
    }

    public String play(){
        return "Trumpet sound";
    }
}
