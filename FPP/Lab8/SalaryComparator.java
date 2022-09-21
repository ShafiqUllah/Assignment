package lab8;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		if (e1.getSalary() < e2.getSalary())
			return -1;
		else if (e1.getSalary() > e2.getSalary())
			return 1;
		else
			return 0;
	}

}
