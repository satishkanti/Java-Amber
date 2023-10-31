import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int fact=1;
        fact = fact(n);
        System.out.println("Factorial of " + n + " is " + fact);
        sc.close();
    }
    static int fact(int n){
        if(n==0)
            return 1;
        else
            return(n*fact(n-1));
    }
}
