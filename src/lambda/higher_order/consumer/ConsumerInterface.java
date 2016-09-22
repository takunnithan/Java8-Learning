package lambda.higher_order.consumer;

import lambda.predicate.Employee;
import lambda.predicate.PredicateInterface;

import java.util.List;
import java.util.function.Consumer;

/**
 * Created by takunnithan on 09/22/2016.
 * This demonstrate the andThen method.
 */
public class ConsumerInterface {

    /**
     * Runs the process associated with a consumer interface
     * @param employeeList list of employees
     * @param consumer A consumer interface implementation
     * @param <T> Type of the consumer
     */
    public static<T> void process(List<T> employeeList, Consumer<T> consumer){
        for(T employee: employeeList){
            consumer.accept(employee);
        }
    }

    public static void main(String[] args) {

        /*Creating a list of employees*/
        List<Employee> employeeList = PredicateInterface.createEmployee();

        /*Higher order lambdas using consumer interface*/
        Consumer<Employee> consumer = c-> c.setEmpSalary(c.getEmpSalary()+ c.getEmpSalary()*.1);
        Consumer<Employee> show = e -> System.out.println(e.getEmpName() + ":" + e.getEmpSalary());
        process(employeeList,consumer.andThen(show));
    }
}
