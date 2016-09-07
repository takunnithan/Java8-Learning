package lambda.staticmethods;

import java.util.List;

/**
 * Created by takunnithan on 9/7/16.
 * Demonstration of static methods in
 * interfaces.This code adds the tax
 * associated with a list of items.
 */
public interface Consumer {

     double applyTax(int item);

    static double checkout(List<Integer> list, Consumer consumer) {
        System.out.println("Calculating tax...");
        int total = 0;
        for (int item : list) {
            total += consumer.applyTax(item) + item;
        }
        return total;
    }
}
