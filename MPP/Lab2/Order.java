package lab2;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private int orderNumber;
	private List<OrderLine> list = new ArrayList<>();
	Order(int orderNumber) {
		this.orderNumber = orderNumber;
		list.add(new OrderLine(orderNumber, this));
	}
	public void addNewOrderLine() {
		list.add(new OrderLine(orderNumber+2, this));
	}
	public List<OrderLine> getOrderLines() {
		return list;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return list.toString();
	}

}
