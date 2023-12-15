import java.util.LinkedList;

public class LinkedListLab {
    
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<Integer>();

        // inserting elements into linkedlist  to the first & last position
        l1.addFirst(10);
        l1.addLast(60);
        System.out.println("LinkedList after inserting at the first and last position: " + l1 + "\n");

        // Append the Specified Element to the end of a LinkedList
        l1.add(30);
        System.out.println("LinkedList after appending an element: " + l1 + "\n");

        // Replace an Element in a LinkedList
        l1.set(1, 20);
        System.out.println("LinkedList after replacing an element at index " + l1 + "\n" );

        // Compare Two LinkedList
        LinkedList<Integer> l2 = new LinkedList<Integer>();
        l2.add(40);
        l2.add(20);
        l2.add(50);
        boolean isEqual = l1.equals(l2);
        System.out.println("Are the two LinkedLists equal? " + isEqual + "\n");

        // Replace an Element in a LinkedList
        int elementToReplace = 20;
        int replacementValue = 40;
        int indexOfElement = l1.indexOf(elementToReplace);
        if(indexOfElement!=-1){
            l1.set(indexOfElement, replacementValue);
            System.out.println("LinkedList after replacing element " + elementToReplace + ": " + l1);
        } else {
            System.out.println("Element " + elementToReplace + " not found in the LinkedList.");
        }
        
    }
}
