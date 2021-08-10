import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Scanner;

public class Myfiles {



    public static void main(String [] args)  {


        //the variables are assigned so they could be used throughout the method
        int max=0;
        int min=0;
        float average = 0;
        int sum2=0;
        int[] minlist = new int[]{};
        int[] maxlist = new int[]{};
        int[] averagelist = new int[]{};
        int [] P90list= new int []{};
        int [] sumlist = new int []{};
        int [] P70list = new int []{};
        int newlength=0;
        int converttoint1 =0;
        int converttoint2=0;

        //the try/catch is used to read from the file
        //the file name is inputfile and the info is stored in the fileinfo variable

        try {
            File inputfile = new File("input.txt");
            Scanner fileinfo = new Scanner(inputfile);
            int count = 0;
            int sum = 0;



            //the while loop is used to iterate through each line of the info using the hasNext function
            //while the while loop is iterating the count will be added by one
            // the info is split and added into a array which is also converted from string to integer

            while (fileinfo.hasNext()) {

                count += 1;

                String array1 = fileinfo.next();

                String newarray = array1.substring(4, array1.length());

                String[] newarray2 = newarray.split(",");

                int size = newarray2.length;

                int[] newarray3 = new int[size];

                for (int i = 0; i < size; i++) {
                    newarray3[i] = Integer.parseInt(newarray2[i]);
                }
                //the if statement will calculate the min number of the list that falls under the first count

                if (count == 1) {
                    min = getMin(newarray3);
                    minlist = newarray3;


                }

                //this if statement will calculate the max number of the list that falls under the second iterate

                if (count == 2) {
                    max = getMax(newarray3);
                    maxlist = newarray3;

                }
                //this if statement will calculate the average  number of the list that falls under the third iterate

                if (count == 3) {
                    averagelist = newarray3;

                    //the for loop will be used to calculate the sum of the list
                    for (int i = 0; i < newarray3.length; i++) {
                        sum = sum + newarray3[i];
                    }

                    average = (float) sum / newarray3.length;
                }
                //this if statement will be used to calculate  the 90th percentile  of the list that falls under the fourth iterate

                if (count==4){
                    P90list= newarray3;
                     newlength = newarray3.length;


                     double multiplation1 = newlength*0.9;
                     converttoint1 = (int) multiplation1;

                }
                //This if statement will calculate the sum number of the list that falls under the fifth iterate

                if (count==5){
                    sumlist = newarray3;
                    for (int i = 0; i < newarray3.length; i++) {
                        sum2 = sum2 + newarray3[i];
                    }
                }
                //this if statement will be used to calculate  the 70th percentile  of the list that falls under the fourth iterate

                if (count==6){
                    P70list = newarray3;
                    int newlength2 = newarray3.length;
                    double multiplation2 = newlength2*0.7;
                    converttoint2 = (int) multiplation2;

                }


            }
            fileinfo.close();

            //if the file is not found it will print out error
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }

        //the try/catch is used to write to the output.txt

        try {
            Formatter f = new Formatter( "output.txt" );
            f.format( "The min for "+" "+Arrays.toString(minlist)+"is"+" "+min+"\n");
            f.format( "The max for "+" "+Arrays.toString(maxlist)+"is"+" "+max+"\n");
            f.format( "The average for "+" "+Arrays.toString(averagelist)+"is"+" "+average+"\n");
            f.format( "The 90th percentile of"+Arrays.toString(P90list)+"is"+" "+ converttoint1 +"\n");
            f.format( "The sum of"+Arrays.toString(sumlist)+"is"+" "+sum2+"\n");
            f.format( "The 70th percentile of"+Arrays.toString(P70list)+"is"+" "+converttoint2);
            f.close();
        }

        catch (Exception e) {
            System.out.println( "Error" );
        }
    }


    //this method will be used to calculated when the max is being calculated
    //it will return the maximum value

    public static int getMax(int[] inputArray) {

        int maxvalue = inputArray[0];

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] > maxvalue) {
                maxvalue = inputArray[i];
            }
        }
        return maxvalue;
    }

    //this method will be used to calculated when the min is being calculated
    //it will return the minimum value

    public static int getMin(int[] inputArray) {

        int minvalue = inputArray[0];

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] < minvalue) {
                minvalue = inputArray[i];
            }
        }
        return minvalue;
    }
}

