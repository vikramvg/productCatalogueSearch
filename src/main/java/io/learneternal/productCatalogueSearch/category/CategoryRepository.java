package io.learneternal.productCatalogueSearch.category;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import io.learneternal.productCatalogueSearch.product.Product;

public interface CategoryRepository extends CrudRepository<Category, String> {
	public List<Product> findByProductId(String productId);
}
