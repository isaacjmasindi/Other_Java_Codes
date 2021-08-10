import java.util.*;
public class priorityqueuses {
    public static void main(String[] args) {
        // Create two string  priority queues
        //The names are added into the queues
        PriorityQueue<String> Namequeue1 = new PriorityQueue<>();

        Namequeue1.add("George");

        Namequeue1.add("Jim");

        Namequeue1.add("John");

        Namequeue1.add("Blake");

        Namequeue1.add("Kevin");

        Namequeue1.add("Michael");

        PriorityQueue<String> Namequeue2 = new PriorityQueue<>();

        Namequeue2.add("George");

        Namequeue2.add("Katie");

        Namequeue2.add("Kevin");

        Namequeue2.add("Michelle");

        Namequeue2.add("Ryan");

        // Display the two sets and union, difference, and intersection
        System.out.println("Set1: " + Namequeue1);

        System.out.println("Set2: " + Namequeue2);

        System.out.println("Union of sets: " + union(Namequeue1, Namequeue2));

        System.out.println("Difference of sets: " + difference(Namequeue1, Namequeue2));

        System.out.println("Intersection of sets: " + intersection(Namequeue1, Namequeue2));
    }

    //Method returns the union of two sets
    //The Hashset are to avoid duplicates in the sets
    public static <T> HashSet<String> union(PriorityQueue<T> set1, PriorityQueue<T> set2) {

        HashSet<String>union=new HashSet<>((Collection<? extends String>) set1);

        union.addAll((Collection<? extends String>) set1);

        union.addAll((Collection<? extends String>) set2);

        return union;
    }

    /// this method returns the difference of two sets
    public static <T> PriorityQueue<T> difference(PriorityQueue<T> queue1, PriorityQueue<T> queue2) {

        PriorityQueue<T> difference = new PriorityQueue<>(queue1);

        PriorityQueue<T> difference2 = new PriorityQueue<>(queue2);

        difference.removeAll(queue2);

        difference2.removeAll(queue1);

        PriorityQueue<T> difference3 = new PriorityQueue<>(difference);

        difference3.addAll(difference2);

        return difference3;
    }

    // this method returns the intersection of two sets
    public static <T> PriorityQueue<T> intersection(PriorityQueue<T> queue1, PriorityQueue<T> queue2) {

        PriorityQueue<T> intersection = new PriorityQueue<>(queue1);

        intersection.retainAll(queue2);

        return intersection;
    }
}
