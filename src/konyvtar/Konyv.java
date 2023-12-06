
package konyvtar;

import java.util.UUID;

public class Konyv extends Termek implements Kolcsonozhat{
    private String boritas;
    
    public Konyv(String szerzo, String cim, String kategoria, UUID id) {
        super(szerzo, cim, kategoria, id);
    }
    
    public Konyv(String szerzo, String cim, String kategoria, UUID id, String boritas) {
        super(szerzo, cim, kategoria, id);
        this.boritas=boritas;
    }

    public String getBoritas() {
        return boritas;
    }

    @Override
    public void kolcsonoz() {
        System.out.println("A könyv kivan kölcsönözve");
    }

    @Override
    public String toString() {
        return super.toString()+"boritas=" + boritas;
    }
    
    
}
