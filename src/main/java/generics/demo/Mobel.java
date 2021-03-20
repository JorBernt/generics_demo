package generics.demo;

public abstract class Mobel implements Comparable<Mobel>{
    private String navn;
    private Double vekt, pris;
    private int lopeNr, antall;

    public Mobel(String navn, int antall, Double vekt, Double pris, int lopeNr) {
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

    public Double getVekt() {
        return vekt;
    }

    public void setVekt(Double vekt) {
        this.vekt = vekt;
    }

    public Double getPris() {
        return pris;
    }

    public void setPris(Double pris) {
        this.pris = pris;
    }

    public int getLopeNr() {
        return lopeNr;
    }

    public void setLopeNr(int lopeNr) {
        this.lopeNr = lopeNr;
    }
}
