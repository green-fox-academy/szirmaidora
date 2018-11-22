package main.java.music;

public class ElectricGuitar extends StringedInstrument {
    public ElectricGuitar (int numberOfStrings) {
        name = "Electric Guitar";
        this.numberOfStrings = numberOfStrings;
        soundd = "Twang";
    }
    public ElectricGuitar () {
        numberOfStrings = 6;
    }

public String sound () {
        return soundd;
}
}
