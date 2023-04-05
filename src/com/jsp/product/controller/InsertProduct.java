package com.jsp.product.controller;

import com.jsp.product.dao.ProductDao;

public class InsertProduct {

	public static void main(String[] args) {
		
		ProductDao productDao=new ProductDao();
		productDao.insertProduct();
		
	}

}
