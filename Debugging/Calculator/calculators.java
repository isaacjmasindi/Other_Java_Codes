import java.io.*;
import java.util.Scanner;

public class calculators {
    public static void main(String[] args) {


        boolean statement = true;
    ///This while loop will be used to keep requesting the user to enter a number if they have entered a letter,decimal or characters
    //the try will contain the menu and the catch will display an error message if the user doesn't enter a number
        while (statement) {
            int firstnumber=0;
            int secondnumber=0;

            try {

                Scanner selection = new Scanner(System.in);

                System.out.println("What arithmetic operation would you like to perform?");

                System.out.println("1. Addition");

                System.out.println("2. Subtraction");

                System.out.println("3. Multiplication");

                System.out.println("4. Division");

                System.out.println("0. End the program");

                String userInput1 = selection.nextLine();

                int arithmeticChoice = Integer.parseInt(userInput1);

                //the if statement will only be executed if the user's choice is is between 0 and 4 if not then the else statement will be executed
                if (arithmeticChoice >= 0 && arithmeticChoice <= 4) {

                    boolean statement2 =true;

                    //the while loop will be used to get the first  number from the user

                    while(statement2) {

                        ///the try and catch will help the program not to crash if the user enters a letter or decimal

                        try {
                            Scanner input = new Scanner(System.in);

                            System.out.print("\nPlease enter the first number: ");

                            String userInput2 = input.nextLine();

                            firstnumber = Integer.parseInt(userInput2);

                            if (firstnumber >= 0 || firstnumber <= 0) {

                                statement2 =false;

                                boolean statement3 =true;

                                //the while loop will be used to get the second number from the user
                                while (statement3) {

                                    ///the try and catch will help the program not to crash if the user enters a letter or decimal
                                    try {

                                        Scanner input2 = new Scanner(System.in);

                                        System.out.print("\nPlease enter the second  number: ");

                                        String userInput3 = input2.nextLine();

                                        secondnumber = Integer.parseInt(userInput3);

                                        if (secondnumber >= 0 || secondnumber <= 0) {

                                            statement3 = false;
                                        }
                                    }
                                    //the catch if the user enters a letter or decimal for the second number
                                    catch (NumberFormatException e) {
                                        System.out.println("Invalid input, re-enter your second number\n");
                                    }

                                }

                            }
                            //the catch if the user enters a letter or decimal for the first  number
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input, please re-enter your first number\n");

                        }
                    }
                    //this if statement will be executed if user selects addition
                    if (arithmeticChoice==1){

                        //both numbers are added together

                        int answer=firstnumber+secondnumber;

                        System.out.print("The answer for"+" "+firstnumber +" "+"+"+" "+secondnumber +" "+"="+" "+answer+"\n");

                        //this try and catch will be appending to the file
                        try{

                            File file =new File("answers.txt");

                            if(!file.exists()){

                                file.createNewFile();}

                            FileWriter fw = new FileWriter(file,true);

                            BufferedWriter bw = new BufferedWriter(fw);

                            PrintWriter pw = new PrintWriter(bw);
                            pw.println("");
                            pw.println("The answer for"+" "+firstnumber +" "+"+"+" "+secondnumber +" "+"="+" "+answer);
                            pw.close();

                        }catch(IOException ioe){
                            System.out.println("Exception occurred:");
                            ioe.printStackTrace();
                        }

                    }
                    //this if statement will be executed if user selects Subtraction
                    if (arithmeticChoice==2){

                        //both numbers are subtrated from each other
                        int answer=firstnumber-secondnumber;

                        System.out.print("The answer for"+" "+firstnumber +" "+"-"+" "+secondnumber +" "+"="+" "+answer+"\n");

                        //this try and catch will be used to append to the file

                        try{
                            File file =new File("answers.txt");

                            if(!file.exists()){

                                file.createNewFile();}

                            FileWriter fw = new FileWriter(file,true);

                            BufferedWriter bw = new BufferedWriter(fw);

                            PrintWriter pw = new PrintWriter(bw);

                            pw.println("");

                            pw.println("The answer for"+" "+firstnumber +" "+"-"+" "+secondnumber +" "+"="+" "+answer);

                            pw.close();

                        }catch(IOException ioe){
                            System.out.println("Exception occurred:");
                            ioe.printStackTrace();
                        }
                    }
                    //this if statement will be executed if the user selects multiply
                    if (arithmeticChoice==3){

                        //both numbers will multiply each other
                        int answer=firstnumber*secondnumber;

                        System.out.print("The answer for"+" "+firstnumber +" "+"X"+" "+secondnumber +" "+"="+" "+answer+"\n");

                        //this try and catch will be used the to append equation to the file
                        try{
                            File file =new File("answers.txt");

                            if(!file.exists()){

                                file.createNewFile();}

                            FileWriter fw = new FileWriter(file,true);

                            BufferedWriter bw = new BufferedWriter(fw);

                            PrintWriter pw = new PrintWriter(bw);

                            pw.println("");

                            pw.println("The answer for"+" "+firstnumber +" "+"X"+" "+secondnumber +" "+"="+" "+answer);

                            pw.close();

                        }catch(IOException ioe){
                            System.out.println("Exception occurred:");
                            ioe.printStackTrace();
                        }
                    }
                    //this if statement will be executed if the user selects to divide
                    if (arithmeticChoice==4){

                        //both the numbers are divided to each other
                        double answer=firstnumber/secondnumber;

                        System.out.print("The answer for"+" "+firstnumber +" "+"/"+" "+secondnumber +" "+"="+" "+answer+"\n");

                        //this try and catch will be used to append the equation to the file
                        try{
                            File file =new File("answers.txt");

                            if(!file.exists()){

                                file.createNewFile();}

                            FileWriter fw = new FileWriter(file,true);

                            BufferedWriter bw = new BufferedWriter(fw);

                            PrintWriter pw = new PrintWriter(bw);

                            pw.println("");

                            pw.println("The answer for"+" "+firstnumber +" "+"/"+" "+secondnumber +" "+"="+" "+answer);

                            pw.close();

                        }catch(IOException ioe){
                            System.out.println("Exception occurred:");
                            ioe.printStackTrace();
                        }
                    }
                    //this if statement will be executed if the user chooses to end the program
                    if (arithmeticChoice==0){
                        statement=false;
                    }
                }
                //this else statement will be executed if the user enters a number but that is not within the selections rang
                else{
                    System.out.print("you have entered the incorrect number\n");
                }
            }
            ///this catch will be when the user enters anything but an interger
            catch(NumberFormatException e){
            System.out.println("Please enter a number from the above menu \n");
        }
        }
    }
}

