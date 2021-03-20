package generics.demo;

import java.util.Comparator;

public class NavnComp implements Comparator<Mobel> {
    @Override
    public int compare(Mobel m1, Mobel m2) {
        return m1.getNavn().compareTo(m2.getNavn());
    }
}
