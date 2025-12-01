package com.example.springBootProj.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springBootProj.model.ProductModel;

@RestController
public class ProductStockController {
	


	
	@GetMapping("/getProductList")
	public List<ProductModel> getProductList() {
		
		ProductModel productObj = new ProductModel();
		
		List<ProductModel> productList = new ArrayList<ProductModel>();

		productObj.setProductAvailability(true);

		productList.add(productObj);
		
		return productList;
		
	}
	
}
