package io.learneternal.productCatalogueSearch.brand;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import io.learneternal.productCatalogueSearch.product.Product;

public interface BrandRepository extends CrudRepository<Brand, String> {
	public List<Product> findByProductId(String productId);
}
