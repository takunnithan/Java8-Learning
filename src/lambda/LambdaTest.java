package lambda;


import java.util.Arrays;

/**
 * Created by takunnithan on 08/21/2016.
 * A demo code for array sorting using
 * lambda functions.
 */
public class LambdaTest extends Thread {

    public static void main(String[] args) {

        /**
         * The whole body of the Runnable interface is
         * replaced with a lambda.
         */
        Thread thread = new Thread(() -> System.out.println("Hello iam using Lambda!!"));
        thread.run();

        /**
         * Sorting an integer array using
         * Comparator interface. Implementation
         *  is replaced by lambda function.
         */
        Integer[] numbers = {5, 6, 2, 8, 10};
        Arrays.sort(numbers, (e1, e2) -> e1 - e2);
        System.out.println("The sorted array is:" + Arrays.toString(numbers));
    }


}
