package com.niit.giftmania.dao;


import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.giftmania.dao.ProductDao;
import com.niit.giftmania.model.Product;
import com.niit.giftmania.model.User;

@Repository("pd")
public class ProductDaoImple implements ProductDao {
	private List<Product> listProduct;
	@Autowired
	SessionFactory sessionFactory;
	@SuppressWarnings("unchecked")
	public List<Product> getProduct()
	{
		Session session=sessionFactory.openSession();
		listProduct=session.createQuery("FROM Product").list();
		System.out.println(listProduct);
		return listProduct;
	}

	@SuppressWarnings("unchecked")
	public List<Product> getProductbyCategory(String cat)
	{
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		Product p=(Product)session.load(Product.class,new String(cat));
		System.out.println(p);
		listProduct=session.createQuery("Select FROM com.niit.giftmania.model.Product p where p.category=category").setString("category", cat).list();
		tx.commit();
		session.close();
		getProduct();
		return (List<Product>) (listProduct.size()>0?listProduct:null);
	}
@Transactional
	public void addProduct(Product p) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(p);
		tx.commit();
		session.close();
		System.out.println("Product inserted");
	}

	public void removeProduct(int pid) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		Product p=(Product)session.load(Product.class,new Integer(pid));
		if(null!=p)
		session.delete(p);
		tx.commit();
		session.close();
	}

	public void updateProduct(Product p) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.update(p);
		tx.commit();
		session.close();
	}

	public Product getProductById(int pid) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		Product p=(Product)session.load(Product.class,new Integer(pid));
		System.out.println(p);
		return p;
	}
	/*public List<Product> getProductbyCategory(String cat)
	{
		getProduct();
		List<Product> list1=new ArrayList<Product>();
		for(Product p:list)
		{
			if(p.getCategory().equals(cat))
			{
				list1.add(p);
			}
		
		}
	
		return list1;
	} */
}
