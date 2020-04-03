package course.src.subpackagetwo;

import java.io.FileReader;
import java.io.FileWriter;

public class SimpleFileClass {
    static String filePath = "file.txt";
    public static void main(String[] args) {
        
        writeToFile("Hello from java world");
        readFromFile();
    }

    static void writeToFile( String string ) {
        try {
            FileWriter fileWriter =  new FileWriter(filePath, true);
            fileWriter.write(string);
            fileWriter.close();
        } catch( Exception e) {
            System.out.println("\n\nError : " + e.getMessage());
        }
    }
    
    static void readFromFile( ) {
        try {
            FileReader fileReader =  new FileReader(filePath); 
            int c;
            while( (c = fileReader.read())!= -1) {
                System.out.print(( char) c);
            }
            System.out.println();
            fileReader.close();
        } catch( Exception e) {
            System.out.println("\n\nError : " + e.getMessage());
        }
    }
}