package lambda.higher_order.predicate;

import lambda.predicate.Employee;
import lambda.predicate.PredicateInterface;

import java.util.List;
import java.util.function.Predicate;

/**
 * Created by takunnithan on 09/20/2016.
 * This demonstrate the higher order functions
 * using lambda.
 * Uses the and, or, negate - default methods and
 * isEquals - static method of the Predicate interface
 */
public class PredicateFunction {

    public static void main(String[] args) {

        /**
          * Using the methods findEmployee() & createEmployee()
          * from PredicateInterface class
         */
        List<Employee> employeeList = PredicateInterface.createEmployee();
        Predicate<Employee> salaryPred  =  e -> e.getEmpSalary() > 2500;
        Predicate<Employee> experiencePred = e -> e.getExperience() > 3;
        /**
         * Creating a list employees who passed both predicates by
         * combining both predicates using higher order functions(and()).
         */
        List<Employee> finalList = PredicateInterface.findEmployee(employeeList, salaryPred.and(experiencePred));
        System.out.println("Employees who passed both predicates:");
        for(Employee employee: finalList){
            System.out.println(employee.getEmpName());
        }
    }
}
