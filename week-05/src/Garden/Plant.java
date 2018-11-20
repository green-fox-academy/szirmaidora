package Garden;

public class Plant {
    private double waterAmount;
    int minimumWater;
    double absorb;
    String color;


    public Plant(String color) {
        this.color = color;
        absorb = 1;
    }

    public Plant() {

    }


    public boolean needsWater() {
        return waterAmount <= minimumWater;

    }

    public void watered(int water) {
        waterAmount = waterAmount + water * absorb;

    }

    public String needsW() {
        String needs = "";
        if (needsWater()) {
            needs = " needs water.";
            return needs;
        }
    else needs =  "doesn't need water.";
    return needs;
    }

    public String introduce() {
        String intro = "The " + color + " " + getClass().getSimpleName() + " " + needsW();
        return intro;
    }

}
