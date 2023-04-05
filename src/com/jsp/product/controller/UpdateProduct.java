package com.jsp.product.controller;

import com.jsp.product.dao.ProductDao;

public class UpdateProduct {
	public static void main(String[] args) {
		ProductDao productDao=new ProductDao();
		productDao.updateProduct();
	}

}
