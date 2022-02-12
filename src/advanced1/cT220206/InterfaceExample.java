package advanced1.cT220206;

interface BugInterface{
    public void bugSound();
    public void bugSize();
}
interface Place{
    public void location();
}
interface Building{
    public void buildingPlan();
    public void costManagement();
}

class Ant1 implements BugInterface, Place{

    public void bugSound() {
        System.out.println("Zzzz");
    }

    public void bugSize() {
        System.out.println("Small");
    }

    public void location() {
        System.out.println("Estonia");

    }
}
class house implements Place, Building{

    public void location() {
        System.out.println("Somewhere");
    }

    public void buildingPlan() {
        System.out.println("preplanning");
    }

    public void costManagement() {
        System.out.println("Total cost: ...");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {

        Ant1 ant1 = new Ant1();
        ant1.bugSize();
        ant1.bugSound();
        ant1.location();

        System.out.println();

        house myHome = new house();
        myHome.buildingPlan();
        myHome.costManagement();
        myHome.location();

    }
}
