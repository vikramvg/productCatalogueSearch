package io.learneternal.productCatalogueSearch.seller;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import io.learneternal.productCatalogueSearch.product.Product;

public interface SellerRepository extends CrudRepository<Seller, String>{
	public List<Product> findByProductId(String productId);
}
