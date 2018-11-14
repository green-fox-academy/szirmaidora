package Sharpie;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    private ArrayList<Sharpie> sharpieList = new ArrayList<>();

    public void add(Sharpie sharpie) {
        sharpieList.add(sharpie);
    }

    public int countUsable() {
        int usable = 0;
        for (int i = 0; i < sharpieList.size(); i++) {
            if (sharpieList.get(i).inkAmount > 0) {
                usable++;
            }
        }
        return usable;
    }

    public void removeTrash() {
        for (int i = 0; i < sharpieList.size(); i++) {
            if (sharpieList.get(i).inkAmount == 0) {
                sharpieList.remove(i);
            }

        }

    }
}
