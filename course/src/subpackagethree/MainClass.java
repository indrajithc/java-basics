package course.src.subpackagethree;

import java.util.Scanner;

public class MainClass {

    static Scanner scanner = new Scanner(System.in);

    static void addNewUser( ConnectToDB db ) { 
        System.out.print("Enter name : ");
        String username = scanner.nextLine();
        System.out.print("Enter password : ");
        String password = scanner.nextLine();

        db.add(username, password);
    }

    static void getAllUsers( ConnectToDB db) {
        db.getAll();
    }

    static void deleteUser ( ConnectToDB db) {
        Scanner scannerIn = new Scanner(System.in);
    
        System.out.print("Enter User Id : ");
        int id = scannerIn.nextInt();
        db.delete(id);
        getAllUsers( db);
    }



    static void updateUser( ConnectToDB db ) { 
        Scanner scannerIn = new Scanner(System.in);

        System.out.print("Enter User Id : ");
        int id = scannerIn.nextInt();

        System.out.print("Enter new name : ");
        String username = scanner.nextLine();
        System.out.print("Enter new password : ");
        String password = scanner.nextLine();

        db.update(username, password, id);
    }

    public static void main(String[] args) {
        System.out.println("Basic db operations");

        ConnectToDB db = new ConnectToDB();

        Scanner scannerIn = new Scanner(System.in);
        int operationId = 1 ;
        do {
            System.out.print(
                "\n [1] add " +
                "\n [2] display" + 
                "\n [3] delete" +
                "\n [4] update" +
                "\n [0] exit" +
                "\n Enter your choice : "
                );
            operationId = scannerIn.nextInt();

            switch( operationId ) {
                case 1:
                    addNewUser(db);
                    break;
                case 2:
                    getAllUsers(db);
                    break;
                case 3:
                    deleteUser(db);
                    break;

                case 4:
                    updateUser(db);
                    break;
    
                default :
                    System.out.println("exiting app");
                    operationId = 0;
            }
        } while ( operationId > 0 );
        

        try {
            db.con.close();
        } catch (Exception e) {
            //TODO: handle exception
        }

    }
}