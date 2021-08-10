import java.util.Arrays;

public class NoDups {

    public static int removing_dupl(int array[], int length_array){

        //This if statement is used to return the length _array which will be used to identify the length of the array

        if (length_array==0||length_array==1){
            return length_array;
        }

        //The new array is created and array is assigned its length which will be length_array
        //variable count is valued to 0

        int[]first_array=new int[length_array];

        int count=0;

        //the for loop will be used add the items in arr into the newly created array
        //the if statement will be used to add the non duplicate items into the new array

        for (int i=0; i<length_array-1;i++){
            if (array[i]!=array[i+1]) {
                first_array[count++] = array[i];
            }
        }

        //the non duplicate array items is the taken back into the original array using the for loop
        //count is returned

        first_array[count++]=array[length_array-1];

        for (int i=0;i<count;i++){
            array[i]=first_array[i];
        }
        return count;
    }

    ///this method is a void which means it wont return anything

    public static void main(String[] args){

        ///the array is assigned its values

        int array[]={20,100,10,80,70,1,0,-1,2,10,15,300,7,6,2,18,19,21,9,0};

        System.out.println("This is the array before it was sorted and duplicates removed: "+Arrays.toString(array));

        //the array is then sorted from small to largest

        Arrays.sort(array);

        int length=array.length;

        //the removing_dupl is called

        length=removing_dupl(array,length);

        int[] new_array=new int [length];

        //the for loop will add each item of the array into a new array

        for (int i=0;i<length;i++){
            new_array[i]=array[i];
        }
        System.out.println("This is the current array: "+Arrays.toString(new_array));

    }
}
