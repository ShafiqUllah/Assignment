package lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {

	private double maintainanceCost;
	private List<Apartment> listOApartments = new ArrayList<>();

	public Building(double maintainanceCost, double apartmentRent) {
		super();
		this.maintainanceCost = maintainanceCost;
		listOApartments.add(new Apartment(apartmentRent));

	}

	public double getMaintainanceCost() {
		return maintainanceCost;
	}

	public List<Apartment> getListOApartments() {
		return listOApartments;
	}

	public void addApartment(Apartment a) {
		listOApartments.add(a);
	}

	public double getProfit() {
		double apartRent = 0;
		for (Apartment ap : listOApartments) {
			apartRent += ap.getRent();
		}
		return apartRent - maintainanceCost;
	}

}
