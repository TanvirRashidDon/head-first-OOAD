package first_chapter;

public class FindGuitarTestDrive {
    private Inventory inventory = new Inventory();

    public void doSomething() {
        initializeInventory(inventory);

        Guitar whatUserLike = new Guitar("A445", "someBuilder", "someModel", "someType",
                "someBackWood", "someTopWood", 1449.99);

        Guitar guitar = inventory.search(whatUserLike);

        if (guitar != null){
            System.out.println("You might like this : " +
                    guitar.getBuilder() + " " + guitar.getModel() + " " +
                    guitar.getType() + " " + guitar.getBackWood() + " " +
                    guitar.getTopWood() + " Only at " + guitar.getPrice() + "$");
        }else {
            System.out.println("We have nothing for your");
        }

    }
    private static void initializeInventory (Inventory inventory){
        inventory.addGuitar("A445", "someBuilder", "someModel", "someType",
                "someBackWood", "someTopWood", 1449.99);
        inventory.addGuitar("A445", "someBuilder", "someModel", "someType",
                "someBackWood", "someTopWood", 1549.99);
    }
}
