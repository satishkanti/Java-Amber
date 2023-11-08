import java.util.Scanner;

public class ScannerLaptopDemo {
    
    Scanner sc = new Scanner(System.in);

    void add(){
        System.out.println("Enter two numbers a & b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        double res = a + b;
        System.out.println("The Addition of Two Numbers: " + res);
    }

    void subtract(){
        System.out.println("Enter two numbers a & b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        double res = a - b;
        System.out.println("The Subtraction of Two Numbers: " + res);
    }

    void multiply(){
        System.out.println("Enter two numbers a & b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        double res = a * b;
        System.out.println("The Multiplication of Two Numbers: " + res);
    }

    void evenOrOdd(){
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println(n + " is Even!");
        }else{
            System.out.println(n + " is Odd!");
        }
        
    }

    public static void main(String[] args) {
        ScannerLaptopDemo s1 = new ScannerLaptopDemo();
        int op=0;
        Scanner sc = new Scanner(System.in);
        while(op!=5){
            System.out.println("\nMENU:\n1.Addition\n2.Substraction\n3.Multiplication\n4.Even or Odd\n5.Exit\n");
            op = sc.nextInt();
        
            // double res;
            switch(op){
                case 1:
                    /*System.out.println("Enter two numbers a & b: ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    res = a+b;
                    System.out.println("The Addition of two numbers: " + res);*/
                    s1.add();
                    break;
                case 2:
                    /*System.out.println("Enter two numbers a & b: ");
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    res = x-y;
                    System.out.println("The Subtraction of two numbers: " + res);*/
                    s1.subtract();
                    break;
                case 3:
                    /*System.out.println("Enter two numbers a & b: ");
                    int c = sc.nextInt();
                    int d = sc.nextInt();
                    res = c*d;
                    System.out.println("The Multiplication of two numbers: " + res);*/
                    s1.multiply();
                    break;
                case 4:
                    /*System.out.println("Enter two numbers a & b: ");
                    int e = sc.nextInt();
                    int f = sc.nextInt();
                    if(f==0){
                        System.out.println("b cannot be 0");
                    }else{
                        res = e/f;
                        System.out.println("The Division of two numbers: " + res);
                    }*/
                    s1.evenOrOdd();
                    break;
                case 5:
                    System.exit(op);
                
            }
    
        }
        sc.close();
    }
    
}
