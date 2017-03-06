package com.niit.giftmania.dao;

import java.util.*;

import com.niit.giftmania.model.Product;

public interface ProductDao {

public List<Product> getProduct();

public List<Product> getProductbyCategory(String cat);

public void addProduct(Product p);
public void removeProduct(int pid);
public void updateProduct(Product p);
public Product getProductById(int pid);
}
