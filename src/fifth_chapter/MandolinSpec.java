package fifth_chapter;

import first_chapter.Builder;
import first_chapter.Type;
import first_chapter.Wood;

public class MandolinSpec extends InstrumentSpec{

    private Style style;

    public MandolinSpec(String model, Wood backWood, Wood topWood, Type type, Builder builder, Style style) {
        super(model, backWood, topWood, type, builder);
        this.style = style;
    }

    public Style getStyle(){ return style; }

    public boolean matches(InstrumentSpec otherSpec){
        if (!super.matches(otherSpec))
            return false;
        if (!(otherSpec instanceof MandolinSpec))
            return false;

        MandolinSpec spec = (MandolinSpec) otherSpec;
        if (style != spec.style)
            return false;

        return true;
    }
}
