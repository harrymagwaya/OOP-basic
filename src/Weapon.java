public class Weapon  extends Item{
    private int damage;
    private String type;

    Weapon(String name, int quantity, int damage, String type){
        super(name, quantity);
        this.damage= damage;
        this.type =type;
    }

    public int getDamage(){
        return damage;
    }

    public String getType(){
        return type;
    }

    // in order to print the specifics of this class i made my sublcass to be able to create its own print statement 
    // which prints according to the specifics of the class. 
    //Its advisable for subclasses to override the method that invokes it inorder to fit obj that invokes it
    @Override
    public String toString(){
        return "Weapon: " + getName() + "Quantity: " + getQuantity() + "Damage: " + getDamage() + "Type: " + getType();
    }

}
