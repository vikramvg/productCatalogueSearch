package io.learneternal.productCatalogueSearch.seller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SellerController {
	
	@Autowired
	private SellerService sellerService;
	
	@RequestMapping("/sellers")
	public List<Seller> getAllSellers(){
		return sellerService.getAllSellers();
	}
	
	@RequestMapping("sellers/{id}")
	public Seller getSeller(@PathVariable String id) {
		return sellerService.getSeller(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/sellers")
	public void addSeller(@RequestBody Seller seller) {
		sellerService.addSeller(seller);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/sellers/{id}")
	public void updateSeller(@PathVariable String id, @RequestBody Seller seller) {
		sellerService.updateSeller(id, seller);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/sellers/{id}")
	public void deleteSeller(@PathVariable String id) {
		sellerService.deleteSeller(id);
	}
}
