package course.src.mainpackage;

public class nestedFor {
   public static void main(String[] args) {
       for( int o = 0; o <  10; o++) {
           for( int p=0; p< 10; p++) {
               System.out.print("*");
           }
           System.out.println("");
       }

       for( int o = 0; o <  10; o++) {
        for( int p=0; p< o; p++) {
            System.out.print("*");
        }
        System.out.println("q");
    }

    for( int o = 0; o <=  9; o++) {
        for( int p=0; p<= o; p++) {
            if( p == o)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println("");
    } 

   for( int o = 0; o <=  9; o++) {
        for( int p=0; p<= 9; p++) {
            if( p == 4) {
                break; 
                } 
            System.out.print(" ["+ o + p +"] "); 
        }
        System.out.println("");
    }


    for( int o = 0; o <=  9; o++) {
        for( int p=0; p<= 9; p++) {
            if( p == 4) {
                // break; 
                continue;
                } 
            System.out.print(" ["+ o + p +"] "); 
        }
        System.out.println("");
    }
}

}