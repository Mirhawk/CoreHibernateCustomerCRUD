package tester;

import static utils.HibernateUtils.*;



import java.util.Date;
import java.util.Scanner;
import pojo.*;
import dao.*;

public class AddCustomer {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			getSf();
			
			System.out.println("Enter Name emailid password role regamount regdate");
			CustomerPOJO customer = new CustomerPOJO(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),new Date());
			CustomersDAO customersDAO = new CustomersDAO();
			System.out.println("Customer added with ID :"+customersDAO.addCustomer(customer));
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			getSf().close();
		}
	}
}
