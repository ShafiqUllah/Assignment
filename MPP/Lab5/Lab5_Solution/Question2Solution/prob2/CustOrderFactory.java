package lab5.prob2;

import java.time.LocalDate;

public class CustOrderFactory {

	private CustOrderFactory() {
	}

//	public static CustomerAndOrders createCustomer(String name) {
//
//		Customer customer = new Customer(name);
//
//		return new CustomerAndOrderImpl(customer);
//
//	}
	
	public static Customer createCustomer(String name) {

		Customer customer = new Customer(name);

		return customer;

	}

	public static Order createNewOrder(Customer customer, LocalDate date) {

		return new Order().newOrder(customer, date);

	}

}
