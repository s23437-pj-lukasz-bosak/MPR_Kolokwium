package ppl.pjatk.shopee_s23437;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class serviceTest {
    private ClientStorage clientStorage;
    private ItemStorage itemStorage;
    private Kart kart;
    private Servis servis;

    @Test

    void czySumaSiedodajeDokoszyka(){
        servis.addItemToKart("milk");
        Assertions.assertTrue(kart.getListaWkoszyku().size()==5, "udalo sie dodac do koszyka");

    }

}
