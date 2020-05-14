package first_chapter;

import fifth_chapter.Instrument;
import fifth_chapter.InstrumentSpec;
import fifth_chapter.Mandolin;
import fifth_chapter.MandolinSpec;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List inventory;

    public Inventory(){
        inventory = new LinkedList();
    }

    public void addInstrument(String serialNumber, Double price, InstrumentSpec spec){
        Instrument instrument = null;

        if (spec instanceof GuitarSpec){
            instrument = new Guitar(serialNumber, price, (GuitarSpec) spec);
        } else if(spec instanceof MandolinSpec){
            instrument = new Mandolin(serialNumber, price, (MandolinSpec)spec);
        }

        inventory.add(instrument);
    }

    public Instrument getInstrument(String serialNumber){
        for(Iterator i = inventory.iterator(); i.hasNext(); ){
            Instrument instrument = (Instrument) i.next();

            if(instrument.getSerialNumber().equals(serialNumber)){
                return instrument;
            }
        }
        return null;
    }

    public List search(GuitarSpec searchSpec){
        List matchingGuitars = new LinkedList();

        for (Iterator i = inventory.iterator(); i.hasNext(); ) {

            Guitar guitar = (Guitar) i.next();

            if(guitar.getSpec().matches(searchSpec))
                matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }

    public List search(MandolinSpec searchSpec){
        List matchingMandolins = new LinkedList();

        for (Iterator i = inventory.iterator(); i.hasNext(); ) {
            Instrument instrument = (Instrument) i.next();

            if(instrument.getSpec().matches(searchSpec))
                matchingMandolins.add(instrument);
        }
        return matchingMandolins;
    }

}
