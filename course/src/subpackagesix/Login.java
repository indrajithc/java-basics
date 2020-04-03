package course.src.subpackagesix;

public class Login {
    String username;
    String password;

    public Login( String username, String password ) {
        this.username = username;
        this.password = password;
    }

    Boolean isWeak () {
        if( this.password.length() <= 4) 
        return true;
        else
        return false;
    }
}