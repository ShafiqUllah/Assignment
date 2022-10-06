package lab3.prob3;



public class House extends Property{
	private double lotSize;
	private Address address;
	
	@Override
	public Address getAddress() {
		return address;
	}
	public House(Address address, double lotSize) {
		this.address = address;
		this.lotSize = lotSize;
	}
	
	@Override
	public double computeRent(){
		return 0.1 * lotSize;
	}
}
