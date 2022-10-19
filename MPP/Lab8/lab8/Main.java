package lab8;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		
		Supplier<Double> supplierOfRandomNumber = () -> (double)Math.random();
		
		System.out.println(supplierOfRandomNumber.randomNumber());

	}
	
	public interface Supplier <T> {
		T randomNumber();
	}

}
