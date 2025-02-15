
// // we are going to use the item class to get some methods and fields so we dont have to write 
// more of the dsame code. Sicne fruits share 
// some of the properties of the tiem class
public class Fruit extends Item{
    // now we can add specific attributes
    private String type;
    Fruit( String name, int quantity, String type){
        // how to pass items from our super class to our sub class
        super(name, quantity);
        this.type = type;
    }

    public String getType(){
        return type;
    }

    @Override
    public String toString() {
        return "Fruit: " + getName() + ", Quantity: " + getQuantity() + "Type: " + getType();
    }
}
