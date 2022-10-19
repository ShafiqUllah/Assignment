package lab8.Prob2.b;

import java.util.Comparator;

import lab8.Prob2.b.EmployeeInfo.SortMethod;

/* A functor, but not a closure */
public class EmployeeComparator implements Comparator<Employee> {
	SortMethod method;

	public EmployeeComparator(SortMethod method) {
		super();
		this.method = method;
	}

	@Override
	public int compare(Employee e1, Employee e2) {

		if (method == SortMethod.BYNAME) {
			return e1.name.compareTo(e2.name);
		} else {
			if (e1.salary == e2.salary)
				return 0;
			else if (e1.salary < e2.salary)
				return -1;
			else
				return 1;
		}

	}
}
