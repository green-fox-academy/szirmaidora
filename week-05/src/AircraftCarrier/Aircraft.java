package AircraftCarrier;

public class Aircraft {
    String name;
    int maxAmmo;
    int baseDamage;
    int ammoStore;
    boolean priority;

    public Aircraft () {
        ammoStore = 0;
    }
    public int fight () {
        int damage = 0;
        damage = ammoStore * baseDamage;
        ammoStore = 0;
        return damage;
    }
    public int refill (int filling) {
        int rest;
        if (filling < maxAmmo - ammoStore) {
            ammoStore += filling;
            rest = 0;
        }
        else {
            rest = filling - (maxAmmo - ammoStore);
            ammoStore = maxAmmo;
        }
        return rest;
    }
    public String getType () {
        return name;
    }
    public String getStatus () {
        String status = "Type" + name + ", Ammo: " + ammoStore + ", Base Damage: " + baseDamage + ", All Damage: " + ammoStore * baseDamage;
    return status;
    }
    public boolean isPriority () {
        return priority;
    }
}
