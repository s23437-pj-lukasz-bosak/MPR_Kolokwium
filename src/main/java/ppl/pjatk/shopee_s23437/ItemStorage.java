package ppl.pjatk.shopee_s23437;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ItemStorage {

        private Produkty produkt1 = new Produkty("milk",10);
        private Produkty produkt2 = new Produkty("beer",15);

        private List<Produkty> listaProduktow = new ArrayList<>();
        public ItemStorage(){
            listaProduktow.add(produkt1);
            listaProduktow.add(produkt2);
        }

    public List<Produkty> getListaProduktow() {
        return listaProduktow;
    }
}
