package io.learneternal.productCatalogueSearch.category;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> getAllCategories(){
		List<Category> categories = new ArrayList<Category>();
		categoryRepository.findAll().forEach(categories::add);
		return categories;
	}
	
	public Category getCategory(String id) {
		return categoryRepository.findById(id).get();
	}

	public void addCategory(Category category) {
		categoryRepository.save(category);
	}

	public void updateCategory(String id, Category category) {
		categoryRepository.save(category);
	}

	public void deleteCategory(String id) {
		categoryRepository.deleteById(id);
	}
}