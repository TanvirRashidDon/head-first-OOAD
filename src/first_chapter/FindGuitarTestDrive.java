package first_chapter;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTestDrive {
    private Inventory inventory = new Inventory();

    public void doSomething() {
        initializeInventory(inventory);

        GuitarSpec whatUserLike1 = new GuitarSpec("O-423",
                Wood.BRAZILIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD, Type.ACOUSTIC, Builder.OLSON);

        GuitarSpec whatUserLike2 = new GuitarSpec("O-423",
                Wood.BRAZILIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD, Type.ACOUSTIC, Builder.OLSON);

        // Guitar guitar = inventory.search(whatUserLike1);

        List matchingGuitars = inventory.search(whatUserLike2); // No guitar will be found as model name(A445) is in smaller case

        if (!matchingGuitars.isEmpty()){
            System.out.println("You might like this : ");
            for(Iterator i = matchingGuitars.iterator(); i.hasNext(); ){
                Guitar guitar = (Guitar) i.next();
                System.out.println("We have a " + guitar.getSpec().getBuilder() + " " +
                        guitar.getSpec().getModel() + " " + guitar.getSpec().getType() + " guitar\n\t" +
                        guitar.getSpec().getBackWood() + " back and side\n\t" + guitar.getSpec().getTopWood() +
                        " top.\nYou can have it  for only " + guitar.getPrice() + "$\n-------");
            }
        }else {
            System.out.println("We have nothing for you");
        }

    }
    private static void initializeInventory (Inventory inventory){
        inventory.addGuitar("a425", 1449.99, "O-403",
                Wood.BRAZILIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD, Type.ACOUSTIC, Builder.OLSON);
        inventory.addGuitar("a445", 1999.99, "O-423",
                Wood.BRAZILIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD, Type.ACOUSTIC, Builder.OLSON);
        inventory.addGuitar("a445", 1659.99, "O-423",
                Wood.BRAZILIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD, Type.ACOUSTIC, Builder.OLSON);
    }
}
