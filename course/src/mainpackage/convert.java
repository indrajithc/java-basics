package course.src.mainpackage;

public class convert {

    public static void main( String[]  args) {

        int age = 22;
        double salary = 3.2;
        boolean isMen  = true;

        //  converting to string
        String stringAge = String.valueOf(age);
        String stringSalary = String.valueOf(salary);
        String stringIsMen = String.valueOf(isMen);

        //  convert to integer
        int integerAge = Integer.parseInt(stringAge);
        int integerSalary = (int) salary;

        // convert to double
        double doubleAge = Double.parseDouble(stringAge);
        double doubleAgeFromInt = (double) age;

        System.out.println(" data type conversion completed ");
    }
}