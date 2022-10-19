package lab8;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Employee {

	private String name;

	public Employee(String name) {
		super();
		this.name = name;
	}

	static Function<String, String> toUpper;
	static Function<String, String> toUpper2;

	static Function<Employee, String> getName;
	static Function<Employee, String> getName2;

	static BiConsumer<Employee, String> setName;
	static BiConsumer<Employee, String> setName2;

	static BiFunction<String, String, Integer> compare;
	static BiFunction<String, String, Integer> compare2;

	static BiFunction<Integer, Integer, Double> power;
	static BiFunction<Integer, Integer, Double> power2;

	static Function<Apple, Double> apple;
	static Function<Apple, Double> apple2;

	static Function<String, Integer> toInt;
	static Function<String, Integer> toInt2;

	static BiFunction<Employee, Employee, Integer> eCom;
	static BiFunction<Employee, Employee, Integer> eCom2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		toUpper = (String x) -> x.toUpperCase();
		toUpper2 = String::toUpperCase;
		// Method reference type: Class::instanceMethod

		getName = (Employee e) -> e.getName();
		getName2 = Employee::getName;
		// Method reference type: Class::instanceMethod

		setName = (Employee e, String s) -> e.setName(s);
		setName2 = Employee::setName;
		// Method reference type: Class::instanceMethod

		compare = (String s1, String s2) -> s1.compareTo(s2);
		compare2 = String::compareTo;
		// Method reference type: Class::instanceMethod

		power = (Integer x, Integer y) -> Math.pow(x, y);
		power2 = Math::pow;
		// Method reference type: Class::staticMethod

		apple = (Apple a) -> a.getWeight();
		apple2 = Apple::getWeight;
		// Method reference type: Class::instanceMethod

		toInt = (String x) -> Integer.parseInt(x);
		toInt2 = Integer::parseInt;
		// Method reference type: Class::staticMethod

		EmployeeNameComparator comp = new EmployeeNameComparator();
		eCom = (Employee e1, Employee e2) -> comp.compare(e1, e2);
		eCom2 = new EmployeeNameComparator()::compare;
		// Method reference type: Class::instanceMethod
		
		new Employee("").evaluator();

	}

	void evaluator() {

		System.out.println(toUpper.apply("hello1"));
		System.out.println(toUpper2.apply("hello1"));

		Employee employee = new Employee("Shafiq");

		System.out.println(getName.apply(employee));
		System.out.println(getName2.apply(employee));

		setName.accept(employee, "Ullah");
		setName2.accept(employee, "Ullah_2");

		System.out.println(compare.apply("hello1", "hello1"));
		System.out.println(compare2.apply("hello2", "hello2"));

		System.out.println(power.apply(2, 3));
		System.out.println(power2.apply(2, 3));

		Apple apl = new Apple(25);

		System.out.println(apple.apply(apl));
		System.out.println(apple2.apply(apl));

		System.out.println(toInt.apply("10"));
		System.out.println(toInt2.apply("10"));

		Employee employee2 = new Employee("Shafiq2");

		System.out.println(eCom.apply(employee, employee2));
		System.out.println(eCom2.apply(employee, employee2));

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
