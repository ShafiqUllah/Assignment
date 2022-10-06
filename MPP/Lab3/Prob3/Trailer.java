package lab3.prob3;


public class Trailer extends Property{
	private static final double RENT = 500;
	private Address address;
	
	@Override
	public Address getAddress() {
		return address;
	}
	public Trailer(Address address) {
		this.address = address;
	}
	
	@Override
	public double computeRent(){
		return RENT;
	}
	
}
