package advanced1;

public class Animal {
    protected String name;
    protected double weight;

    public void animalSound(){
        System.out.println("Zzzzz...");
    }
}

class Pig extends Animal{
    protected String color;
    public void animalSound(){
        System.out.println("Oink Oink");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.animalSound();

        Pig pig = new Pig();
        pig.animalSound();
    }

}
