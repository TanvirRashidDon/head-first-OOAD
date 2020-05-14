package first_chapter;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List guitars;

    public Inventory(){
        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, Builder builder, String model, Type type, Wood backWood, Wood topWood, double price){
        Guitar guitar = new Guitar(serialNumber, builder, model, type, backWood, topWood, price);

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

    public Guitar search(Guitar searchGuitar){
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();

            // Ignore serial number since that's unique
            // Ignore price number since that's unique

            if (searchGuitar.getBuilder() != guitar.getBuilder())
                continue;

            String model = searchGuitar.getModel();
            if ((model != null) && (!model.equals("")) && (!model.equals(guitar.getModel())))
                continue;

            if (searchGuitar.getType() != guitar.getType())
                continue;

            if (guitar.getBackWood() != searchGuitar.getBackWood())
                continue;

            if (guitar.getTopWood() != searchGuitar.getTopWood())
                continue;

            return guitar;
        }
        return null;
    }

}
