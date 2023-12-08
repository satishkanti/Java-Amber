import java.util.*;

public class SwapWithoutThirdVariable {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a & b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Before Swapping: " + a + " " +  b);
        
        a = a+b;
        b = a-b;
        a = a-b;
        
        System.out.println("After Swapping: " + a + " 3" + b);
        sc.close();
    }
    
}