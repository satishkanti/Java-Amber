import java.util.*;

class Greatest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        System.out.println("Enter y: ");
        int y = sc.nextInt();
        if(x>y){
            System.out.println("X is greater than Y");
        }
        else{
            System.out.println("Y is greater than X");
        }
        sc.close();
    }
}