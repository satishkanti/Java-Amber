import java.util.PriorityQueue;

public class QueueLab {
    
    public static void main(String[] args) {
        PriorityQueue<String> q1 = new PriorityQueue<String>();

        q1.add("HTML");
        q1.add("CSS");
        q1.add("Java");
        q1.add("JavaScript");
        q1.offer("Springboot");

        System.out.println(q1 + "\n");

        // peek operation
        System.out.println("Peek operation: " + q1.peek() + "\n");

        // element operation
        System.out.println("Element operation: " + q1.element() + "\n");

        // offer operation
        System.out.println("Offer operation: " + q1.offer("AngularJS") + "\n");
    }
}
