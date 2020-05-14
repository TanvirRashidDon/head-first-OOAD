package fifth_chapter;

import first_chapter.GuitarSpec;

public class Mandolin  extends Instrument{

    private GuitarSpec spec;

    public Mandolin(String serialNumber, double price, GuitarSpec spec) {
        super(serialNumber, price);
        this.spec = spec;
    }

    public GuitarSpec getSpec() {
        return spec;
    }
}
