package lambda.consumer;

import lambda.predicate.Employee;
import lambda.predicate.PredicateInterface;

import java.util.List;
import java.util.function.Consumer;

/**
 * Created by takunnithan on 09/07/2016.
 * This piece of code demonstrate the
 * Consumer interface from java 8.
 */
public class ConsumerInterface {

    /**
     * Apply salary raise to each employee in
     * the list.
     *
     * @param employeeList list of employees
     * @param raise        the Consumer Interface
     */
    public static void applyRaise(List<Employee> employeeList, Consumer<Employee> raise) {
        for (Employee employee : employeeList) {
            raise.accept(employee);
        }
    }

    public static void main(String[] args) {
        List<Employee> employeeList = PredicateInterface.createEmployee();
        applyRaise(employeeList, employee -> employee.setEmpSalary(employee.getEmpSalary() + employee.getEmpSalary() * .1));
        System.out.println("The raised salaries of the employees :");
        for (Employee employee : employeeList) {
            System.out.println(employee.getEmpName() + ":" + employee.getEmpSalary());
        }
    }
}
