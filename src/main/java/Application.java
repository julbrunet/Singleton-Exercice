import exercice.Context1;
import exercice.Context2;


/**
 * Singleton-Exercice
 *
 * @author Julien.Brunet
 * @since 2025-04-07
 */
public class Application {


    public static void main(String[] args) {
        Context1 c1 = new Context1();
        Context2 c2 = new Context2();

        c1.start();
        c2.start();
    }
}
