package course.src.subpackageone;

import java.util.ArrayList;
import java.util.Collections;

public class SortClass {


    public static void main(String[] args) {
        System.out.println("Sorting list");

        ArrayList<String > listOfNames = new ArrayList<>();
        listOfNames.add("Aby");
        listOfNames.add("Ciby");
        listOfNames.add("Baby");
        System.out.println("Before sort");
        print(listOfNames);
        Collections.sort( listOfNames);
        System.out.println("After sort");
        print(listOfNames);

    }

    static void print( ArrayList<String> listOfNames) {
        for (String string : listOfNames) {
            System.out.println(string);
        }
    }
}