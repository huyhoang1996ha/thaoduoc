package org.cntt.product.service;

import org.cntt.model.product.Product;
import org.cntt.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductRepository productRepository;
	
	@Override
	public Product findOne(int id) {
		// TODO Auto-generated method stub
		Product product=productRepository.findOne(id);
		return product;
	}

}
