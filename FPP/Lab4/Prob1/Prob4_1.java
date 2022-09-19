package SepNine.Prob1;

import java.time.LocalDate;
import java.util.Scanner;

public class Prob4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DeptEmployee[] department = new DeptEmployee[5];

		department[0] = new Professor("Asad", LocalDate.of(2020, 10, 15), 2000, 10);
		department[1] = new Professor("Salim", LocalDate.of(2021, 2, 1), 1500, 10);
		department[2] = new Professor("Shafiq", LocalDate.of(2022, 9, 23), 1000, 10);
		
		department[3] = new Secretary("Nahid", LocalDate.of(2016, 5, 21), 600, 200);
		department[4] = new Secretary("Atik", LocalDate.of(2019, 3, 24), 800, 200);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Do you want to see total salary of the department? (y/n) ");
		String answer = sc.next();
		if(answer.equalsIgnoreCase("y")){
			double salaryTotal = 0;
			for(DeptEmployee e : department) {
				salaryTotal += e.computeSalary();
			}
			System.out.println("Total salart is "+ salaryTotal);
		}
		else {
			//do nothing..the application ends here
		}	

	}

}
