package course.src.subpackagetwo;

import java.io.FileWriter;

public class SimpleFileClass {

    public static void main(String[] args) {
        String filePath = "file.txt";
        try {
            FileWriter fileWriter =  new FileWriter(filePath);
            fileWriter.write("Welcome back to java world");
            fileWriter.close();
        } catch( Exception e) {
            System.out.println("\n\nError : " + e.getMessage());
        }
    }
}