import java.util.Scanner;

public class Averagenumbers {
///the method is a void as it does not return anything
        public static void main(String [] args){
            Scanner input = new Scanner(System.in);

 ////different interger varibles are valued to 0 and brought to exsitant
            int positive = 0, negative = 0, total = 0, count = 0;
            int number;
            float average;

 ////a while loop is used to repeatedly ask the user to enter a number unitl they enter 0 to indicate they are done then the loop will break
 /// while the loop is running the postive and negative are being added a 1 on depending on the type of interger entered
 ///the total will also keep adding on the number entered
            while (true) {
                System.out.println("Please enter any numbers(negative or postive) and enter 0 when your are done: ");
                number = input.nextInt();
                total += number;
                count++;
                if(number > 0){
                    positive++;
                }
                else if(number < 0){
                    negative++;
                }

                if (number==0) {
                    break;
                }

            }

 ///once the while loops break the total number of negative and positive numbers will be displayed
 ///the total of all the numbers entered will be displayed
 ////the average of all the numbers entered will be displyed

            average = total / count;

            System.out.println("The number of positives is "+ positive);
            System.out.println("The number of negatives is "+ negative);
            System.out.println("The total is "+ total);
            System.out.println("The average is "+ average);

        }
    }

