public class HyperionDev {
    //this is the main method
    public static void main(String[] args) {

        //the student 1 object is set and the calls the Studentdescription method to be able to print the Student description
        Students student1 = RegisterStudents.getStudents("Student1");

        student1.Studentsdescription();

        //the student 1 object is set and the calls the Studentdescription method to be able to print the Student description
        Students student2 = RegisterStudents.getStudents("Student2");

        student2.Studentsdescription();

        //the student 1 object is set and the calls the Studentdescription method to be able to print the Student description
        Students student3 = RegisterStudents.getStudents("Student3");

        student3.Studentsdescription();
    }
}
