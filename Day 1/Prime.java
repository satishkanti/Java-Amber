import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int i, count=0;
        for(i=2;i<n;i++){
            if(n%i==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("It's a prime number");
        }
        else{
            System.out.println("Not a prime number");
        }
        sc.close();
    }
}
