package lambda.function;

import lambda.predicate.Employee;
import lambda.predicate.PredicateInterface;

import java.util.List;
import java.util.function.Function;

import static jdk.nashorn.internal.objects.NativeNumber.valueOf;

/**
 * Created by takunnithan on 09/05/2016.
 * This piece of code is a demonstration of
 * Function interface provided by java 8
 * as part of Lambdas and Streams.
 * This code is finds the sum of salaries
 * of all the employees from a list.
 */
public class FunctionInterface {

    /**
     * Calculate the sum of salaries of
     * all the employees.
     *
     * @param employeeList List of employees
     * @param function     function interface implementation
     * @return sum of salaries.
     */
    public static double getSum(List<Employee> employeeList, Function<Employee, Double> function) {
        double sum = 0.0;
        for (Employee employee : employeeList) {
            sum = sum + function.apply(employee);
        }
        return sum;
    }

    /**
     * A general approach.
     * <p>
     * public static <T,Double> double getSum(List<T> list, Function<T,Double> function){
     * double sum = 0.0;
     * for(T item : list){
     * sum += valueOf(function.apply(item));
     * }
     * return sum;
     * }
     */

    public static void main(String[] args) {
        /**
         * Creating employees
         */
        List<Employee> employeeList = PredicateInterface.createEmployee();
        double sum = getSum(employeeList, employee -> employee.getEmpSalary());

        /**
         * Or a much simpler form using method references
         * double sum = getSum(employeeList, Employee::getEmpSalary);
         */

        System.out.println("The sum of salaries of all the employees: " + sum);
    }
}
