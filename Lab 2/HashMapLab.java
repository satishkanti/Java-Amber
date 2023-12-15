import java.util.HashMap;

public class HashMapLab {
    
    public static void main(String[] args) {
        HashMap<Integer, String> m1 = new HashMap<Integer, String>();

        // adding elements to the map
        m1.put(101, "Satish");
        m1.put(102, "Vikas");
        m1.put(null, "Yuvraj");
        m1.put(103, "Chankit");
        m1.put(104, null);
        m1.put(105, "null");
        System.out.println(m1 + "\n");

        // search the key
        int keyToSearch = 105;
        if (m1.containsKey(keyToSearch)) {
            System.out.println("Value for key " + keyToSearch + ": " + m1.get(keyToSearch) + "\n");
        } else {
            System.out.println("Key " + keyToSearch + " not found in the map." + "\n");
        }

        // accessing only key
        System.out.println(m1.keySet() + "\n");

        // accessing only values
        System.out.println(m1.values() + "\n");

        // accessing both key & values using entrySet()
        System.out.println(m1.entrySet() + "\n");
    }
}
