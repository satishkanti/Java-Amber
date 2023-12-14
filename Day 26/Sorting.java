import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    
    public static void main(String[] args) {
        ArrayList<Emp> a1 = new ArrayList<Emp>();
        a1.add(new Emp(101, 123, "Satish"));
        a1.add(new Emp(109, 124, "Vikas"));
        a1.add(new Emp(106, 124, "Shanu"));
        a1.add(new Emp(107, 129, "Yuvraj"));

        System.out.println("Unsorted= " + a1);
        System.out.println();

        // Sorting according to name
        Collections.sort(a1, new NameSorting());
        System.out.println(a1);
        System.out.println();

        // Sorting according to id 
        Collections.sort(a1, new IDSorting());
        System.out.println(a1);
    }
}
