import java.sql.*;
import java.util.Scanner;

public class Clerk {

    public static void main(String[] args) {
        try {
            // Connect to the ebookstore_db database, via the jdbc:mysql: channel on localhost (this PC)
            // Use username "root", password "Pet123er$".
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ebookstore_db?allowPublicKeyRetrieval=true&useSSL=false",
                    "root",
                    "Pet123er$");

            // Create a direct line to the database for running our queries

            Statement statement = connection.createStatement();

            ResultSet results = null;

            String choice = "";

            boolean menu_flag=true;

            //The  do while will keep displaying the menu for the use
            while (menu_flag) {

                System.out.println("\nPlease choose the options below:\n1-View all the books\n2-Enter book\n3-Update book\n4-Delete book\n5-Search books\n6-Exit");

                Scanner input = new Scanner(System.in);

                choice = input.nextLine();

                //if the user selects the first option all the books will be shown on the screen for them
                if (choice.equals("1")){

                    // The books are showed to the user
                    System.out.print("\nThe format for these books are in this order:ID of the book, Title of the book, Author of the book, Quantity of the book\n");

                    printAllFromTable(statement);
                }

                //if the user selects the second option they will be allowed to add a new book to the table
                else if (choice.equals("2")){
                    int id;

                    String title;

                    String Author;

                    int qty;

                    boolean correct_input=true;

                    //this while loop will keep asking the user to enter the required information if they have entered incorrect inputs
                    while (correct_input) {

                        //the try and catch will used to display a message if the user enters a incorrect data type
                        try {

                            System.out.println("\nPlease enter the Id of the book ");

                            Scanner input2 = new Scanner(System.in);

                            id = Integer.parseInt(input2.nextLine());

                            System.out.println("\nPlease enter the title of the book ");

                            Scanner input3 = new Scanner(System.in);

                            title = input3.nextLine();

                            System.out.println("\nPlease enter the author  of the book ");

                            Scanner input4 = new Scanner(System.in);

                            Author = input4.nextLine();


                            System.out.println("\nPlease enter the quantity of the books ");

                            Scanner input5 = new Scanner(System.in);

                            qty = Integer.parseInt(input5.nextLine());

                            //The if statement will only be executed if the the Id and quantity entered are positive numbers
                            if (id>0 & qty>0) {
                                //this will insert all the values into the table
                                statement.executeUpdate("INSERT INTO books VALUES (" + id + ",'" + title + "' ,'" + Author + "', " + qty + ")");

                                correct_input=false;
                            }
                            else{
                                System.out.print("A Id number or quantity can not be less than 1, please fill in the details again ");
                            }

                        }
                        catch(Exception e){
                            System.out.print("You have entered an incorrect input,please fill in the details again ");
                        }
                    }
                }
                else if  (choice.equals("3")){

                    int id;

                    int new_id;

                    String new_title;

                    String new_author;

                    int new_qty;

                    String second_choice ;

                    boolean correct_input=true;

                    //this while loop will keep asking the user to enter the required information if they have entered incorrect information
                    while (correct_input) {

                        //the try and catch will used to display a message if the user enters a incorrect data type
                        try {
                            System.out.println("\nPlease enter the Id of the book you would to change ");

                            Scanner input5 = new Scanner(System.in);

                            id = input5.nextInt();

                            //The if statement will only be executed if the the Id entered is a positive number
                            if (id>0) {
                                correct_input=false;

                                boolean correct_input2=true;

                                //this while loop will keep asking the user to enter the required information if they have entered incorrect information
                                while (correct_input2) {

                                    //the try and catch will used to display a message if the user enters a incorrect data type
                                    try {
                                        System.out.println("\nPlease choose the options below:\n1-Update ID \n2-Update title of the book\n3-Update Author \n4-Update quantity");

                                        Scanner input2 = new Scanner(System.in);

                                        second_choice = input2.nextLine();

                                        // if the user selects the first option then they will be allowed to change Id of the books
                                        if (second_choice.equals("1")) {

                                            System.out.println("\nPlease enter the new id ");

                                            Scanner changeid = new Scanner(System.in);

                                            new_id = changeid.nextInt();

                                            //The if statement will only be executed if the the new Id entered is a positive number
                                            if (new_id>0){

                                                //this statment will change current id to a new id
                                                statement.executeUpdate("UPDATE books SET id=" + new_id + " WHERE id=" + id + "");


                                                correct_input2=false;

                                            }else {System.out.print("\nThe ID number can not be less than one, Please try again\n");}


                                        }
                                        //// if the user selects the second option then they will be allowed to change title  of the books
                                        else if (second_choice.equals("2")) {

                                            System.out.println("\nPlease enter the new title  ");

                                            Scanner input1 = new Scanner(System.in);

                                            new_title = input1.nextLine();

                                            //this statment will change current title to a new title
                                            statement.executeUpdate("UPDATE books SET title=" + new_title + " WHERE id=" + id + "");

                                            correct_input2=false;

                                        }
                                        // if the user selects the third option then they will be allowed to change author of the books
                                        else if (second_choice.equals("3")) {
                                            System.out.println("\nPlease enter the new author ");

                                            Scanner input1 = new Scanner(System.in);

                                            new_author = input1.nextLine();

                                            //this statment will change current author to a new author
                                            statement.executeUpdate("UPDATE books SET title=" + new_author + " WHERE id=" + id + "");

                                            correct_input2=false;
                                        }
                                        // if the user selects the fourth option then they will be allowed to change quantity of the books
                                        else if (second_choice.equals("4")) {

                                            System.out.println("\nPlease enter the new id ");

                                            Scanner changeid = new Scanner(System.in);

                                            new_qty = changeid.nextInt();

                                            //The if statement will only be executed if the the new quantity entered is a positive number
                                            if (new_qty>0){

                                                //this statment will change current quantity to a new quantity
                                                statement.executeUpdate("UPDATE books SET qty=" + new_qty + " WHERE id=" + id + "");

                                                correct_input2=false;
                                            }
                                            else { System.out.print("\nQuantity can not be less than 1, please try again\n");
                                            }

                                        }
                                        else { System.out.print("\nInvalid input, please try again\n");
                                        }
                                    }
                                    catch (Exception e){
                                        System.out.print("\nInvalid input please try again\n");
                                    }
                                }
                            }
                            else {
                                System.out.print("\nThe Id does not exist,Please try again\n");
                            }
                        }
                        catch (Exception e){
                            System.out.print("\nInvalid input, Please try again\n");
                        }
                    }
                }
                //if the user selects the fourth option then they will be allowed to delete a specific book based on the Id number of the book
                else if (choice.equals("4")){

                    boolean correct_input=true;

                    //this while loop will keep asking the user to enter the required information if they have entered incorrect information
                    while (correct_input) {

                        //the try and catch will used to display a message if the user enters a incorrect data type
                        try {
                            int id;

                            System.out.println("\nPlease enter the Id of the book you would to delete");

                            Scanner inp = new Scanner(System.in);

                            id = inp.nextInt();

                            //The if statement will only be executed if the the id number entered is a positive number
                            if (id>0){

                                //this statement will delete the a record based on the id
                                statement.executeUpdate("DELETE FROM books WHERE id=" + id + "");

                                correct_input=false;
                            }

                            else {System.out.print("\nID can not be less than 1\n");
                            }
                        }
                        catch(Exception e){
                            System.out.print("\nInvalid input try again\n");
                        }
                    }
                }  else if  (choice.equals("5")){

                    boolean correct_input=true;

                    //this while loop will keep asking the user to enter the required information if they have entered incorrect information
                    while (correct_input) {

                        //the try and catch will used to display a message if the user enters a incorrect data type
                        try {
                            int id;

                            System.out.println("\nPlease enter the Id of the book you would to search for ");


                            Scanner input5 = new Scanner(System.in);


                            id=input5.nextInt();

                            //The if statement will only be executed if the the id number entered is a positive number
                            if (id>0) {

                                //this statement will select the a record based on the id
                                results = statement.executeQuery("select * FROM books WHERE id=" + id + "");

                                correct_input=false;

                                while (results.next()) {
                                    System.out.println(results.getInt("id") + ", " + results.getString("title") + ", " + results.getString("author") + ", " + results.getInt("qty"));

                                }
                            }
                            else {System.out.print("\nID can not be less than 1\n");}
                        }
                        catch(Exception e){
                            System.out.print("\nInvalid input try again\n");
                        }
                    }
                }
                else if (choice.equals("6")){

                    System.out.print("Logging out");
                    menu_flag=false;
                }
                else{

                    System.out.print("\nInvalid input please try again \n");
                }

            }
            // Close up our connections
            if (results != null) {
                results.close();
            }

            statement.close();

            connection.close();

        } catch (Exception e) {
            System.out.print("\nError\n");
        }
    }

    public static void printAllFromTable(Statement statement) throws SQLException {

        ResultSet results = statement.executeQuery("SELECT id, title, author, qty FROM books");
        while (results.next()) {
            System.out.println(
                    results.getInt("id") + ", "
                            + results.getString("title") + ", "
                            + results.getString("author") + ", "
                            + results.getInt("qty")
            );
        }
    }
}
