package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import static utils.HibernateUtils.*;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import pojo.CustomerPOJO;


public class CustomersDAO {
	
	public Integer addCustomer(CustomerPOJO customer) {
		Integer customerID = null;
		
		Session session =  getSf().openSession();
		
		Transaction transaction = session.beginTransaction();
		try {
			
			customerID = (Integer) session.save(customer);
			transaction.commit();
		}
		catch(HibernateException he) {
			if(transaction != null)
				transaction.rollback();
			throw he;
		}
		finally {
			if(session != null)
				session.close();
		}
		return customerID;
	}
	
	public void updateCustomer(CustomerPOJO customer) {
		Session session = getSf().openSession();
		
		Transaction transaction = session.beginTransaction();
		try {
			session.update(customer);
			transaction.commit();
		}
		catch(HibernateException he) {
			if(transaction != null)
				transaction.rollback();
			throw he;
		}
		
		finally {
			if(session != null)
				session.close();
		}
	}
	
	public void unsubscribeCustomer(int customerID) {
		Session session = getSf().openSession();
		
		Transaction transaction = session.beginTransaction();
		
		try {
			
			session.delete(session.get(CustomerPOJO.class, customerID));
			transaction.commit();
		}
		
		catch(HibernateException he) {
			if(transaction != null)
				transaction.rollback();
			throw he;
		}
		finally {
			
		}
	}
	
	public CustomerPOJO showCustomerDetails(int CustomerID) {
		CustomerPOJO customer = null;
		Session session = getSf().openSession();
		
		Transaction transaction = session.beginTransaction();
		
		try {
			customer = session.get(pojo.CustomerPOJO.class, CustomerID);
			transaction.commit();
		}
		catch (HibernateException he) {
			if(transaction != null)
				transaction.rollback();
			throw he;
		}
		finally {
			if(session != null)
				session.close();
		}
		return customer;
	}
	
	public List<CustomerPOJO> listAllCustomers() {
		List<CustomerPOJO> customersList = null;
		
		Session session = getSf().openSession();
		
		String getAllHQL = "SELECT c from customerstab c";
		Transaction transaction = session.beginTransaction();
		
		try {
			customersList = session.createQuery(getAllHQL,CustomerPOJO.class).getResultList();
			transaction.commit();
		}
		catch(HibernateException he) {
			if(transaction != null)
				transaction.rollback();
			throw he;
		}
		finally {
			if(session != null)
				session.close();
		}
		return  customersList;
	}
	
	public void unSubscribeCustomerByEvict(CustomerPOJO customer) {
		Session session = getSf().openSession();
		
		Transaction transaction = session.beginTransaction();
		
		try {
			
		}
		catch(HibernateException he) {
			if(transaction != null)
				transaction.rollback();
			throw he;
		}
		finally {
			if(session != null)
				session.close();
		}
	}

}
