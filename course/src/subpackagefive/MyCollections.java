package course.src.subpackagefive;

import java.util.ArrayList;

 class User {
    String name ;
    int age;
    
    public User( String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class MyCollections {

    public static void main(String[] args) {
        ArrayList<User> arr = new ArrayList<User>();
        arr.add( new User( "Aby", 22));
        arr.add( new User( "Ciby", 42));
        arr.add( new User( "Baby", 21));
       

        arr.remove(1);

        for (User user : arr) {
            System.out.println(user.name + ":" + user.age);
        } 

    }

}