package SepSix;

public class Prog2 {
	public static void main(String[] args) {
		/*
		 * Problem 2
		 */
		
		double randomNumber = RandomNumbers.getRandomInt(1, 9);
		double result1 = Math.pow(Math.PI, randomNumber);
		
		System.out.println(result1);
		
		
		randomNumber = RandomNumbers.getRandomInt(3, 14);
		double result2= Math.pow(randomNumber, Math.PI);
		
		System.out.println(result2);
		
		

	}
}
