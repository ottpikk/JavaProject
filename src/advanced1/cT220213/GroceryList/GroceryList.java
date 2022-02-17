package advanced1.cT220213.GroceryList;

//TODO:
//1. addGroceryItem
//2. printGroceryItem
//3. removeGroceryItem
//4. modifyGroceryItem

import java.util.ArrayList;

public class GroceryList {
    //Fields
    private ArrayList<String> groceryList = new ArrayList<String>();

    //Methods
    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.printf("You have %s items in your grocery list\n", groceryList.size());
        for (int i = 0; i < groceryList.size(); i++){
            System.out.printf("%s. %s\n",i+1, groceryList.get(i));
        }
    }

    public void removeGroceryItem(String item){
        int position = findItem(item);
        if (position >= 0){
            removeGroceryItem(position);
        }
    }

    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }

    private void removeGroceryItem(int position){
        groceryList.remove(position);
    }

    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.printf("Grocery item %s has been modified.\n", (position +1));
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if (position >= 0){
            return true;
        } else {
            return false;
        }
    }
}
