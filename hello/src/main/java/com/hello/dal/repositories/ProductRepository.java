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
		productsList.put(1L, new Product(1L,"Produit 1",11L));
		productsList.put(2L, new Product(1L,"Produit 2",22L));
		productsList.put(3L, new Product(1L,"Produit 3",33L));
	}
	
	@Override
	public List<Product> getAllProducts() {
		List<Product> products = new ArrayList<Product>();
		for (Product product : products) {
			products.add(product);
		}
		return products;
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
