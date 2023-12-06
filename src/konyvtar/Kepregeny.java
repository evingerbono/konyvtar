package konyvtar;

import java.util.UUID;

public class Kepregeny extends Termek{
    private boolean sorozat;
    
    public Kepregeny(String szerzo, String cim, String kategoria, UUID id) {
        super(szerzo, cim, kategoria, id);
    }
    
    public Kepregeny(String szerzo, String cim, String kategoria, UUID id, boolean sorozat) {
        super(szerzo, cim, kategoria, id);
        this.sorozat=sorozat;
    }

    public boolean isSorozat() {
        return sorozat;
    }
    
}
