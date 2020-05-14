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

    public List search(GuitarSpec searchSpec){
        List matchingGuitars = new LinkedList();

        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();
            GuitarSpec guitarSpec = guitar.getSpec();
            // Ignore serial number since that's unique
            // Ignore price number since that's unique

            if (searchSpec.getBuilder() != guitarSpec.getBuilder())
                continue;

            String model = searchSpec.getModel().toLowerCase();
            if ((model != null) && (!model.equals("")) &&
                    (!model.equals(guitarSpec.getModel().toLowerCase())))
                continue;

            if (searchSpec.getType() != guitarSpec.getType())
                continue;

            if (guitarSpec.getBackWood() != searchSpec.getBackWood())
                continue;

            if (guitarSpec.getTopWood() != searchSpec.getTopWood())
                continue;

            matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }

}
