package io.learneternal.productCatalogueSearch.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProductService {
	@Autowired
	private ProductRepository productRepository;

	@Cacheable("products")
	public List<Product> getAllProducts() {
		log.info("Fetch all products");
		List<Product> products = new ArrayList<Product>();
		try {
			log.info("introducting 2 seconds delay to simulate the backend call");
			Thread.sleep(1000 * 2);
			productRepository.findAll().forEach(products::add);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return products;
	}

	public Product getProduct(String id) {
		log.info("Fetch product by id");
		return productRepository.findById(id).get();
	}

	public void addProduct(Product product) {
		log.info("Add a product");
		productRepository.save(product);
	}

	public void updateProduct(String id, Product product) {
		log.info("Updating a product");
		productRepository.save(product);
	}

	public void deleteProduct(String id) {
		log.info("Deleting a product");
		productRepository.deleteById(id);
	}
}