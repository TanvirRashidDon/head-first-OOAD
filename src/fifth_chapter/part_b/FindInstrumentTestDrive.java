package fifth_chapter.part_b;

import first_chapter.Builder;
import first_chapter.Wood;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FindInstrumentTestDrive {
    private InventoryFinal inventory;

    public FindInstrumentTestDrive(){
        this.inventory = new InventoryFinal();
    }

    public void doSomething(){
        initializeInventory(inventory);

        Map properties = new HashMap();
        properties.put("builder", Builder.OLSON);
        properties.put("backWood", Wood.MAPLE);

        InstrumentSpecFinal clientSpec = new InstrumentSpecFinal(properties);

        List matchingInstruments = inventory.search(clientSpec);

        if (matchingInstruments.isEmpty()){
            System.out.println("We've nothing for you");
        }else {
            System.out.println("You Might like :");
            for (Iterator i = matchingInstruments.iterator(); i.hasNext(); ){
                InstrumentFinal instrument = (InstrumentFinal) i.next();

                InstrumentSpecFinal spec = instrument.getSpec();
                System.out.println("We have a " + spec.getProperty("instrumentType") +
                        "with following properties : ");

                for (Iterator j = spec.getProperties().keySet().iterator(); j.hasNext(); ){
                    String propertyName = (String) j.next();

                    if (propertyName.equals("instrumentType")) continue;

                    System.out.println("\t" + propertyName + " : " + spec.getProperty(propertyName));
                }
                System.out.println("You may have this only for : " + instrument.getPrice() +
                        "$\n---------------------");
            }
        }
    }

    private static void initializeInventory(InventoryFinal inventory){
        Map properties = new HashMap();

        properties.put("instrumentType", InstrumentType.GUITAR);
        properties.put("builder", Builder.OLSON);
        properties.put("model","CJ");
        properties.put("numString", 6);
        properties.put("topWood", Wood.ALDER);
        properties.put("backWood",Wood.MAPLE);
        inventory.addInstrument("A422", 1990.33, new InstrumentSpecFinal(properties));


        properties.put("instrumentType", InstrumentType.MANDOLIN);
        properties.put("builder", Builder.GIBSON);
        properties.put("model","TZ");
        properties.put("topWood", Wood.MAPLE);
        properties.put("backWood",Wood.MAPLE);
        inventory.addInstrument("A422", 1649.99, new InstrumentSpecFinal(properties));

        properties.put("builder", Builder.OLSON);
        properties.put("model","TZ");
        properties.put("topWood", Wood.ALDER);
        properties.put("backWood",Wood.MAPLE);
        inventory.addInstrument("A422", 1649.99, new InstrumentSpecFinal(properties));

    }
}
