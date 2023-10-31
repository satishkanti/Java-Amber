import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        int r, temp, sum=0;
        temp = n;
        while(n>0){
            r = n%10;
            n = n/10;
            sum += r*r*r;
        }
        if(temp==sum){
            System.out.println("It's an Armstrong number");
        }
        else{
            System.out.println("Not an armstrong number");
        }
        sc.close();
    }
}
