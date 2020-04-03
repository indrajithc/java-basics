package course.src.subpackagesix;

import java.util.ArrayList;

public class LoginInfo {


    public static void main(String[] args) {
        
        ArrayList<Login> userLogin = new ArrayList<Login>();

        userLogin.add(new Login("Aby", "wwer3"));
        userLogin.add(new Login("Ciby", "34232d"));
        userLogin.add(new Login("Baby", "sdse4w3")); 

        System.out.println("User details \n");

        for (Login login : userLogin) {
            System.out.println(
                "Username : " + login.username +
                "Password  : " + login.password
            );
        }
    }
}