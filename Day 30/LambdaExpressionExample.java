interface Test {
    public void primeNumber(int n);
}

class Prime implements Test {

    @Override
    public void primeNumber(int n) {
        
    }

}

public class LambdaExpressionExample {
    public static void main(String[] args) {
        Test t1 = (n)-> {
            if(n%2==0){
                System.out.println(n + " is not a prime number!");
            }else{
                System.out.println(n + " is a prime number");
            }
        };
        t1.primeNumber(5);
    }
}
