public class Student3 implements Students{
    //the default constructor is set
    public Student3(){

    }

    @Override
    //This method will be used to capture all the information of the student
    //the method will return the student number and name
    public String Studentsdescription() {

        String depscription="";

        depscription=("Student 3: Saoirse Ronan");

        System.out.println("Student 3: Saoirse Ronan:\n" +
                "Registered for the Web Development Bootcamp\n" +
                "- Completed level 1\n" +
                "- Completed level 2\n" +
                "- Completed level 3\n" +
                "- Registered for the Software Engineering Bootcamp\n" +
                "- Completed level 1\n");

        return depscription;
    }
}
