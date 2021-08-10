//the class lion is subclass of animal

public class lion extends Animal {

    //the type is a attribute to this class

    String type = "";

    //the constructor which will bring the attributes to existence of both the Animal class and the lion class

    public lion(int numTeeth, boolean spots, int weight) {
        super(numTeeth, spots, weight);
        type(weight);
    }

    //this method will be used to determine the type(cub,female or male) of lion it is based on the weight that is set in Animal class
    public String type(int weight) {
        super.setWeight(weight);
        if (weight <= 80) {
            type = "Cub";
        }
        else if (weight <= 120) {
            type = "Female";
        }
        else {
            type = "Male";
        }
        return type;
    }

    //the toString will be used to turn the values of the attributes into strings in a readable manner
    //each atttibute will be in line with its correct description

    public String toString() {
        String output = "\nLion \n" +
         "\nNumber of Teeth: " + getNumTeeth()+
         "\nDoes it have spots?: " + getSpots()+
         "\nHow much does it weigh: " + getWeight()+
         "\nType of Lion: " + type;
        return output;
    }
}
