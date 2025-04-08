/**
 * Singleton-Exercice
 *
 * @author Julien.Brunet
 * @since 2025-04-07
 */
public class Context1 {

    public void start(){
        System.out.println("On crée le user Jean( J11111)  dans contexte 1");
        Application.userManager.add("Jean","J11111");
    }
}
