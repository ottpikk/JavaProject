package advanced1;

abstract class Bug{
    protected String name;
    private String name2;
    public void bugSound(){
        System.out.println("Pfff");
    }
    public abstract void move();
    public void setName (String name) {this.name = name; }
    public String getName () {return name; }
}

class Ant extends Bug{
    public void move() {
        System.out.println("Run fast");
        System.out.println(name);
        // System.out.println(name2);  // as its private we do not have access
    }

}

class Bee extends Bug{

    public void move() {
        System.out.println("Fly");
    }

    public void gatherHoney(){
        System.out.println("Collect honey");
    }
}

public class Abstraction {

    public static void main(String[] args) {
        Ant bug1 = new Ant();
        bug1.bugSound();
        bug1.setName("Bobby");
        System.out.println(bug1.getName());

        System.out.println();

        Bee bug2 = new Bee();
        bug2.bugSound();
        bug2.gatherHoney();
        bug2.setName("My bee");
        System.out.println(bug2.getName());
    }

}
