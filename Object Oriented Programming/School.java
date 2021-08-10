public class School
{
   public static void main (String [] args)
   {
   ///The classes are given objects which contain value to the attributes
      Student sally = new Student("Sally", 15, 8, 'D');
      Student sipho = new Student("Sipho", 17 , 11, 'A');
      Student rajesh = new Student("Rajesh", 19, 12, 'B');

      Teacher nipho=new Teacher("Nipho","Matanda","7","Maths",6);
      Teacher collin=new Teacher("Collin","Smith","12","English",2);
      Teacher owen=new Teacher("Owen","Medlock","10","History",10);

      Secretary wezi=new Secretary("Wezi","Ndlovo","Diploma","Excel Skills",0);
      Secretary rose=new Secretary("Rose","Sithole","Degree","Word skill",3);
      Secretary Ntokozo=new Secretary("Ntokozo","William","Degree","Excel Skills",4);

//the values to the attributes are then printed the manner of the tostring
      System.out.println("Students\n");
      System.out.println(sally + "\n");
      System.out.println(sipho + "\n");
      System.out.println(rajesh);
      System.out.println("\nTeachers\n");
      System.out.println(nipho+"\n");
      System.out.println(collin+"\n");
      System.out.println(owen);
      System.out.println("\nSecretaries\n");
      System.out.println(wezi+"\n");
      System.out.println(rose+"\n");
      System.out.println(Ntokozo);
   }
}