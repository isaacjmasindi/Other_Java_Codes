import java.util.Scanner;

public class Prime {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input a Number : ");

        int num = input.nextInt();

        isPrime(num);
    }

    //This method will check if the entered number is a prime or not
    public static int isPrime(int n) {

        //The if statement will be executed if the the number is less than two which is not a prime number
        if (n < 2) {
            System.out.print("not a prime1");

            return 0;
        }

        //for loop will be used to divide the number given
        for (int i = 2; i < n; i++) {

            //not a prime number
            if (n % i == 0) {

                System.out.print("not a prime2");

                return 0;
            }
        }
        //else the number is a prime number
        System.out.print("is a prime");
        return 1;
    }


}
