package exercice;

/**
 * Singleton-Exercice
 *
 * @author Julien.Brunet
 * @since 2025-04-07
 */
public class Context2 {

    public void start(){
        System.out.println("On récupère le password de  Jean  dans contexte 2: " + Bidon.userManager.getPassword("Jean") );
    }
}
