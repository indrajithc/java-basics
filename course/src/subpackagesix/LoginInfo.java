package course.src.subpackagesix;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class LoginInfo {


    public static void main(String[] args) {
        
        ArrayList<Login> userLogin = new ArrayList<Login>();

        userLogin.add(new Login("Aby", "wwe3"));
        userLogin.add(new Login("Ciby", "34232d"));
        userLogin.add(new Login("Baby", "sdse4w3")); 

        System.out.println("User details \n");

        for (Login login : userLogin) {
            System.out.println(
                "Username : " + login.username +
                "Password  : " + login.password
            );
        }

        System.out.println("\n\nUSer derails by iterator\n");
        Iterator<Login> iterator = userLogin.iterator();
        while( iterator.hasNext()) {
            Login nextElement = iterator.next();
            System.out.println(
                "Username : " + nextElement.username +
                "Password  : " + nextElement.password
            ); 
        }
 
        System.out.println("\n\nUser derails by lamdba \n");
        userLogin.forEach( loginInfo -> {
            System.out.println(
                "Username : " + loginInfo.username +
                "Password  : " + loginInfo.password
            ); 
        });

        Predicate<Login> predicateRules = (p) -> p.isWeak() == true;

        System.out.println("\n\nUser derails by lamdba with week password \n");
        userLogin.forEach( loginInfo -> {

            if( predicateRules.test( loginInfo))
            System.out.println(
                "Username : " + loginInfo.username +
                "Password  : " + loginInfo.password
            ); 
        });
    }
}