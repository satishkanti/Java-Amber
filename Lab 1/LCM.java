import java.util.*;

public class LCM {

    static int gcd(int a, int b){
        if(a==0)
            return b;
        return gcd(b%a, a);
    }

    static int lcm(int a, int b){

        return (a / gcd(a, b)) * b; 
    }
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter a & b: ");
         int a = sc.nextInt();
         int b = sc.nextInt();

         System.out.println("LCM of " + a + " & " + b + " is " + lcm(a, b));
         sc.close();
    }
}
