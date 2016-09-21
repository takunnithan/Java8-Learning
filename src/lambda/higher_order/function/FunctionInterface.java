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

    public static List<String> transform(List<String> stringList, Function<String, String> function){
        List<String> employeeList = new ArrayList<>();
        for(String employees : stringList){
            employeeList.add(function.apply(employees));
        }
        return employeeList;
    }

    public static List<String> createEmployeeList(){
        List<String> employeeList = new ArrayList<>();
        employeeList.add("John");
        employeeList.add("Peter");
        employeeList.add("Matt");
        employeeList.add("Tom");

        return employeeList;
    }
    public static void main(String[] args) {
        Function<String, String> toUpper = String::toUpperCase;
        Function<String, String> addTitle = s -> "Mr." + s;
        List<String> employeeList = transform(createEmployeeList(),toUpper.compose(addTitle));
        System.out.println("The list of employees after transformation");
        for(String empName: employeeList){
            System.out.println(empName);
        }
    }

}
