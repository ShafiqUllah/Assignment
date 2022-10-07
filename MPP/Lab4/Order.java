package lab4.partc;

import java.time.LocalDate;

public class Order {
	private double orderNo;
	private LocalDate orderDate;
	private double orderAmount;
	private Commissioned commissioned;
	public Order(double orderNo, LocalDate orderDate, double orderAmount, Commissioned commissioned) {
		super();
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
		this.commissioned = commissioned;
	}
	public double getOrderNo() {
		return orderNo;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	public Commissioned getCommissioned() {
		return commissioned;
	}
	
	
	

}
