public class RegisterStudents {
    //this method will be used to return the a specific class infomation when it is called in the main method under the hyperiondev class
    public static Students getStudents(String selectedstudent) {

        if (selectedstudent == null) {
            return null;
        }
        //the if statement will return the Student1 class when its called
        if (selectedstudent.equalsIgnoreCase("Student1")) {

            return new Student1();
        }
        //the if statement will return the Student2 class when its called
        if (selectedstudent.equalsIgnoreCase("Student2")) {

            return new Student2();
        }
        //the if statement will return the Student3 class when its called
        if (selectedstudent.equalsIgnoreCase("Student3")) {

            return new Student3();
        }

        return null;
    }
}