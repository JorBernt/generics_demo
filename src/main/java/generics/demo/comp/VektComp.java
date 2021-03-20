package generics.demo.comp;

import generics.demo.Mobel;

import java.util.Comparator;

public class VektComp implements Comparator<Mobel> {
    String rekkefolge;

    public VektComp(String rekkefolge) {
        this.rekkefolge = rekkefolge;
    }
    @Override
    public int compare(Mobel m1, Mobel m2) {
        if(rekkefolge.equals("asc"))
            return Double.compare(m1.getVekt(), m2.getVekt());
        else
            return Double.compare(m2.getVekt(), m1.getVekt());
    }
}
