package course.src.subpackagefive;

import java.util.HashMap;
import java.util.Map;

public class MyCollectionHash {


    public static void main(String[] args) {
        System.out.println("Hash collection");

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Aby");
        map.put(2, "Ciby");
        map.put(6, "Baby");

        System.err.println(map.get(6));

        for(Map.Entry m:map.entrySet()) {
            System.out.println("Key : " + m.getKey() + "    Value : " + m.getValue());
        }

        System.out.println("\n\n Added 3rd key");

        map.put(3, "Luby");
        map.put(6, "New Baby");

        for(Map.Entry m:map.entrySet()) {
            System.out.println("Key : " + m.getKey() + "    Value : " + m.getValue());
        }

        System.out.println("\n\n Removed 3rd key");
        map.remove(3);

        for(Map.Entry m:map.entrySet()) {
            System.out.println("Key : " + m.getKey() + "    Value : " + m.getValue());
        }
    }

}