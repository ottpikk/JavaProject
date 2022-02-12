package advanced1.cT220206;

enum Level{
    LOW,
    MEDIUM,
    HIGH
}

public class EnumExample {
    public static void main(String[] args) {

        Level myLevel;

        Double numOfRaces = Math.random() * 10;
        if (numOfRaces >= 10){
            myLevel = Level.HIGH;
        } else if (numOfRaces >= 5){
            myLevel = Level.MEDIUM;
        } else {
            myLevel = Level.LOW;
        }

        switch (myLevel){
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
        }
    }
}
