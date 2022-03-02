package io.learneternal.productCatalogueSearch.brand;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrandController {
	
	@Autowired
	private BrandService brandService;
	
	@RequestMapping("/products/{productId}/brands")
	public List<Brand> getAllBrands(@PathVariable String productId){
		return brandService.getAllBrands(); 
	}
	
	@RequestMapping("/products/{productId}/brands/{id}")
	public Brand getBrand(@PathVariable String id) {
		return brandService.getBrand(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/products/{productId}/brands")
	public void addBrand(@RequestBody Brand brand) {
		brandService.addBrand(brand);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/products/{productId}/brands/{id}")
	public void updateBrand(@PathVariable String id, @RequestBody Brand brand) {
		brandService.updateBrand(id, brand);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/products/{productId}/brands/{id}")
	public void deleteBrand(@PathVariable String id) {
		brandService.deleteBrand(id);
	}
}
