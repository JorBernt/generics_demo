package generics.demo.comp;

import generics.demo.Bord;
import generics.demo.Mobel;

import java.util.Comparator;

public class AntallBenComp implements Comparator<Mobel> {
    @Override
    public int compare(Mobel m1, Mobel m2) {
        Bord b1 = (Bord)m1;
        Bord b2 = (Bord)m2;
        return Integer.compare(b1.getAntallBen(), b1.getAntallBen());
    }
}
