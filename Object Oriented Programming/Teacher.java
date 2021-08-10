public class Teacher {
    ////the attributes for the class with their data types

    String name;

    String surname;

    String grade_teaching;

    String subject_teaching;

    int  years_teaching;

    //// the constructor with parameters brings the attributes into existence

    public Teacher(String name,String surname,String grade_teaching,String subject_teaching,int years_teaching){

        this.name=name;

        this.surname=surname;

        this.grade_teaching=grade_teaching;

        this.subject_teaching=subject_teaching;

        this.years_teaching=years_teaching;
    }
    //The tostring method will display structure the information in a more readable manner
    //The tostring will return the variable output

    public String toString(){
        String output= "Name: "+name;
        output+="\nSurname: "+surname;
        output+= "\nGrade teaching: "+grade_teaching;
        output+="\nSubject teaching: "+subject_teaching;
        output+=  "\nYears teaching: "+years_teaching;

        return output;
    }


}
