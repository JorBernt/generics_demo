package generics.demo;

import java.util.*;
import java.util.stream.Collectors;

public class Mobelregister<E extends Mobel> {
    private List<E> register;
    private Comparator<E> comp;

    public Mobelregister(Comparator<E> comp) {
        register = new ArrayList<>();
        this.comp = comp;
    }

    public Mobelregister() {
        register = new ArrayList<>();
    }

    public void leggTil(E mobel) {
        register.add(mobel);
    }

    public void sorter() {
        Collections.sort(register);
    }

    public Mobel hent(int nr) {
        for(Mobel m : register) {
            if(m.getLopeNr() == nr) return m;
        }
        return null;
    }

    public void slett(int nr) {
        Iterator<E> it = register.listIterator();
        while(it.hasNext()) {
            if(it.next().getLopeNr() == nr) {
                it.remove();
                break;
            }
        }
    }

    public void slettAlle() {
        register.clear();
    }

    public List<E> hentListe() {
        return register;
    }

    public List<E> lagListe(String type, List<E> regList) {
        if(type.equals("Alle")) {
            regList.sort(comp);
            return regList;
        }
        List<E> list = new ArrayList<>();
        for(E mobel:regList) {
            if(type.equals("Bord") && mobel instanceof Bord) {
                list.add(mobel);
            }
            else if(type.equals("Stol") && mobel instanceof Stol) {
                list.add(mobel);
            }
        }
        list.sort(comp);
        return list;

    }





}