package course.src.subpackagesix;

import java.util.StringJoiner;

public class StringConc {

    public static void main(String[] args) {
        
        String[] names = { "Aby", "Ciby", "Baby"};

        StringJoiner stringJoiner = new StringJoiner(",", "[", "]");
        stringJoiner.setEmptyValue("no value");

        for (String string : names) {
            stringJoiner.add(string);
        }

        System.out.println("Joined String : " + stringJoiner);
    }
}