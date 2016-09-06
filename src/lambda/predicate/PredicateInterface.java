package lambda.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * A sample code to learn lambda using predicate interface
 * and its properties.
 * Created by takunnithan on 09/04/2016.
 */
public class PredicateInterface {

    /**
     * Creates a list of Employee objects
     * and initialize them with some values.
     */
    public static List<Employee> createEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(001, "John", 2600));
        employeeList.add(new Employee(002, "Mathew", 3600));
        employeeList.add(new Employee(003, "Henry", 3400));
        employeeList.add(new Employee(004, "Tom", 2700));
        employeeList.add(new Employee(001, "Gorden", 2300));
        return employeeList;
    }

    /**
     * returns a list of employees who satisfies the
     * predicate condition.
     * This demonstrate the use of lambda as well as
     * the use of Predicate interface in action.
     *
     * @param employeeList List of employees
     * @param predicate    A predicate function.
     * @return List of employees
     */
    public static List<Employee> findEmployee(List<Employee> employeeList, Predicate<Employee> predicate) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employeeList) {
            if (predicate.test(employee)) {
                result.add(employee);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        List<Employee> employeeList = createEmployee();
        System.out.println("The results are:");
        List<Employee> result = findEmployee(employeeList, e -> e.getEmpSalary() > 2500);
        List<Employee> finalResult = findEmployee(employeeList, e -> e.getEmpName().equals("Tom"));
        for (Employee employee : result) {
            System.out.println(employee.getEmpName());
        }
        System.out.println("The final result: " + finalResult.get(0).getEmpName());
    }

}
