package fifth_chapter.part_b;

import first_chapter.Guitar;
import first_chapter.GuitarSpec;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class InventoryFinal {
    private List inventory;

    public InventoryFinal(){
        inventory = new LinkedList();
    }

    public void addInstrument(String serialNumber, Double price, InstrumentSpecFinal spec){
        InstrumentFinal instrument = new InstrumentFinal(serialNumber, price, spec);

        inventory.add(instrument);
    }

    public InstrumentFinal getInstrument(String serialNumber){
        for(Iterator i = inventory.iterator(); i.hasNext(); ){
            InstrumentFinal instrument = (InstrumentFinal) i.next();

            if(instrument.getSerialNumber().equals(serialNumber)){
                return instrument;
            }
        }
        return null;
    }

    public List search(InstrumentSpecFinal searchSpec){
        List matchingInstrument = new LinkedList();

        for (Iterator i = inventory.iterator(); i.hasNext(); ) {
            InstrumentFinal instrument = (InstrumentFinal) i.next();

            if(instrument.getSpec().matches(searchSpec))
                matchingInstrument.add(instrument);
        }
        return matchingInstrument;
    }
}
