package generics.demo;

public class Bord extends Mobel {
    private int antallBen;

    public Bord(String navn, int antall, Double vekt, Double pris, int lopeNr, int antallBen) {
        super(navn, antall, vekt, pris, lopeNr);
        this.antallBen = antallBen;
    }

    public int getAntallBen() {
        return antallBen;
    }

    public void setAntallBen(int antallBen) {
        this.antallBen = antallBen;
    }

    @Override
    public String toString() {
        return getNavn()+"_"+getLopeNr();
    }
}