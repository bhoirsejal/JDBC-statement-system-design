package com.jsp.product.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jsp.product.util.HelperClass;

public class ProductDao {
	HelperClass helperClass = new HelperClass();
	Connection connection = null;

	public void insertProduct() {
		connection = helperClass.getConnection();
		String sql = "insert into product values(3,'lipstick',750)";
		try {
			Statement statement = connection.createStatement();
			statement.execute(sql);
			System.out.println("Record inserted");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void deleteProduct() {
		connection = helperClass.getConnection();
		String sql = "delete from product where id=2";
		try {
			Statement statement = connection.createStatement();
			statement.executeUpdate(sql);
			System.out.println("Record deleted");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void updateProduct() {
		// step 1 and 2
		connection = helperClass.getConnection();
		String sql = "update product set name='blush',price=490 where id=3";
		try {
			// create statement
			Statement statement = connection.createStatement();
			// execute statement
			statement.executeUpdate(sql);
			System.out.println("Record updated");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void getAllProduct() {
		// step 1 and 2
		connection = helperClass.getConnection();
		String sql = "select*from product";

		try {
			// create statement
			Statement statement = connection.createStatement();
			// execute statement
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				System.out.println("=======================================");
				System.out.println("Product ID    : " + resultSet.getInt(1));
				System.out.println("Product Name  : " + resultSet.getString(2));
				System.out.println("Product Price : " + resultSet.getDouble(3));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void getByIdProduct() {
		//step 1 and 2
		connection= helperClass.getConnection();
		String sql="select*from product where id=1";
		try {
			//create statement
			Statement statement= connection.createStatement();
			//execute statement
			ResultSet resultSet= statement.executeQuery(sql);
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getDouble(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
