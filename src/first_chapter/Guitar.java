package first_chapter;

import fifth_chapter.part_a.Instrument;

public class Guitar extends Instrument {

    private GuitarSpec spec;

    public Guitar(String serialNumber, double price, GuitarSpec spec) {
        super(serialNumber, price);
        this.spec = spec;
    }

    public GuitarSpec getSpec() {
        return spec;
    }

}
