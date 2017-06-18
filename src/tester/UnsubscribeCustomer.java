package tester;

import java.util.Scanner;

import dao.CustomersDAO;

import static utils.HibernateUtils.*;

public class UnsubscribeCustomer {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			getSf();
			System.out.println("Enter the customer id of customer to be unsubscribed: ");
			CustomersDAO customersDAOObject  = new CustomersDAO();
			customersDAOObject.unsubscribeCustomer(sc.nextInt());
			System.out.println("Customer unsubscribed!");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			getSf().close();
		}
	}

}
