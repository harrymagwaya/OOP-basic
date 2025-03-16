
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


    // in order to print the specifics of this class i made my sublcass to be able
    // to create its own print statement
    // which prints according to the specifics of the class.
    // Its advisable for subclasses to override the method that invokes it inorder
    // to fit obj that invokes it

    @Override
    public String toString() {
        return "Fruit: " + getName() + ", Quantity: " + getQuantity() + "Type: " + getType();
    }
}
