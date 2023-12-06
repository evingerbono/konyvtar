
package konyvtar;

import java.util.UUID;

public abstract class  Termek {
    private String szerzo;
    private String cim;
    private String kategoria;
    private UUID id;

    public Termek(String szerzo, String cim, String kategoria) {
        this.szerzo = szerzo;
        this.cim = cim;
        this.kategoria = kategoria;
        this.id=UUID.randomUUID();
    }

    public String getSzerzo() {
        return szerzo;
    }

    public String getCim() {
        return cim;
    }

    public String getKategoria() {
        return kategoria;
    }
    
    public UUID getId(){
        return id;
    }

    @Override
    public String toString() {
        return "Termék{" + "szerző=" + szerzo + ", cím=" + cim + ", kategória=" + kategoria + ", id=" + id + '}';
    }
    
    
}
