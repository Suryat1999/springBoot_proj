package com.example.springBootProj.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springBootProj.model.ProductModel;

@RestController
public class ProductController {
	
	@Autowired
	ProductModel productObj = new ProductModel();
	
	
	@GetMapping("/getProductList")
	public List<ProductModel> getProductList() {
		
		List<ProductModel> productList = new ArrayList<ProductModel>();
		
		productObj.setProductCode(0001);
		productObj.setProductName("Dove");
		productObj.setProductDesc("Used for shiny hair");
		productObj.setProductAvailability(true);
		productObj.setProductPrice(9);
		
		productList.add(productObj);
		
		return productList;
		
	}
	
}
