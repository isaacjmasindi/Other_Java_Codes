import java.util.Scanner;

    public class recursion {

        //this is the main method of the class
        public static void main(String[] args) {

            //the user will be requested to enter a sentence
            Scanner sentence = new Scanner(System.in);

            System.out.println("Please enter a senetnce :");

            String input = sentence.nextLine();

            recursion object = new recursion();

            //the reverse method will be called to print out the user's input reverse
            object.reverse(input);

            //the user will be requested to enter the max number of the fibonacci series they would like to see
            Scanner number = new Scanner(System.in);

            System.out.println("Please enter the max number of the fiboncci numbers you would like to see :");

            int inp = Integer.parseInt(number.nextLine());

            System.out.print("Fibonacci Series of " + inp + " numbers: ");

            //the for loop will be used to print out out the each number in the fibonacci series when the method is called
            for (int i = 0; i < inp; i++) {
                System.out.print(fibonacciRecursion(i) + " ");
            }
        }

        ///this method is used print the String into reverse when it is called
        public static void reverse(String sentence) {

            if ((sentence == null) || (sentence.length() <= 1)) {
                System.out.println(sentence);
            }
            else {
                System.out.print(sentence.charAt(sentence.length() - 1));
                reverse(sentence.substring(0, sentence.length() - 1));
            }
        }

        //this method will be used to return all the numbers of the fibonacci series when the method is called
        public static int fibonacciRecursion(int n) {
            if (n == 0) {
                return 0;
            }
            if (n == 1 || n == 2) {
                return 1;
            }
            return fibonacciRecursion(n - 2) + fibonacciRecursion(n - 1);
        }



    }


