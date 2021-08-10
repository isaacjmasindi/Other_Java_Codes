import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
class chores {



    public static void main(String[] args) {
        //two Array lists of names and chores .

        ArrayList<String> name = new ArrayList<>();

        ArrayList<String> chore = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of employees you have : ");

        int count = input.nextInt();

        input.nextLine();

        int loop = 1;

        int loop2 = 1;

        // the while loop to enter the names .
        while (loop <= count) {

            System.out.print("\nPlease enter their names :\n");

            name.add(input.nextLine());

            loop++;
        }

        // the while loop to enter the chores .
        while (loop2 <= count) {

            System.out.print("\nPlease enter the  chores: \n");

            chore.add(input.nextLine());

            loop2++;
        }
        //shuffles the list name list
        Collections.shuffle(name);

        //shuffles the chore list
        Collections.shuffle(chore);


        //for loop will be used to combine and print out the names and their chores

        for (int i=0; i<1;i++) {

            //the index of the shuffled name
            int nameIndex = name.size() - 1;

            //the index of the shuffled chore
            int choresIndex = chore.size() - 1;

            //while loop combines the names and chores using the get fuction
            while (nameIndex >= 0 && choresIndex >= 0) {

                 String info = name.get(nameIndex--) + " " + chore.get(choresIndex--);

                 System.out.println(info);
            }
        }

    }

}