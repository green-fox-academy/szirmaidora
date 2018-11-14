package Sharpie;

public class Main {
    public static void main(String[] args) {
        Sharpie first = new Sharpie("grey",5);
        first.use();
        Sharpie second = new Sharpie("grey",6);
        System.out.println(first.inkAmount);
        SharpieSet mySet = new SharpieSet();
        mySet.add(first);
        mySet.add(second);
        System.out.println(mySet.countUsable());

    }
}
