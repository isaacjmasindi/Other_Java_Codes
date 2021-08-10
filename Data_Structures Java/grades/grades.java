public class grades {
/// the method is void as it does not return anything
    public static void main(String[] args) {

        ///the varibales are brought into existance and assigned to their data type
        int  sum = 0;
        float average;
        int[] gradesArray;

        ///the length of the array is 5
        gradesArray = new int[5];

        ///values are put into the array using indexes
        gradesArray[0] = 48;
        gradesArray[1] = 50;
        gradesArray[2] = 30;
        gradesArray[3] = 20;
        gradesArray[4] = 44;

        ///the for loop is used to add all the amounts in the array
        for (int i = 0; i < 5; i++) {
            sum = sum + gradesArray[i];
        }

        //the average of the numbers in the array is is calculated
        average = (float) sum / 5;

        ///comparism between the average and numbers from 0 to 100
        // / depending on the outcome of the average the a message will be displayed
        if (80 < average) {
            if (average < 100) {
                System.out.println("You got a A symbol, your mark is:" + average);
            }
        } else if (70 < average) {
            if (average < 79) {
                System.out.println("You got a B symbol, your mark is:" + average);
            }
        } else if (60 < average) {
            if (average < 69) {
                System.out.println("You got a C  symbol, your mark is:" + average);
            }
        } else if (50 < average) {
            if (average < 59) {
                System.out.println("You got a D symbol, your mark is:" + average);
            }
        } else if (average < 49) {
            System.out.println("You got a E symbol, your mark is:" + average);

        }
    }
}