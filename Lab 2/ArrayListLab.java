import java.util.ArrayList;
import java.util.Collections;

public class ArrayListLab {

    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<String>();

        a1.add("Satish");
        a1.add("Chankit");
        a1.add("Srinivas");
        a1.add("Shanu");
        a1.add("Vikas");
        a1.add("Yuvraj");
        System.out.println("ArrayList: " + a1 + "\n");
        
        // remove 5th element
        a1.remove(4);
        System.out.println("After removing 5th element: " + a1 + "\n");

        // reverse the arraylist
        Collections.reverse(a1);
        System.out.println("ArrayList after reversing: " + a1 + "\n");

        // shuffle the arraylist
        Collections.shuffle(a1);
        System.out.println("ArrayList after shuffling: " + a1+ "\n");

        // swapping two elements in arraylist
        Collections.swap(a1, 1, 4);
        System.out.println("ArrayList after swapping two elements: " + a1);
    }
}