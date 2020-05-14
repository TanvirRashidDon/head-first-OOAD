package first_chapter;

import fifth_chapter.part_a.Mandolin;
import fifth_chapter.part_a.MandolinSpec;
import fifth_chapter.part_a.Style;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTestDrive {
    private Inventory inventory = new Inventory();

    public void doSomething() {
        initializeInventory(inventory);

        MandolinSpec whatMandolinUserLike = new MandolinSpec("O-423",
                Wood.BRAZILIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD, Type.ACOUSTIC, Builder.OLSON, Style.A);

        GuitarSpec whatGuitarUserLike2 = new GuitarSpec("O-423",
                Wood.BRAZILIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD, Type.ACOUSTIC, Builder.OLSON, 6);

        List matchingInstruments = inventory.search(whatMandolinUserLike);
        //List matchingInstruments = inventory.search(whatGuitarUserLike2); // No guitar will be found as model name(A445) is in smaller case

        if (!matchingInstruments.isEmpty()){
            System.out.println("You might like this : ");
            for(Iterator i = matchingInstruments.iterator(); i.hasNext(); ){
                Mandolin guitar = (Mandolin) i.next();
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
        inventory.addInstrument("a425", 1449.99, new GuitarSpec("O-403",
                Wood.BRAZILIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD, Type.ACOUSTIC, Builder.OLSON, 6));
        inventory.addInstrument("a445", 1999.99, new GuitarSpec("O-423",
                Wood.BRAZILIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD, Type.ACOUSTIC, Builder.OLSON, 6));
        inventory.addInstrument("Z145", 2159.99, new MandolinSpec("O-423",
                Wood.BRAZILIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD, Type.ACOUSTIC, Builder.OLSON, Style.A));
        inventory.addInstrument("Z645", 2059.99, new MandolinSpec("O-423",
                Wood.BRAZILIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD, Type.ACOUSTIC, Builder.OLSON, Style.A));
    }
}
