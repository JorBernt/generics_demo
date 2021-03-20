package generics.demo;

public class Stol extends Mobel {
    public Stol(String navn, int antall, double vekt, double pris, int lopeNr) {
        super(navn, antall, vekt, pris, lopeNr);
    }
    @Override
    public String toString() {
        return getNavn()+"_"+getLopeNr();
    }
}