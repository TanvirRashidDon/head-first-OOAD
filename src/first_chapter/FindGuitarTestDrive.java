package first_chapter;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTestDrive {
    private Inventory inventory = new Inventory();

    public void doSomething() {
        initializeInventory(inventory);

        Guitar whatUserLike1 = new Guitar("A445", Builder.OLSON, "someModel", Type.ACOUSTIC,
                Wood.BRAZILIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD, 1449.99);

        Guitar whatUserLike2 = new Guitar("A445", Builder.OLSON, "someModel", Type.ACOUSTIC,
                Wood.BRAZILIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD, 1449.99);

        // Guitar guitar = inventory.search(whatUserLike1);

        List matchingGuitars = inventory.search(whatUserLike2); // No guitar will be found as model name(A445) is in smaller case

        if (!matchingGuitars.isEmpty()){
            System.out.println("You might like this : ");
            for(Iterator i = matchingGuitars.iterator(); i.hasNext(); ){
                Guitar guitar = (Guitar) i.next();
                System.out.println("We have a " + guitar.getBuilder() + " " + guitar.getModel() + " " +
                        guitar.getType() + "guitar\n\t" + guitar.getBackWood() + " back and side\n\t" +
                        guitar.getTopWood() + " top.\nYou can have it  for only " +
                        guitar.getPrice() + "$\n-------");
            }

        }else {
            System.out.println("We have nothing for your");
        }

    }
    private static void initializeInventory (Inventory inventory){
        inventory.addGuitar("A445", Builder.OLSON, "someModel", Type.ACOUSTIC,
                Wood.BRAZILIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD, 1449.99);
        inventory.addGuitar("A445", Builder.OLSON, "someModel", Type.ACOUSTIC,
                Wood.BRAZILIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD, 1549.99);
        inventory.addGuitar("A445", Builder.OLSON, "someModel", Type.ACOUSTIC,
                Wood.BRAZILIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD, 1449.99);
    }
}
