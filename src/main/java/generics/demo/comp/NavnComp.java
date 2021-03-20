package generics.demo.comp;

import generics.demo.Mobel;

import java.util.Comparator;

public class NavnComp implements Comparator<Mobel> {
    String rekkefolge;
    public NavnComp(String rekkefolge) {
        this.rekkefolge = rekkefolge;
    }
    @Override
    public int compare(Mobel m1, Mobel m2) {
        if(rekkefolge.equals("asc"))
            return m1.getNavn().compareTo(m2.getNavn());
        else
            return m2.getNavn().compareTo(m1.getNavn());
    }
}
