package io.learneternal.productCatalogueSearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ProductCatalogueSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductCatalogueSearchApplication.class, args);
	}

}
