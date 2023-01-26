package ppl.pjatk.shopee_s23437;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopeeS23437Application {

	private Servis servis;

	public ShopeeS23437Application(Servis servis) {
		this.servis = servis;

//		Client client1 = new Client(1,100);
		servis.addItemToKart("milk");
		servis.addItemToKart("milk");
		servis.addItemToKart("beer");
		System.out.println(servis.orderItems());
		servis.czyOk();

	}

	public static void main(String[] args) {
		SpringApplication.run(ShopeeS23437Application.class, args);
	}

}
