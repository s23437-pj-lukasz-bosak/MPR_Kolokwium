package ppl.pjatk.shopee_s23437;

import org.springframework.stereotype.Component;
import org.w3c.dom.ls.LSOutput;

import java.util.List;

@Component
public class Servis {

    private ItemStorage itemStorage;
    private Kart kart;

    private ClientStorage clientStorage;

    public Servis(ItemStorage itemStorage, Kart kart, ClientStorage clientStorage) {
        this.itemStorage = itemStorage;
        this.kart = kart;
        this.clientStorage = clientStorage;
    }

    public Produkty wybieranieProduktu(String nazwa) {
        List<Produkty> produktyList = itemStorage.getListaProduktow();
        for (Produkty produkty : produktyList) {
            if (nazwa == produkty.name) {

                return new Produkty(nazwa, produkty.getPrice());
            }

        }
        return null;
    }

    public void addItemToKart(String produkt) {
        //List<Produkty> listaWKoszyku = kart.getListaWkoszyku();
        kart.getListaWkoszyku().add(wybieranieProduktu(produkt));
        System.out.println("Produkt o nazwie " + produkt + " Zostal dodany do koszyka");
    }


    public int orderItems() {
        List<Produkty> listaZakupow = kart.getListaWkoszyku();
        int suma = 0;

        for (Produkty produkty : listaZakupow) {
            suma = suma + produkty.getPrice();

        }

        return suma;
    }

    public orderInfo czyOk() {
        int ileMa = clientStorage.getClient().getSaldo();
        int ilePoZakupach;
        if (orderItems() > ileMa) {
            System.out.println("Klient ma za malo pieniedzy transakcja niezaakceptowana");
            return new orderInfo(orderItems(), Status.DECLINE);
        } else {
            System.out.println("klient ma wystarczajaco pieniedzy, trasakcja zaakceptowana");
            ilePoZakupach = ileMa - orderItems();
            clientStorage.getClient().setSaldo(ilePoZakupach);
        }


        return new orderInfo(orderItems(), Status.ACCEPTED);
    }


}
