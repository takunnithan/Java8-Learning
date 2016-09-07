package lambda.staticmethods;

import java.util.*;

/**
 * Created by takunnithan on 9/7/16.
 */
public class StaticMethodInterface {
    /**
     * Returns a list of random items.
     *
     * @param noOfItems no of items
     * @return List of random items
     */
    public static List<Integer> getItems(int noOfItems) {
        Random r = new Random();
        List<Integer> itemList = new ArrayList<>();
        for (int i = 0; i < noOfItems; i++) {
            itemList.add(r.nextInt(100));
        }
        return itemList;
    }

    public static void main(String[] args) {
        List<Integer> itemList = getItems(5);
        System.out.println("The items:");
        System.out.println(Arrays.toString(itemList.toArray()));

        /**
         * Calling a static method of an interface.
         */

        double total = Consumer.checkout(itemList, (e) -> e * .1);
        System.out.println("The total amount to be paid: " + total);
    }
}
