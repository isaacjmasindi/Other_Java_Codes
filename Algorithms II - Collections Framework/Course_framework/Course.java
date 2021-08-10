import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Course {
    //the atrributes to the course class
    private String CourseName;

    private int NumOfStudents;

    private String CourseLecturer;

    //The constractor of the Course class
    Course(String CourseName, int NumOfStudents, String courseLecturer) {

        this.CourseName = CourseName;

        this.NumOfStudents = NumOfStudents;

        this.CourseLecturer = courseLecturer;
    }



    //gets the course name
    public String getCourseName() {

        return CourseName;
    }

    //gets the number of students
    public int getNumOfStudents() {

        return NumOfStudents;
    }



    public String toString() {
        return "\n===========================\nCourseName : "+CourseName+"\nNumber of Students : "+NumOfStudents+"\nCourse Lecturer: "+CourseLecturer+"\n";
    }

    public static void main(String[] args) {

        //the array list that will hold the all the courses
        ArrayList<Course> Course1 = new ArrayList<>();

        //adding to the array list by calling the add fuction
        Course1.add(new Course("Accounting", 50, "Nipho"));

        Course1.add(new Course("Business", 30, "Owen"));

        Course1.add(new Course("History", 23, "Wezi"));

        Course1.add(new Course("Maths", 12, "Brighton"));

        Course1.add(new Course("English", 10, "Tafi"));


        //The for loop will be used to print
        System.out.println("\nThe Course info :\n");

        for(int i=0; i<Course1.size();i++) {

            System.out.println(Course1.get(i));

        }


        //The sort function will sort the list using the student number from small to big
        Collections.sort(Course1, new Comparator<Course>() {

            //The compare method will compare the students number
            public int compare(Course o1, Course o2) {

                int number1 = o1.getNumOfStudents();

                int number2 = o2.getNumOfStudents();

                //From small to big
                return number1-number2;
            }
        });
        //prints the sorted list
        System.out.println("\nThe sorted list using student number: \n");

        for(Course info: Course1) {

            System.out.println(info);
        }

        //the swap function swap the elements on index 1 and index 2
        Collections.swap(Course1, 1, 2);

        //prints out the new list with index 1 and 2 swapped
        System.out.println("\nThe Element 1 and 2 have been swapped: \n");

        for(Course info: Course1) {

            System.out.println(info);
        }


        //The course2 array will be created
        ArrayList<Course> course2 = new ArrayList<Course>();

        //The addAll function will add all the elements from course 1 to course 2
        course2.addAll(Course1);

        //prints the course2 list
        System.out.println("\nThe course 2 list info: \n ");

        for(Course info: course2) {

            System.out.println(info);
        }

        //new elements are added using the add fuction
        course2.add(new Course("Java 101",55, "Dr. P Green"));

        course2.add(new Course("Advanced Programming", 93, "Prof. M Milton"));

        //prints the course2 list with the new elements addes
        System.out.println("\nThe course 2 list info with the new elements added: \n");

        for(Course info: course2) {

            System.out.println(info);

        }

        //the sort function will sort the list using the course name
        Collections.sort(course2, new Comparator<Course>() {

            //this method will compare the course names
            public int compare(Course o1, Course o2) {

                String course_name1 = o1.getCourseName().toUpperCase();

                String course_name2 = o2.getCourseName().toUpperCase();

                return course_name1.compareTo(course_name2);
            }
        });

        //prints the sorted list based on the course name
        System.out.println("\nThe Sorted listed based on the course name : \n");

        for(Course info: course2) {

            System.out.println(info);
           }

        //for loop will be used to get the index of the java course
        for (Course info:course2) {

            //if the index is found it is printed
            if (info.getCourseName().compareTo("Java 101")==0){

                System.out.println("\n"+course2.indexOf(info)+" is the index of Java 101\n");

                break;
            }
        }


        //the disjoint fuction will return a false as there are elemnts that are common with the two list
        boolean isCommon = Collections.disjoint(Course1, course2);

        if ( isCommon==false){

            System.out.print("\nThe two list have elements common\n");

        }
        else {

            System.out.print("\nThe two list have no elements in common\n");
        }

        //sorts the course2 list based on the student number
        Collections.sort(course2, new Comparator<Course>() {

            public int compare(Course o1, Course o2) {

                int number1 = o1.getNumOfStudents();

                int number2 = o2.getNumOfStudents();

                return number1-number2;
            }
        });
        System.out.println("\nCourse with minimum number  of students : ");

        //since the list is sorted from small to big the the the element at index 0 is has the minimum students
        System.out.println(course2.get(0));

        System.out.println("\nCourse with maximum number of students : ");

        //the element at index -1 has the maximum number of students
        System.out.println(course2.get(course2.size()-1));




    }
}
