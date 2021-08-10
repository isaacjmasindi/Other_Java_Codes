public class Secretary {
    //the attributes for the class with their data types

    public String name;

    public String surname;

    public String highest_qualification;

    public String Mircosoft_offic_skills;

    int  num_of_work_experience;

    // the constructor with parameters brings the attributes into existence

    public Secretary(String name,String surname,String highest_qualification,String Mircosoft_office_skills,int num_of_work_experience){

        this.name=name;

        this.surname=surname;

        this.highest_qualification =highest_qualification;

        this.Mircosoft_offic_skills =Mircosoft_office_skills;

        this.num_of_work_experience=num_of_work_experience;
    }
//The tostring method will display structure the information in a more readable manner

    public String toString(){

        return "Name: "+name+
                "\nSurname: "+surname+
                "\nHighest form of qualification: "+highest_qualification+
                "\nType of microsoft office skills: "+ Mircosoft_offic_skills +
                "\nWork experience: "+num_of_work_experience;
    }

}
