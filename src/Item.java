
//used to create an
public class Item {
    private String name;
    private int quantity;

    // define a constructor of class
    Item(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }

    public int getQuantity(){
        return quantity;
    }

    @Override
    public String toString(){
        return "Item: " + getName() + ", Quantity: " + getQuantity();
    }
}
