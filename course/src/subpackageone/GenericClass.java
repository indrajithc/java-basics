package course.src.subpackageone;

public class GenericClass {


    public static void main(String[] args) {
        
        String[] a1 = { "Aby", "Ciby", "Baby"};
        int[] a2 = { 1, 2, 3, 45, 6};
        double[] a3 = { 1.3, 4.3, 5.1 };

        print( a1);
        print( a2);
        print( a3);

    }

   static void print( String[] arr) {
        for( String value : arr) {
            System.out.println( value);
        }
    }

   static void print( int[] arr) {
        for( int value : arr) {
            System.out.println( value);
        }
    }
    static void print( double[] arr) {
        for( double value : arr) {
            System.out.println( value);
        }
    }
}