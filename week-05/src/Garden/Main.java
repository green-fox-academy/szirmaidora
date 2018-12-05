package Garden;

public class Main {
    public static void main(String[] args) {
        Garden garden = new Garden();
        Flower tulip = new Flower("yellow");
        garden.addPlants(tulip);
        Tree oak = new Tree("purple");
        garden.addPlants(oak);
        garden.water(40);




    }
}
