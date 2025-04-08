import java.util.HashMap;
import java.util.Map;

/**
 * Singleton-Exercice
 *
 * @author Julien.Brunet
 * @since 2025-04-07
 */
public class UserManagement {
    private Map<String,String> users;
    public UserManagement(){
        users= new HashMap<String,String>();

        users.put("Albert","Albert1234");
        users.put("Bob","B9191");
        users.put("Cedric","CedCed");

    }

    public void add(String user,String password) {
        users.put(user,password);
    }
    public String getPassword(String user)  {
        return users.get(user);
    }


}