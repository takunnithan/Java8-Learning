package lambda.binaryoperator;

import java.util.function.BinaryOperator;

/**
 * Created by takunnithan on 09/05/2016.
 * This piece of code demonstrate the
 * uses of BitFunction interface provided
 * by java 8.
 */
public class BitFunctionInterface {

    /**
     * Returns a integer value of the
     * operation done by the binary operator.
     *
     * @param first  integer
     * @param second integer
     * @param bin    BinaryOperator Interface
     * @return result of the operation
     */
    public static int bitOperator(int first, int second, BinaryOperator<Integer> bin) {
        return bin.apply(first, second);
    }

    public static void main(String[] args) {
        int result = bitOperator(15, 6, (a, b) -> a > b ? a : b);
        System.out.println("The largest number : " + result);
    }
}
