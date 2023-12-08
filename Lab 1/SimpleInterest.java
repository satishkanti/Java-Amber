import java.util.*;

public class SimpleInterest {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principal amount: ");
        double p = sc.nextDouble();

        System.out.println("Enter the rate: ");
        double r = sc.nextDouble();

        System.out.println("Enter the time: ");
        double t = sc.nextDouble();

        double si = (p*r*t)/100;

        System.out.println("Simple Interest is " + si);
        sc.close();
    }
    
}
