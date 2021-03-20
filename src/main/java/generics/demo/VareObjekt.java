package generics.demo;

public class VareObjekt {
    private String navn, type;
    private int antall, antallBen;
    private double pris, vekt;

    public VareObjekt(String navn, int antall, double pris, double vekt, int antallBen, String type) {
        this.navn = navn;
        this.antall = antall;
        this.pris = pris;
        this.vekt = vekt;
        this.antallBen = antallBen;
        this.type = type;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAntall() {
        return antall;
    }

    public void setAntall(int antall) {
        this.antall = antall;
    }

    public int getAntallBen() {
        return antallBen;
    }

    public void setAntallBen(int antallBen) {
        this.antallBen = antallBen;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

    public double getVekt() {
        return vekt;
    }

    public void setVekt(double vekt) {
        this.vekt = vekt;
    }


}
