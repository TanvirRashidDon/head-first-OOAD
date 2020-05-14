package first_chapter;

import fifth_chapter.part_a.Instrument;
import fifth_chapter.part_a.InstrumentSpec;
import fifth_chapter.part_a.Mandolin;
import fifth_chapter.part_a.MandolinSpec;

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

        Guitar guitar = null;
        for (Iterator i = inventory.iterator(); i.hasNext(); ) {
            try {
                guitar = (Guitar) i.next();
            }catch (Exception e){
                continue;
            }

            if(guitar.getSpec().matches(searchSpec))
                matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }

    public List search(MandolinSpec searchSpec){
        List matchingMandolins = new LinkedList();

        Mandolin mandolin = null;
        for (Iterator i = inventory.iterator(); i.hasNext(); ) {
            try {
                mandolin = (Mandolin) i.next();
            }catch (Exception e){
                continue;
            }

            if(mandolin.getSpec().matches(searchSpec))
                matchingMandolins.add(mandolin);
        }
        return matchingMandolins;
    }

}
