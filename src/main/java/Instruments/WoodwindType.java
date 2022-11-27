package Instruments;

public enum WoodwindType {

    SAXOPHONE("Single"),
    CLARINET("Single"),
    OBOE("Double");

    private String reedType;

    WoodwindType(String reedType){
        this.reedType = reedType;

    }

    public String getReedType() {
        return reedType;
    }
}
