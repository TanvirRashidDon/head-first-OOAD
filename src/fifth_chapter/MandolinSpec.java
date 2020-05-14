package fifth_chapter;

import first_chapter.Builder;
import first_chapter.Type;
import first_chapter.Wood;

public class MandolinSpec extends InstrumentSpec{

    public MandolinSpec(String model, Wood backWood, Wood topWood, Type type, Builder builder, int numString) {
        super(model, backWood, topWood, type, builder);
        //this.numString = numString;
    }

    //public int getNumString(){ return numString; }

    public boolean matches(InstrumentSpec otherSpec){
        if (!super.matches(otherSpec))
            return false;
        if (!(otherSpec instanceof MandolinSpec))
            return false;

        MandolinSpec spec = (MandolinSpec) otherSpec;
        //if (numString != spec.numString)
        //    return false;

        return true;
    }
}
