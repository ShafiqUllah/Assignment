package SepSix;

public class Prog7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 2; i++) {

			String output = "";
			output = String.format("%16d %12d %16d %12d %n %n", RandomNumbers.getRandomInt(1, 99),
					RandomNumbers.getRandomInt(1, 99), RandomNumbers.getRandomInt(1, 99),
					RandomNumbers.getRandomInt(1, 99));
			output += String.format("%13s %2d %9s %2d %13s %2d %9s %2d %n", "+", RandomNumbers.getRandomInt(1, 99), "+",
					RandomNumbers.getRandomInt(1, 99), "+", RandomNumbers.getRandomInt(1, 99), "+",
					RandomNumbers.getRandomInt(1, 99));
			output += String.format("%16s %12s %16s %12s", "____", "____", "____", "____");
			output += String.format(" %n %n %n %n");
			System.out.println(output);
		}
	}

}
