package tester;

import static utils.HibernateUtils.*;

import java.util.Scanner;

import dao.CustomersDAO;

public class GetCustomerDetails {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			getSf();
			System.out.println("Enter customer id of customer whose details to be fetched : ");
			CustomersDAO customersDAOObject = new CustomersDAO();
			System.out.println("Customer details: "+customersDAOObject.showCustomerDetails(sc.nextInt()).toString());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			getSf().close();
		}
				
		
		
	}
}
