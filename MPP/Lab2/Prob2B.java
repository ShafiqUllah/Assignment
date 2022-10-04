package lab2;

import java.util.List;

public class Prob2B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order order = new Order(100);
		System.out.println(order);
		
		List<OrderLine> orderLine = order.getOrderLines();
		System.out.println(orderLine);
		
		order.addNewOrderLine();
		List<OrderLine> orderLine2 = order.getOrderLines();
		System.out.println(orderLine2);

	}

}
