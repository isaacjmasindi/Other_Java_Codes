import java.util.Arrays;
import java.util.Scanner;
public class identicalArray {
///the method is a viod as it does not return anything
        public static void main(String[] args) {
            ///the variables are assigned their data types

            int lenght_of_array1,length_of_array2;
            Scanner user_input = new Scanner(System.in);

            //the user is requested to enter the length of the array
            ///a new arrray is brought into existence

            System.out.print("Enter the length of array you want to create:");
            lenght_of_array1 = user_input.nextInt();
            int num_array[] = new int[lenght_of_array1];

            /// the user is asked to enter the values of the array
            // /each value is added into the array using a for loop

            System.out.println("please enter the values of the array:");
            for (int i = 0; i < lenght_of_array1; i++) {
                num_array[i] = user_input.nextInt();
            }

            System.out.println(Arrays.toString(num_array));

            Scanner user_input2= new Scanner(System.in);

            System.out.print("Enter the length  of the second array:  ");

            length_of_array2 = user_input2.nextInt();

            int num_array2[] = new int[length_of_array2];

            System.out.println("please enter the values of the second array:");

            for (int i = 0; i< length_of_array2; i++) {
                num_array2[i] = user_input2.nextInt();
            }

            System.out.println(Arrays.toString(num_array2));

            //an if statement is used to compare the two array and display a message as an outcome to confirm if the array are equal or not

            if (Arrays.equals(num_array, num_array2)) {
                System.out.println("both the arrays are equal");
            }
            else if (!Arrays.equals(num_array, num_array2)) {
                System.out.println("both the arrays are not equal");
            }
        }
    }

