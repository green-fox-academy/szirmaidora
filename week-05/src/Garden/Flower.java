package Garden;

public class Flower extends Plant {
    public Flower(String color) {
        this.color = color;
        minimumWater = 5;
        absorb = 0.75;
    }
}
