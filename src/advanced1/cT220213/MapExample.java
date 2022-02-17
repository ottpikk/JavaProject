package advanced1.cT220213;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        /*Map<String, Integer> map = new HashMap<String, Integer>();

        //Add values to Map
        map.put("Bob Tree", 900);
        map.put("John Bush", 920);
        System.out.println(map);

        String key = "Bob Tree";

        //Get value from key
        System.out.println(map.get("Bob Tree"));

        //Change value
        map.replace("Bob Tree",900,960);
        System.out.printf("Bob's salary: %d\n", map.get(key));

        //All key values
        System.out.println(map.keySet());

        //Size
        System.out.println("No of keys in map: " +map.size());

        //Check if Map contains
        System.out.println(map.containsKey(key));
        System.out.println(map.containsKey("Thomas Grass"));
        System.out.println(map.containsValue(920));

        //Remove key/value pairs from map if exists
        map.remove("John Bush");
        System.out.println("No of keys in map: " +map.size());*/

        //Example2
        Map<String, String> capitalCity = new HashMap<String, String>();
        capitalCity.put("Estonia", "Tallinn");
        capitalCity.put("Finland", "Helsinki");
        capitalCity.put("Latvia", "Riga");

        System.out.println(capitalCity.get("Finland"));

        for (Map.Entry<String, String> map2 : capitalCity.entrySet()){
            System.out.print(map2.getKey()+" ");
            System.out.println(map2.getValue());
        }


    }

}
