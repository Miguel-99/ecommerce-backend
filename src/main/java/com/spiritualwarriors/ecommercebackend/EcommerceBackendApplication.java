package com.spiritualwarriors.ecommercebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceBackendApplication.class, args);
	}

//	@GetMapping("/helloworld")
//	public String hello() throws MPException, MPApiException {
//		MercadoPagoConfig.setAccessToken("TEST-169781743419-032413-78b5dd66eb21df4d3adc67a1ef0c511a-1053785978");
//		PreferenceItemRequest itemRequest =
//				PreferenceItemRequest.builder()
//						.id("1234")
//						.title("Games")
//						.description("PS5")
//						.pictureUrl("http://picture.com/PS5")
//						.categoryId("games")
//						.quantity(1)
//						.currencyId("BRL")
//						.unitPrice(new BigDecimal("100"))
//						.build();
//		List<PreferenceItemRequest> items = new ArrayList<>();
//		items.add(itemRequest);
//		PreferenceRequest preferenceRequest = PreferenceRequest.builder()
//				.items(items).build();
//		PreferenceClient client = new PreferenceClient();
//		Preference preference = client.create(preferenceRequest);
//		return preference.getId();
//	}
}
