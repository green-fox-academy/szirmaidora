package Animal;

public class Main {
    public static void main(String[] args) {

        Animal monkey = new Animal();
        monkey.eat();
        System.out.println(monkey.hunger);
        Animal sheep = new Animal();
        Animal pig = new Animal();
        Farm myFarm = new Farm();
        myFarm.add(monkey);
        myFarm.add(sheep);
        sheep.play();
        myFarm.add(pig);
        myFarm.breed(6);
        myFarm.slaughter();


    }
}
