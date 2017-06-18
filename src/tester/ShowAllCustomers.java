package tester;

import static utils.HibernateUtils.*;

import java.util.Scanner;

import dao.CustomersDAO;

public class ShowAllCustomers {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			getSf();
			CustomersDAO customersDAOObject = new CustomersDAO();
			System.out.println("All Customer details: "+customersDAOObject.listAllCustomers());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			getSf().close();
		}
				
		
		
	}
}