package generics.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    AppRepository repo;

    @GetMapping("/type")
    public List<String> hentTyper() {
        return repo.getTyper();
    }

    @PostMapping("/lagreVare")
    public void lagreVare(VareObjekt vareObjekt) {
        repo.leggTilVare(vareObjekt);
    }


    @GetMapping("/hentSortering")
    public List<String> typeSorter(String type) {
        return repo.getSortering(type);
    }

    @PostMapping("/hentVarer")
    public List<Mobel> hentVarer(Sort sort) {
        return repo.getVarer(sort);
    }

}
