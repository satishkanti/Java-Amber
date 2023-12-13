import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {
        
        PriorityQueue<String> q1 = new PriorityQueue<String>();

        q1.add("HTML");
        q1.add("CSS");
        q1.add("Java");
        q1.offer("Springboot");

        // get
        System.out.println(q1);
        System.out.println(q1.element());
        System.out.println(q1.peek());

        // return & remove element
        System.out.println(q1.remove());
        System.out.println(q1);

        // poll
        System.out.println(q1.poll());
        System.out.println(q1);

        // Iterator
        Iterator it = q1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}