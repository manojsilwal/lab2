package com.example.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.parsing.Problem;
import org.springframework.stereotype.Repository;

import com.example.domain.Product;

@Repository
public class ProductRepo{
	List<Product> products = new ArrayList<>();
	
	static{
		Product product1 = new Product();
		product1.setProductId("1");
		product1.setName("Cookies");
		product1.setUnitPrice(new BigDecimal(12));
		product1.setUnitsInStock(10);
	}
	
	public Product getProduct(String productId){
		for(Product product : products){
			if(product.getProductId().equals(productId)){
				return product;
			}
		}
		return null;
		
	}
	public List<Product> findAll(){
		return products;
	}
	
}
