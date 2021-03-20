package generics.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AppRepository {
    private List<String> typer = new ArrayList<>();
    private List<String> sortering = new ArrayList<>();
    private List<String> typeSortering = new ArrayList<>();
    private Mobelregister<Mobel> mobelRegister = new Mobelregister<>();
    private int loperNr = 0;

    public AppRepository() {
        typeSortering.add("Alle");
        typeSortering.add("Bord");
        typeSortering.add("Stol");

        typer.add("Bord");
        typer.add("Stol");

        sortering.add("Navn");
        sortering.add("Antall");
        sortering.add("Pris");
        sortering.add("Antall ben");
        sortering.add("Vekt");
    }

    public List<String> getTyper() {
        return typer;
    }

    public List<String> getSortering(String type) {
        if(type.equals("type")) return typeSortering;
        else return sortering;
    }

    public void leggTilVare(VareObjekt v) {
        loperNr++;
        switch (v.getType()) {
            case "Bord": {
                mobelRegister.leggTil(new Bord(v.getNavn(), v.getAntall(), v.getVekt(), v.getPris(), loperNr, v.getAntallBen()));
                break;
            }
            case "Stol": {
                mobelRegister.leggTil(new Stol(v.getNavn(), v.getAntall(), v.getVekt(), v.getPris(), loperNr));
                break;
            }
        }
    }

    public List<Mobel> getVarer(Sort sort) {
        switch (sort.sortType) {
            case "None" : {
                Mobelregister<Mobel> mr = new Mobelregister<>();
                return mr.lagListe(sort.type, mobelRegister.hentListe());
            }
            case "Navn" : {
                Mobelregister<Mobel> mr = new Mobelregister<>(new NavnComp());
                return mr.lagListe(sort.type, mobelRegister.hentListe());
            }
        }
        return null;
    }
}
