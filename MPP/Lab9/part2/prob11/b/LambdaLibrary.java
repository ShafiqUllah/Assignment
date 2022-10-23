package lab9.part2.prob11.b;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaLibrary {
    public static final TriFunction<List<Employee>, Integer, String, String> EMPLOYEE_QUERY =
            (employeeList, salary, lastNameCutoff) ->
                employeeList.stream().filter(employee -> employee.getSalary() > salary)
                        .filter(employee -> employee.getLastName().compareTo(lastNameCutoff) >= 0 )
                        .map(employee -> employee.getFirstName() + " " + employee.getLastName())
                        .sorted(Comparator.comparing(String::new))
                        .collect(Collectors.joining(", \n"));


}
