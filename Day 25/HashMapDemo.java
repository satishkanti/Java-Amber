import java.util.HashMap;

public class HashMapDemo {
    
    public static void main(String[] args) {
        
        HashMap<Integer, String> h1 = new HashMap<Integer, String>();

        // add
        h1.put(101, "Satish");
        h1.put(102, "Vikas");
        h1.put(null, "Yuvraj");
        h1.put(103, "Chankit");
        h1.put(104, null);
        h1.put(105, "null");
        System.out.println(h1);
        

        // get
        System.out.println(h1.keySet());
        System.out.println(h1.values());
        System.out.println(h1.entrySet());
    }
}
