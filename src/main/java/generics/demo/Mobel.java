package generics.demo;

public abstract class Mobel implements Comparable<Mobel>{
    private String navn;
    private double vekt, pris;
    private int lopeNr, antall;

    public Mobel(String navn, int antall, double vekt, double pris, int lopeNr) {
        this.navn = navn;
        this.antall = antall;
        this.vekt = vekt;
        this.pris = pris;
        this.lopeNr = lopeNr;
    }
    @Override
    public abstract String toString();

    @Override
    public int compareTo(Mobel o) {
        return Integer.compare(lopeNr, o.lopeNr);
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getAntall() {
        return antall;
    }

    public void setAntall(int antall) {
        this.antall = antall;
    }

    public double getVekt() {
        return vekt;
    }

    public void setVekt(double vekt) {
        this.vekt = vekt;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

    public int getLopeNr() {
        return lopeNr;
    }

    public void setLopeNr(int lopeNr) {
        this.lopeNr = lopeNr;
    }
}
