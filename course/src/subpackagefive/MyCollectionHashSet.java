package course.src.subpackagefive;

import java.util.HashSet;
import java.util.TreeSet;

public class MyCollectionHashSet {

    public static void main(String[] args) {
        System.out.println("Hash set collection");

        HashSet<String> hs = new HashSet<String>();
        hs.add("Aby");
        hs.add("Ciby");
        hs.add("Ciby");
        hs.add("Ciby");
        hs.add("Baby");
 

        for( String string : hs ) {
            System.out.println("  " + string);
        }

        System.out.println("Tree set collection");

        TreeSet<String> ts = new TreeSet<String>();
        ts.add("Baby");
        ts.add("Aby");
        ts.add("Ciby");
        ts.add("Aby");
        ts.add("Ciby");
        ts.add("Baby");
 

        for( String string : ts ) {
            System.out.println("  " + string);
        }


         
    }

}