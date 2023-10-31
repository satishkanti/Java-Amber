import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        int rem, sum=0, temp;
        temp = n;
        while(n>0){
            rem = n%10;
            sum = (sum*10) + rem;
            n = n/10;
        }
        if(sum==temp){
            System.out.println("Palindrome!");
        }else{
            System.out.println("Not Palindrome!");
        }
        sc.close();
    }
}
