package io.learneternal.productCatalogueSearch.brand;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandService {
	
	@Autowired
	private BrandRepository brandRepository;
	
	public List<Brand> getAllBrands(){
		List<Brand> brands = new ArrayList<Brand>();
		brandRepository.findAll().forEach(brands::add);
		return brands;
	}
	
	public Brand getBrand(String id) {
		return brandRepository.findById(id).get();
	}

	public void addBrand(Brand brand) {
		brandRepository.save(brand);
	}

	public void updateBrand(String id, Brand brand) {
		brandRepository.save(brand);
	}

	public void deleteBrand(String id) {
		brandRepository.deleteById(id);
	}
}