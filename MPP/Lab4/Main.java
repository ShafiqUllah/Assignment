package lab4.partc;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Commissioned commissioned = new Commissioned(10, 1000);
		Hourly hourly = new Hourly(10, 1);
		Salaried salaried = new Salaried(2000);

		Employee[] employeesArray = { commissioned, hourly, salaried };

		Order order1 = new Order(1, LocalDate.of(2022, 6, 10), 1000, commissioned);
		Order order2 = new Order(2, LocalDate.of(2022, 5, 10), 2000, commissioned);
		Order order3 = new Order(3, LocalDate.of(2022, 4, 10), 3000, commissioned);
		Order order4 = new Order(4, LocalDate.of(2022, 3, 10), 4000, commissioned);
		Order order5 = new Order(5, LocalDate.of(2022, 2, 10), 5000, commissioned);
		Order order6 = new Order(6, LocalDate.of(2022, 1, 10), 6000, commissioned);
		Order order7 = new Order(2, LocalDate.of(2022, 5, 10), 2000, commissioned);

		commissioned.addOrder(order1);
		commissioned.addOrder(order2);
		commissioned.addOrder(order3);
		commissioned.addOrder(order4);
		commissioned.addOrder(order5);
		commissioned.addOrder(order6);
		commissioned.addOrder(order7);

		for (Employee e : employeesArray) {
			System.out.println(e.toString() + " employee get net payment " + e.calcCompensation(6, 2022).getNetPay());
		}

	}

}
