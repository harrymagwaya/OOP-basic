public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Inventory inventory = new Inventory();

        Item item1 = new Item("Apples",10 );
        Item item2 = new Item("Sword", 7);

        inventory.addItem(item1);
        inventory.addItem(item2);
    }
}
