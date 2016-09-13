package lambda.defaultmethod;

/**
 * Created by takunnithan on 09/13/2016.
 * This code will demonstrate the default
 * method implementation in interfaces.
 */
public class DefaultMethod {

    public static void main(String[] args) {
        System.out.println("Initializing....");
        Controller controller = () -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        controller.calculate();

    }
}
