package AircraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
    int ammoCarr;
    int health;
    List<Aircraft> carrier = new ArrayList<>();

    public Carrier(int ammoCarr, int health) {
        this.ammoCarr = ammoCarr;
        this.health = health;
    }

    public void add(Aircraft one) {
        carrier.add(one);
    }

    public int ammoNeeded() {
        int ammoNeed = 0;
        for (Aircraft ind : carrier) {
            ammoNeed += ind.maxAmmo - ind.ammoStore;
        }
        return ammoNeed;
    }

    public void fill() {
            if (ammoCarr > ammoNeeded()) {
                for (Aircraft ind : carrier) {
                    if (ind.ammoStore < ind.maxAmmo) {
                        ammoCarr -= ind.maxAmmo - ind.ammoStore;
                        ind.ammoStore = ind.maxAmmo;
                    }
                }
            } else {
                for (Aircraft ind : carrier) {
                    if (ind.ammoStore < ind.maxAmmo && ind.priority) {
                        ammoCarr -= ind.maxAmmo - ind.ammoStore;
                        ind.ammoStore = ind.maxAmmo;
                    }
                }
                for (Aircraft ind : carrier) {
                    if (ind.ammoStore < ind.maxAmmo) {
                        ammoCarr -= ind.maxAmmo - ind.ammoStore;
                        ind.ammoStore = ind.maxAmmo;
                    }
                }
            }

    }
}
