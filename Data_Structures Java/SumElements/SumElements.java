import java.util.Scanner;
public class SumElements {
//the method is void as it does not return anything
        public static void main(String[] args){

            //the array is assigned to its data type which in this case is a double
            //the length of the array is set to 3 rows and 4 columns

            double[][]numbers_table=new double[3][4];
            Scanner input=new Scanner(System.in);

            ///this for loop run until there are three sets of rows

            for (int row=0; row<numbers_table.length;row++){
                ///this for loop will run until there are for sets of columns
                for (int column=0;column<numbers_table[row].length;column++){
                    System.out.println("Please enter the numbers you could like: ");
                    String input_string=input.nextLine();
                    numbers_table[row][column]=Double.parseDouble(input_string);
                }
            }
            /// this for loop will be used to calculate the total of the four sets of columns
            for (int column=0;column<numbers_table[0].length;column++){
                double num_of_column=0;
                for (int row =0;row<numbers_table.length;row++){
                    num_of_column+=numbers_table[row][column];
                }
                System.out.println("sum for elments in column"+ column+"="+num_of_column);
            }
        }

    }

