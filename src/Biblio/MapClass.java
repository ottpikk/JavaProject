package Biblio;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapClass {
    public static void main(String[] args) {

        String[] allNames = {
                "Jane", "Adams",
                "Muhammad", "Ali",
                "Stephan", "Ambrose",
                "Louis", "Armstrong",
                "Joan", "Baez",
                "Josephine", "Baker",
                "Eleanor", "Roosevelt",
                "Frank", "Sinatra"
        };

        // Put first names and last names into separate Arrays
        String[] firstNames = new String[allNames.length/2];
        String[] lastNames = new String[allNames.length/2];
        for (int i = 0; i < allNames.length; i++){
            if (i %2 == 0){
                firstNames[i/2] = allNames[i];
            } else {
                lastNames[i/2] = allNames[i];
            }
        }
        // Check if works
        System.out.println(Arrays.toString(firstNames));
        System.out.println(Arrays.toString(lastNames));

        //Put the information into map
        Map<String, String> famousPeople = new HashMap<String, String>();
        for (int i = 0; i < lastNames.length; i++){
            famousPeople.put(lastNames[i], firstNames[i]);
        }
        //Call the names
        System.out.println(famousPeople.get("Adams"));
        System.out.println(famousPeople.get("Sinatra"));

    }
}
