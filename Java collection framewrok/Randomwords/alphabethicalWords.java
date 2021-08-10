import java.util.*;
import java.io.*;

public class alphabethicalWords {
    //this is the main method
    public static void main(String[] args)  {

        //the new Treeset is brought into existence
        TreeSet<String>treeSet = new TreeSet<>();

        //the try and catch will be used to display a message if the file is not found or cant read the lines
        try
        {

            BufferedReader Namesfiles = new BufferedReader(new FileReader("Randomwords.txt"));
            String line;

            //the will loop will be usd to read from the file and add the file content into a string array
            //it will also be used to add all the array items into a set
            while ((line = Namesfiles.readLine())!=null)
            {
                String[] NamesArray = line.split("\n");

                treeSet.addAll(Arrays.asList(NamesArray));

            }
        } catch (FileNotFoundException e){
            System.out.print("File not found ");

        } catch (IOException e) {
            System.out.print("Error ");
        }

        //the Iterator  will be used to sort the set
        Iterator iterator = treeSet.iterator();

        System.out.println("\nNames\n");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }
}
