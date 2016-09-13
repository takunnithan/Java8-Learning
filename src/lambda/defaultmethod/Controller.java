package lambda.defaultmethod;

/**
 * Created by takunnithan on 09/13/2016.
 * An interface with a default method.
 */
public interface Controller {

    void run();

    /**
     * Calculates the time taken
     *  by the run method.
     */
    default void calculate(){
        long startTime = System.currentTimeMillis();
        run();
        long endTime = System.currentTimeMillis();
        long timeElapsed = (endTime - startTime)/1000;
        System.out.println("The time elapsed : " + timeElapsed + " sec");
    }

}
