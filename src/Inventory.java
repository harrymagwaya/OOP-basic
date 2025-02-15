import java.util.ArrayList;

// encapsulation enables us to add an item to the inventory using the inventory constructor
//enables us to access private items through the public methods 
public class Inventory {
    private ArrayList<Item> items;

    Inventory(){
        items = new ArrayList<>();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void displayInventory(){
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }
         
}
