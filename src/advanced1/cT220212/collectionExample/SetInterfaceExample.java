package advanced1.cT220212.collectionExample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterfaceExample {
    public static void main(String[] args) {
        // HashSet example 1

       /* Set<String> name = new HashSet<String>();

        // Add elements
        name.add("John");
        name.add("Johanna");
        name.add("Zohanna");
        name.add("Lizabeth");
        name.add("Ken");
        name.add("Ken");
        System.out.println(name);

        name.remove("Zohanna");
        System.out.println(name);

        //Size
        System.out.printf("The size of the HashSet is %s\n",name.size());
        //Contains
        System.out.printf("It contains name John - %s\n", name.contains("John"));

        // Iterate1 foreachLoop
        for (String n: name){       //Local variable n  iterates name values to n
            System.out.println(n);
        }
        // Iterate2 iterator
        Iterator<String> i = name.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
*/

        //HashSet example 2

        Set<Integer> intSet1 = new HashSet<Integer>();
        intSet1.add(1);
        intSet1.add(2);
        intSet1.add(3);
        intSet1.add(4);

        System.out.println(intSet1);

        Set<Integer> intSet2 = new HashSet<Integer>();
        intSet2.add(3);
        intSet2.add(4);
        intSet2.add(5);
        intSet2.add(6);
        System.out.println(intSet2);

        // Find union
        Set<Integer> union = new HashSet<Integer>(intSet1);
        union.addAll(intSet2);

        // Find intersection
        Set<Integer> intersection = new HashSet<Integer>(intSet1);
        intersection.retainAll(intSet2);

        //Find difference
        Set<Integer> difference = new HashSet<Integer>(intSet1);
        difference.removeAll(intSet2);
        System.out.printf("\tUnique elements in intSet1: %s\n\t" +
                            "union after adding intSet2: %s\n\t" +
                            "Intersection: %s",difference,union,intersection);
    }
}
