package konyvtar;

public class Konyvtar {

    Termek[] termekek;

    public Konyvtar() {
        felvesz();
        termekek();
    }

    public void termekek() {
        System.out.println("---------Termékek:");
        for (int i = 0; i < termekek.length; i++) {
            System.out.println(termekek[i]);

        }
    }

    public void kolcsonozheto() {

    }

    public void felvesz() {
        termekek = new Termek[]{new Konyv("teszt", "Proba", "konyv", "kemény"),
            new Kepregeny("tesztKeprgeeny", "Proba", "képregény", false)};
    }
}
