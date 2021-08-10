import java.util.Scanner;

public class GCDRecursion {
    //this is the main method of the GCD class
    public static void main(String[] args) {

        //the user will be asked to enter a number which will be the x value
        Scanner FirstNumber= new Scanner(System.in);

        System.out.println("Please enter the first number");

        int x=FirstNumber.nextInt();

        //the user will be asked to enter a number which will be the y value
        Scanner SecondNumber= new Scanner(System.in);

        System.out.println("Please enter the second number");

        int y=SecondNumber.nextInt();

        //the GCD method will be called with the values of x and y as the parameters
        int hcf = GCD(x, y);

        //the GCD for x and y will be printed here
        System.out.printf("G.C.D of %d and %d is %d.", x, y, hcf);
        }

        //this method will be used to return the GCD of n1 and n2
        public static int GCD(int n1, int n2)
        {
            if (n2 != 0)
                return GCD(n2, n1 % n2);
            else
                return n1;
        }

    }
