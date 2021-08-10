import java.util.Scanner;

public class factorial {
 ////the method is void because it will not return anything
        public static void main(String[] args) {
///two integer variables are brought to existence
///the user is requested to enter a positive number
/// a for loop is used multiply the number valued in multiply to all the numbers that are less than number entered
/// once the for loop reaches count of the number entered it will stop and print the value of the  multiply variable
            int num;
            int multiply = 1;
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a number: ");
            num = in.nextInt();
            for (int i = 2; i <= num; i++) {
                multiply = multiply * i;
            }

            System.out.println("Factorial: " + multiply);

        }
}
