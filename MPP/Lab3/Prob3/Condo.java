package lab3.prob3;



public class Condo extends Property{
	private Address address;
	private int numberOfFloors;
	
	@Override
	public Address getAddress() {
		return address;
	}
	
	public Condo(Address address, int numberOfFloors) {
		this.address = address;
		this.numberOfFloors = numberOfFloors;
	}

	@Override
	public double computeRent(){
		return 500 * numberOfFloors;
	}
}
