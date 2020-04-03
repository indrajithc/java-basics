package course.src.subpackageone;

import java.util.ArrayList;
import java.util.Collections;

class Person {
    String name;
    int age;

    Person( String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class SortClass {


    public static void main(String[] args) {
        System.out.println("Sorting list");

        // ArrayList<String > listOfNames = new ArrayList<>();
        // listOfNames.add("Aby");
        // listOfNames.add("Ciby");
        // listOfNames.add("Baby");
        // System.out.println("Before sort");
        // print(listOfNames);
        // Collections.sort( listOfNames);
        // System.out.println("After sort");
        // print(listOfNames);

        ArrayList<Person > listOfNames = new ArrayList<>();
        listOfNames.add( new Person("Aby", 12));
        listOfNames.add( new Person("Ciby", 22));
        listOfNames.add( new Person("Baby", 33));
        listOfNames.add( new Person("Aby", 12)); 

        System.out.println("Before sort");
        print(listOfNames);
        // Collections.sort( listOfNames);
        // System.out.println("After sort");
        // print(listOfNames);

    }

    static void print( ArrayList<Person> listOfNames) {
        for (Person person : listOfNames) {
            System.out.println("\n Name : " + person.name);
            System.out.println(" Age  : " + person.age);
        }
    }
}