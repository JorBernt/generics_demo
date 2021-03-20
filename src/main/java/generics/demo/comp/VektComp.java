package generics.demo.comp;

import generics.demo.Mobel;

import java.util.Comparator;

public class VektComp implements Comparator<Mobel> {
    @Override
    public int compare(Mobel m1, Mobel m2) {
        return Double.compare(m1.getPris(), m2.getPris());
    }
}
