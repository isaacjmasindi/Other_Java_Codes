public class Student {

	// Attributes for the student class
   String name;
   int age;
   int grade;
   char registrationClass;
	
	// Methods used to bring the attributes into existence
   public Student(String name, int age, int grade, char registrationClass) {
      this.name = name;
      this.age = age;
      this.grade = grade;
      this.registrationClass = registrationClass;
   }
/// the method will be used to get the name and return the name
   public String getName() {
      return name;
   }

   /// the method will be used to get the RegistrationClass and return the RegistrationClass
   public char getRegistrationClass() {
      return registrationClass;
   }

   //The tostring method will display structure the information in a more readable manner
   //The tostring will return the variable output
   public String toString() {
      String output = "Name: " + name;
      output += "\nAge:" + age;
      output += "\nGrade:" + grade;
      output += "\nRegistration class:" + registrationClass;
   
      return output;
   }

}
