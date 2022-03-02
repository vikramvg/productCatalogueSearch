package io.learneternal.productCatalogueSearch.seller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository sellerRepository;
	
	public List<Seller> getAllSellers(){
		List<Seller> sellers = new ArrayList<Seller>();
		sellerRepository.findAll().forEach(sellers::add);
		return sellers;
	}
	
	public Seller getSeller(String id) {
		return sellerRepository.findById(id).get();
	}

	public void addSeller(Seller seller) {
		sellerRepository.save(seller);
	}

	public void updateSeller(String id, Seller seller) {
		sellerRepository.save(seller);
	}

	public void deleteSeller(String id) {
		sellerRepository.deleteById(id);
	}
}