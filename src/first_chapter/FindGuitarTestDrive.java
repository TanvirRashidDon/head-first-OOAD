package first_chapter;

public class FindGuitarTestDrive {
    private Inventory inventory = new Inventory();

    public void doSomething() {
        initializeInventory(inventory);

        Guitar whatUserLike1 = new Guitar("A445", Builder.OLSON, "someModel", Type.ACOUSTIC,
                Wood.BRAZILIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD, 1449.99);

        Guitar whatUserLike2 = new Guitar("A445", Builder.OLSON, "someModel", Type.ACOUSTIC,
                Wood.BRAZILIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD, 1449.99);

        // Guitar guitar = inventory.search(whatUserLike1);

        Guitar guitar = inventory.search(whatUserLike2); // No guitar will be found as model name(A445) is in smaller case

        if (guitar != null){
            System.out.println("You might like this : " +
                    guitar.getBuilder() + " " + guitar.getModel() + " " +
                    guitar.getType() + " " + guitar.getBackWood() + " " +
                    guitar.getTopWood() + " (Only at " + guitar.getPrice() + "$)");
        }else {
            System.out.println("We have nothing for your");
        }

    }
    private static void initializeInventory (Inventory inventory){
        inventory.addGuitar("A445", Builder.OLSON, "someModel", Type.ACOUSTIC,
                Wood.BRAZILIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD, 1449.99);
        inventory.addGuitar("A445", Builder.OLSON, "someModel", Type.ACOUSTIC,
                Wood.BRAZILIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD, 1549.99);
    }
}
