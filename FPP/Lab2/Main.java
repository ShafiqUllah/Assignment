package SepSix;

public class Main {

	public static void main(String[] args) {
		/*
		 * Problem 1
		 */
		// TODO Auto-generated method stub
		Address billingAdd1 = new Address("10 Adams", "Springfield", "Illinois", "60007");
		Address shippingAdd1 = new Address("110 Burlington", "chicago", "Illinois", "60007");
		
		Address billingAdd2 = new Address("20 Adams", "chicago", "Illinois", "60007");
		Address shippingAdd2 = new Address("220 Burlington", "Springfield", "Illinois", "60007");
		
		Customer customer1 = new Customer("Shafiq", "Ullah", "123456");
		customer1.setBillingAddress(billingAdd1);
		customer1.setShippingAddress(shippingAdd1);
		
		Customer customer2 = new Customer("Mysha", "Mahajabin", "654321");
		customer2.setBillingAddress(billingAdd2);
		customer2.setBillingAddress(billingAdd2);
		
		//Prints info about Employee 1
		//System.out.println(customer1.toString());
		//System.out.println("Biliing address: " + customer1.getBillingAddress().toString());
		//System.out.println("Shipping address: " + customer1.getShippingAddress().toString());
		
		
		// Creates an Customer array of length 2
		Customer[] cusArray = new Customer[2];
		cusArray[0] = customer1;
		cusArray[1] = customer2;

		/*
		 * Searches the array for an Customer having city "chicago". If found, prints
		 * out the Customer full name
		 */
		for (int i = 0; i < cusArray.length; ++i) {
			String city = cusArray[i].getBillingAddress().getCity();
			if (city.equals("chicago")) {
				System.out.println(cusArray[i].toString());
			}
		}
		
		
		
	}

}
