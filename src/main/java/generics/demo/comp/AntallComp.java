package generics.demo.comp;

import generics.demo.Mobel;

import java.util.Comparator;

public class AntallComp implements Comparator<Mobel> {
    @Override
    public int compare(Mobel m1, Mobel m2) {
        return Integer.compare(m1.getAntall(), m2.getAntall());
    }
}
