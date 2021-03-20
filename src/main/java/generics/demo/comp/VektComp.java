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
            return Double.compare(m1.getPris(), m2.getPris());
        else
            return Double.compare(m2.getPris(), m1.getPris());
    }
}
