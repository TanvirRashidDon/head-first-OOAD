package first_chapter;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List guitars;

    public Inventory(){
        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, Double price, String model, Wood backWood, Wood topWood,
                          Type type, Builder builder, int numString){
        GuitarSpec spec = new GuitarSpec(model, backWood, topWood, type, builder, numString);
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
            // Ignore serial number since that's unique
            // Ignore price number since that's unique

            if(guitar.getSpec().matches(searchSpec))
                matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }

}
