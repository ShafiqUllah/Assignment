package lab2;

public class OrderLine {
	private Order order;
	private int id;

	OrderLine(int d, Order order) {
		this.order = order;
		this.id = d;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "orderLine id " + id;
	}

}
