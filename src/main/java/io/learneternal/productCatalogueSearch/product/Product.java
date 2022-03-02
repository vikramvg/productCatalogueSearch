package io.learneternal.productCatalogueSearch.product;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Product implements Serializable {
	@Id
	private String id;
	private String name;
	private double price;
	private String sku;
	private String title;
	private String details;
	private boolean availability;
	private int size;
	private String color;

	/**
	 * @param id
	 * @param name
	 * @param price
	 * @param sku
	 * @param title
	 * @param details
	 * @param isAvailable
	 * @param size
	 * @param color
	 * @param brands
	 * @param categories
	 */
	public Product(String id, String name, double price, String sku, String title, String details, boolean availability,
			int size, String color) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.sku = sku;
		this.title = title;
		this.details = details;
		this.availability = availability;
		this.size = size;
		this.color = color;
	}
}