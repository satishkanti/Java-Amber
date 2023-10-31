import java.util.*;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        if(age>=16 && age<=18){
            System.out.println("Student eligible to vote");
        }else if(age<16 || age>18){
            System.out.println("Student not eligible to vote ");
        }
        sc.close();
    }
}
