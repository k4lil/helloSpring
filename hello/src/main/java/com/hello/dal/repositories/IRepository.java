package com.hello.dal.repositories;

import java.util.List;
import com.hello.dal.models.Product;

public interface IRepository {
	
	public List<Product> getAllProducts();
	public boolean addOrUpdateProduct(Product p);
	public boolean deleteProduct(Long id);
}
