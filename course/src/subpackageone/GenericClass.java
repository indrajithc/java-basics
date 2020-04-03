package course.src.subpackageone;

public class GenericClass<M,N> {


    public static void main(String[] args) {
        
        String[] a1 = { "Aby", "Ciby", "Baby"};
        Integer[] a2 = { 1, 2, 3, 45, 6};
        Double[] a3 = { 1.3, 4.3, 5.1 };
        // M[] a3 = { 1.3, 4.3, 5.1 }; // bc of static 

        print( a1);
        print( a2);
        print( a3);

    }

   static <T>void print( T[] arr) {
        for( T value : arr) {
            System.out.println( value);
        }
    } 
}