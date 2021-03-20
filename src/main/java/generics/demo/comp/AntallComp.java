package generics.demo.comp;

import generics.demo.Mobel;

import java.util.Comparator;

public class AntallComp implements Comparator<Mobel> {
    String rekkefolge;
    public AntallComp(String rekkefolge) {
        this.rekkefolge = rekkefolge;
    }
    @Override
    public int compare(Mobel m1, Mobel m2) {
        if(rekkefolge.equals("asc"))
            return Integer.compare(m1.getAntall(), m2.getAntall());
        else
            return Integer.compare(m2.getAntall(), m1.getAntall());
    }
}
