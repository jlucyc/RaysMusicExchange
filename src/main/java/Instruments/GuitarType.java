package Instruments;

public enum GuitarType {

    ELECTRIC(true),
    ACOUSTIC( false),
    BASS(true);




    private boolean plugIn;

    GuitarType(boolean plugIn){

        this.plugIn = plugIn;
    }


    public boolean guitarIsPlugIn() {
        return plugIn;
    }
}
