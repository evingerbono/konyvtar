package konyvtar;

import java.util.UUID;

public class Kepregeny extends Termek{
    private boolean sorozat;
    
    public Kepregeny(String szerzo, String cim, String kategoria) {
        super(szerzo, cim, kategoria);
    }
    
    public Kepregeny(String szerzo, String cim, String kategoria, boolean sorozat) {
        super(szerzo, cim, kategoria);
        this.sorozat=sorozat;
    }

    public boolean isSorozat() {
        return sorozat;
    }
    
}
