package course.src.subpackagefive;

import java.util.Iterator;
import java.util.LinkedList;

public class MyCollectionLink {

    public static void main(String[] args) {
        System.out.println("Linked list");
        
        LinkedList<String> ls = new LinkedList<String>();
        ls.add("Aby");
        ls.add("Ciby");
        ls.add("Baby");

        Iterator<String> itr = ls.iterator();

        while( itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}