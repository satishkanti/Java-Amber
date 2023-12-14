package Student_Example;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    
    public static void main(String[] args) {
        ArrayList<Student> a1 = new ArrayList<Student>();

        a1.add(new Student(101, 22, "Satish"));
        a1.add(new Student(104, 23, "Vikas"));
        a1.add(new Student(102, 24, "Chankit"));
        a1.add(new Student(103, 21, "Yuvraj"));

        System.out.println("Unsorted: " + a1);
        Collections.sort(a1);
        System.out.println(a1);

        // Sorting according to roll_no
        System.out.println("Sorted according RollNo: ");
        Collections.sort(a1, new RollNo_Sorting());
        System.out.println(a1);

        // Sorting according to name 
        System.out.println("Sorted according Name: ");
        Collections.sort(a1, new Name_Sorting());
        System.out.println(a1);

        // Sorting according to age
        System.out.println("Sorted according Age: ");
        Collections.sort(a1, new Age_Sorting());
        System.out.println(a1);
    }
}
