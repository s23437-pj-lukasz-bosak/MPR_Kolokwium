package ppl.pjatk.shopee_s23437;

import org.springframework.stereotype.Component;

@Component
public class ClientStorage {

    Client client = new Client(1,100);

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
