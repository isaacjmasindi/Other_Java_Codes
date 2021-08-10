public class Student2 implements Students{

    //the default constructor is set
    public Student2(){

    }

    @Override
    //This method will be used to capture all the information of the student
    //the method will return the student number and name
    public String Studentsdescription() {
        String depscription="";

        depscription=("Student 2: Michael Jackson");

        System.out.println("Student 2: Michael Jackson:\n" +
                "- Registered for the Web Development Bootcamp\n" +
                "- Completed level 1\n" +
                "- Completed level 2\n" +
                "- Completed level 3\n" +
                "- Registered for the Software Engineering Bootcamp\n");

        return depscription;
    }
}
