package ppl.pjatk.shopee_s23437;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Kart {

    int cena;

    private List<Produkty> listaWkoszyku = new ArrayList<>();


    public List<Produkty> getListaWkoszyku() {
        return listaWkoszyku;
    }
}
