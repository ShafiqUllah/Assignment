package lab4.partc;

import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee {

	private double commission;
	private double baseSalary;

	List<Order> listOrders = new ArrayList<>();

	public Commissioned(double commission, double baseSalary) {
		super();
		this.commission = commission;
		this.baseSalary = baseSalary;
	}

	public void addOrder(Order order) {
		listOrders.add(order);
	}

	@Override
	public double calcGrossPay(int month, int yr) {
		// TODO Auto-generated method stub

		double commission = 0;
		for (Order order : listOrders) {
			if (order.getOrderDate().getYear() == yr && order.getOrderDate().getMonthValue() == month - 1){
				// check if it is from previous month
				commission += order.getOrderAmount() ;
				//System.out.println(commission);
			}
				
		}

		commission = commission * (getCommission() / 100); // calculate with commission percent

		return baseSalary + commission;
	}

	public List<Order> getListOrders() {
		return listOrders;
	}
	
	
	
	public double getCommission() {
		return commission;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName();
	}

}
