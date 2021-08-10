public class Animal {
    //Attributes of the class

    private int numTeeth = 0;
    private boolean spots = false;
    private int weight = 0;

    //the constructor brings the  attributes into existence

    public Animal(int numTeeth, boolean spots, int weight){
        this.setNumTeeth(numTeeth);
        this.setSpots(spots);
        this.setWeight(weight);
    }

    //these methods will be used return the attributes so that other classes can access them when called
    //the methods will also set the attributes so that the new/different values could be assigned to the attributes

    public int getNumTeeth(){
        return numTeeth;
    }

    public void setNumTeeth(int numTeeth) {
        this.numTeeth = numTeeth;
    }

    public boolean getSpots() {
        return spots;
    }

    public void setSpots(boolean spots) {
        this.spots = spots;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


}
