/**
 * Singleton-Exercice
 *
 * @author Julien.Brunet
 * @since 2025-04-07
 */
public class Application {

    //L'objectif est de se débarrasser de cette variable statique en utilisant le singleton!
    public static UserManagement userManager = new UserManagement();

    public static void main(String[] args) {
        Context1 c1 = new Context1();
        Context2 c2 = new Context2();

        c1.start();
        c2.start();
    }
}
