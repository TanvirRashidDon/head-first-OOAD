package first_chapter;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List guitars;

    public Inventory(){
        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, Double price, String model, Wood backWood, Wood topWood, Type type, Builder builder){
        GuitarSpec spec = new GuitarSpec(model, backWood, topWood, type, builder);
        Guitar guitar = new Guitar(serialNumber, price, spec);

        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber){
        for(Iterator i = guitars.iterator(); i.hasNext(); ){
            Guitar guitar = (Guitar) i.next();

            if(guitar.getSerialNumber().equals(serialNumber)){
                return guitar;
            }
        }
        return null;
    }

    public List search(Guitar searchGuitar){
        List matchingGuitars = new LinkedList();

        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();

            // Ignore serial number since that's unique
            // Ignore price number since that's unique

            if (searchGuitar.getSpec().getBuilder() != guitar.getSpec().getBuilder())
                continue;

            String model = searchGuitar.getSpec().getModel().toLowerCase();
            if ((model != null) && (!model.equals("")) &&
                    (!model.equals(guitar.getSpec().getModel().toLowerCase())))
                continue;

            if (searchGuitar.getSpec().getType() != guitar.getSpec().getType())
                continue;

            if (guitar.getSpec().getBackWood() != searchGuitar.getSpec().getBackWood())
                continue;

            if (guitar.getSpec().getTopWood() != searchGuitar.getSpec().getTopWood())
                continue;

            matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }

}
