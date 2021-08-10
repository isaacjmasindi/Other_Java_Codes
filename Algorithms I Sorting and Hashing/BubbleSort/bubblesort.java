
import java.util.Arrays;


public class bubblesort {

    public static  void sortlist(String [] arr, int n){

        String temp_list;

        //This for loop will run for as long as the length of the list
        for (int j = 0; j<n-1;j++){

            //this for loop will be used to do swap the items in the list
            for (int i=j+1;i<n;i++){

                //this if statement will be executed if one name is greater than the other
                if (arr[j].compareTo(arr[i])>0){

                    temp_list=arr[j];

                    arr[j]=arr[i];

                    arr[i]=temp_list;
                }
            }
        }

    }

    public static void main (String [] args){
        String [] arr={"right","subdued", "trick", "crayon", "punishment", "silk", "describe","royal", "prevent", "slope"};

        int n =arr.length;

        sortlist(arr,n);

        System.out.print(Arrays.toString(arr));
    }
}
