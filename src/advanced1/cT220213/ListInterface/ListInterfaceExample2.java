package advanced1.cT220213.ListInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInterfaceExample2 {
    public static void main(String[] args) {

        //ArrayList example 1
      /*  List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        List<Integer> list2 = new ArrayList<Integer>(list);
        System.out.println(list2);
        //list2.addAll(list);

        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        System.out.println(list2);

        for (Integer list3 : list2){
            System.out.println(list3);
        }*/

        //ArrayList example 2
       /* List<String> arrayList = new ArrayList<String>();
        arrayList.add("Test1");
        arrayList.add("Test2");
        arrayList.add("Test3");

        arrayList.add(2,"Test2.1");
        System.out.println(arrayList);

        for (String printAll : arrayList){
            System.out.printf("%s ",printAll);
        }
        System.out.println();
        for (int i = 0; i < arrayList.size();i++){
            System.out.printf("Element at index %s is %s\n",i,arrayList.get(i));
        }*/

        //LinkedList
        LinkedList<String> car = new LinkedList<String>();
        car.add("Toyota");
        car.add("Mitsubishi");
        car.add("Nissan");
        System.out.println(car);

        System.out.println(car.contains("Opel"));
        System.out.println(car.contains("Mitsubishi"));

        car.addFirst("Mercedes");
        System.out.println(car);
        System.out.println(car.getLast());
        System.out.println(car.get(car.size()/2));

        car.removeFirst();
        System.out.println(car);

        List<Integer> linkedList = new LinkedList<Integer>();
        for (int i = 1; i <= 100; i++){
            linkedList.add(i);
        }
        System.out.println(linkedList);



    }
}
