package advanced1.cT220213;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        Queue<String> pokemon = new LinkedList<String>();
        pokemon.offer("Pikachu");
        pokemon.add("Charamnder");
        System.out.println(pokemon.offer("Covid"));

        System.out.println(pokemon);
        System.out.println(pokemon.peek()); //FIFO first in first out


    }
}
