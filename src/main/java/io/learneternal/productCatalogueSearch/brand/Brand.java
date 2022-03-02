package io.learneternal.productCatalogueSearch.brand;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.learneternal.productCatalogueSearch.product.Product;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Brand {
	@Id
	private String id;
	private String name;
	private String details;
	@ManyToOne
	private Product product;

	/**
	 * @param id
	 * @param name
	 * @param details
	 * @param product
	 */
	public Brand(String id, String name, String details, String productId) {
		super();
		this.id = id;
		this.name = name;
		this.details = details;
		this.product = new Product(productId,"",10,"","","",true,30,"");
	}
}