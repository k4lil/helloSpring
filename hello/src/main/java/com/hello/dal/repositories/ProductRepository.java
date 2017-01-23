package com.hello.dal.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.hello.dal.models.Product;

@Repository
public class ProductRepository implements IRepository {
	
	public static Map<Long,Product> productsList = new HashMap<Long,Product>();
	
	public ProductRepository() {
		addOrUpdateProduct(new Product(1L,"Produit 1",11L));
		addOrUpdateProduct(new Product(2L,"Produit 2",22L));
		addOrUpdateProduct(new Product(3L,"Produit 3",33L));
	}
	
	@Override
	public List<Product> getAllProducts() {
		return new ArrayList<Product>(productsList.values());
	}

	@Override
	public boolean addOrUpdateProduct(Product p) {
		return productsList.put(p.id, p)!=null ? true : false;		
	}

	@Override
	public boolean deleteProduct(Long id) {
		return productsList.remove(id)!= null ? true : false;
	}
	
	@Override
	public Product getProduct(Long id) {
		return productsList.get(id);
	}
}
