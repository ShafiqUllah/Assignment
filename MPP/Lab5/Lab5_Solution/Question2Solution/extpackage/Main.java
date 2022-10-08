package lab5.extpackage;

import java.time.LocalDate;

import lab5.prob2.CustOrderFactory;
import lab5.prob2.Customer;
import lab5.prob2.Order;



public class Main {
	public static void main(String[] args) {

		Customer customer = CustOrderFactory.createCustomer("Bob");
		
		Order order = CustOrderFactory.createNewOrder(customer, LocalDate.now());
		
		order.addItem("Shirt");
		order.addItem("Laptop");

		order = CustOrderFactory.createNewOrder(customer, LocalDate.now());
		order.addItem("Pants");
		order.addItem("Knife set");
		
		order = CustOrderFactory.createNewOrder(customer, LocalDate.now());
		order.addItem("Alu");
		order.addItem("Potol");
		order.addItem("Peyaj");

		System.out.println(customer. getOrders());
	}
}

		
