package lambda.higher_order.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Created by takunnithan on 9/21/16.
 * This demonstrate the compose, andThen, identity
 * methods from the Function Interface
 */
public class FunctionInterface {

    /**
     * Transforms a list of employee names
     *
     * @param stringList List of employees
     * @param function   An implementation of Function Interface
     * @return Transformed list of employee names
     */
    public static List<String> transform(List<String> stringList, Function<String, String> function) {
        List<String> employeeList = new ArrayList<>();
        for (String employees : stringList) {
            employeeList.add(function.apply(employees));
        }
        return employeeList;
    }

    /**
     * Compose all the functions into one.
     *
     * @param functions function arguments
     * @param <T>       Employee names - String
     * @return Function composed of all other functions.
     */
    public static <T> Function<T, T> composeAll(Function<T, T>... functions) {
        Function<T, T> result = Function.identity();
        for (Function<T, T> f : functions) {
            result = result.compose(f);
        }
        return result;
    }

    /**
     * Creates a list of employee names
     *
     * @return List of employee names
     */
    public static List<String> createEmployeeList() {
        List<String> employeeList = new ArrayList<>();
        employeeList.add("John");
        employeeList.add("Peter");
        employeeList.add("Matt");
        employeeList.add("Tom");

        return employeeList;
    }

    /**
     * Displays the list of employees
     *
     * @param empList List of employees
     */
    public static void display(List<String> empList) {
        for (String empName : empList) {
            System.out.println(empName);
        }
    }

    public static void main(String[] args) {
        Function<String, String> toUpper = String::toUpperCase;
        Function<String, String> addTitle = s -> "Mr." + s;
        /*Combining functions using compose method.*/
        List<String> employeeList = transform(createEmployeeList(), toUpper.compose(addTitle));
        System.out.println("The list of employees after transformation");
        display(employeeList);


        /* Combining functions using andThen() */
        Function<String, String> toLower = String::toLowerCase;
        List<String> employees = transform(createEmployeeList(), toUpper.andThen(toLower));
        System.out.println("The list of employees after transformation( andThen())");
        display(employees);

        /* Using identity() to compose multiple the functions into one */
        Function<String, String> combinedFuncion = composeAll(toUpper, addTitle);
        List<String> empList = transform(createEmployeeList(), combinedFuncion);
        display(empList);


    }

}
