package com.hello.dal.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.RequestScope;

import com.hello.dal.models.Product;

@Repository
public class ProductRepository implements IRepository {
	
	public static Map<Long,Product> productsList = new HashMap<Long,Product>();
	
	public ProductRepository() {
		productsList.put(1L, new Product(1L,"Produit 1",11L));
		productsList.put(2L, new Product(1L,"Produit 2",22L));
		productsList.put(3L, new Product(1L,"Produit 3",33L));
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
}
