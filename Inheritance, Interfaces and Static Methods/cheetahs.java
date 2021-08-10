import java.util.Arrays;

public class cheetahs extends Animal {
    //yearsliving is a attribute to this class
    int [] yearsliving;

    //the constructor which will bring the attributes to existence of both the Animal class and the cheetahs class
    public cheetahs(int numTeeth, boolean spots, int weight) {
        super(numTeeth, spots, weight);
        yearsliving =new int[]{2015,2016,2017,2018,2019,2020,2021};

    }
    //this method will be used to return yearsliving attribute if another class wants to access it
    public int[] getyearsliving() {
        return yearsliving;
    }

    //this method will be used to allow this class or other class to change the value of this attribute
    public void setYearsliving() {
        this.yearsliving = yearsliving;
    }





    //the toString will be used to turn the values of the attributes into strings in a readable manner
    //each atttibute will be in line with its correct description
    public String toString() {
        String output = "\nCheetah \n" +
         "\nNumber of Teeth: " + getNumTeeth()+
         "\nDoes it have spots?: " + getSpots()+
         "\nHow much does it weigh: " + getWeight()+
         "\nYears the cheetah has been living: " + Arrays.toString(yearsliving);
        return output;
    }
}
