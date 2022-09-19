package SepSix;

import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Type your input: ");
		String input = sc.nextLine();
		System.out.print("Your output is: ");
		for(int i = input.length()-1; i>=0; i--){
			System.out.print(input.charAt(i));
		}
	}

}
