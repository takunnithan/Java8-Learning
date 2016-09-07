package lambda.supplier;

import lambda.predicate.Employee;

import java.util.function.Supplier;

/**
 * Created by takunnithan on 9/7/16.
 * This code will demonstrate the
 * Supplier interface by java 8
 */
public class SupplierInterface {

    /**
     * Returns an Employee object
     *
     * @param supplier Supplier Interface
     * @return Employee object
     */
    public static Employee getEmployee(Supplier<Employee> supplier) {
        Employee employee = supplier.get();
        return employee;
    }

    public static void main(String[] args) {
        Employee employee = getEmployee(() -> new Employee(001, "John", 2600));
        System.out.println("The employee details:");
        System.out.println(employee.getEmpName());
    }
}
