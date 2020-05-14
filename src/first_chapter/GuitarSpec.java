package first_chapter;

import fifth_chapter.InstrumentSpec;

public class GuitarSpec extends InstrumentSpec {

    private int numString;

    public GuitarSpec(String model, Wood backWood, Wood topWood, Type type, Builder builder, int numString) {
        super(model, backWood, topWood, type, builder);
        this.numString = numString;
    }

    public int getNumString(){ return numString; }

    public boolean matches(InstrumentSpec otherSpec){
        if (!super.matches(otherSpec))
            return false;
        if (!(otherSpec instanceof GuitarSpec))
            return false;

        GuitarSpec spec = (GuitarSpec) otherSpec;
        if (numString != spec.numString)
            return false;

        return true;
    }
}
