public class Student1 implements Students{
    //the default constructor is set
    public Student1(){
    }

    @Override
    //This method will be used to capture all the information of the student
    //the method will return the student number and name
    public String Studentsdescription() {
        String depscription="";

        depscription=("Student 1: Susan Smith");

        System.out.println("Student 1: Susan Smith:\n" +
                "- Registered for the Software Engineering Bootcamp\n" +
                "- Completed level 1\n");

        return depscription;
    }
}
