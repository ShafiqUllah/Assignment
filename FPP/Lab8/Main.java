package lab8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
	private List<Address> listOfAddresses;
	private StringBuilder output = new StringBuilder();

	public static void main(String[] args) {
		Main m = new Main();
		m.loadData();
		m.printAsUpperCase();
	}

	private void loadData() {
		listOfAddresses = new ArrayList<>();
		listOfAddresses.add(new Address("Jim", "101 Adams", "Fairfield", "IA", "52556"));
		listOfAddresses.add(new Address("Tom", "30 W. Burlington", "Fairfield", "IA", "52556"));
		listOfAddresses.add(new Address("Hal", "14 E. Court", "Fairfield", "IA", "52556"));
		listOfAddresses.add(new Address("Sally", "410 W. Jefferson", "Fairfield", "IA", "52556"));
		listOfAddresses.add(new Address("MUM", "1000 N. 4th St", "Fairfield", "IA", "52556"));

	}

	public void printAsUpperCase() {
		// implement

		listOfAddresses.forEach((ad) -> System.out.println(formatFields(toUpper(ad))));
	}

	public List<String> toUpper(Address ad) {
		List<String> st = new ArrayList<>();
		st.add(ad.getName().toUpperCase());
		st.add(ad.getStreet().toUpperCase());
		st.add(ad.getCity().toUpperCase());
		st.add(ad.getState().toUpperCase());
		st.add(ad.getZip().toUpperCase());
		return st;
	}

	private String formatFields(List<String> list) {
		// implement
		String str = String.format("%s \n%s \n%s, %s %s\n", list.get(0), list.get(1), list.get(2), list.get(3),
				list.get(4));

		return str;
	}

}
