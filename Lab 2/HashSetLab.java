import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetLab {

    public static void main(String[] args) {
        HashSet<Integer> h1 = new HashSet<Integer>();

        h1.add(10);
        h1.add(40);
        h1.add(20);
        h1.add(60);
        h1.add(30);
        h1.add(80);
        System.out.println("Hashset 1: " + h1 + "\n");

        HashSet<Integer> h2 = new HashSet<Integer>();

        h2.add(70);
        h2.add(90);
        h2.add(50);
        h2.add(100);
        h2.add(10);
        h2.add(40);
        System.out.println("Hashset 2: " + h2 + "\n");

        // intersection
        Set<Integer> intersection = new HashSet<>(h1);
        intersection.retainAll(h2);
        System.out.println("Intersection: " + intersection + "\n");

        // union
        Set<Integer> union = new HashSet<>(h1);
        union.addAll(h2);
        System.out.println("Union: " + union + "\n");

        // difference
        Set<Integer> difference = new HashSet<>(h1);
        difference.removeAll(h2);
        System.out.println("Difference (Set1 - Set2): " + difference + "\n");

        // subset
        boolean isSubset = h1.containsAll(h2);
        System.out.println("Is Set2 a subset of Set1? " + isSubset + "\n");

        // sort set in descending order
        TreeSet<Integer> sortedSet = new TreeSet<>((a, b) -> b.compareTo(a));
        sortedSet.addAll(h1);
        System.out.println("Set1 sorted in descending order: " + sortedSet + "\n");
    }

    
    
}
