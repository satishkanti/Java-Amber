import java.util.*;

public class EvenNumber {

    private ArrayList<Integer> a1;
    private ArrayList<Integer> a2;

    public EvenNumber(){
        a1 = new ArrayList<>();
        a2 = new ArrayList<>();
    }

    public ArrayList<Integer> storeEvenNumbers(int n){
       for(int i=2; i<=n; i++){
        a1.add(i);
       }
       return a1;
    }

    public ArrayList<Integer> printEvenNumber(){
        for(int num:a1){
            int mul = num*2;
            System.out.println(mul + ",");
            a2.add(mul);
        }
        System.out.println();
        return a2;
    }

    public int retrieveEvenNumber(int n){
        for(int number:a1){
            if(number==n){
                return n;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        EvenNumber e1 = new EvenNumber();

        ArrayList<Integer> a1 = e1.storeEvenNumbers(20);
        System.out.println("A1: " + a1);

        ArrayList<Integer> a2 = e1.printEvenNumber();
        System.out.println("A2: " + a2);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the search number: ");
        int n = sc.nextInt();

        int res = e1.retrieveEvenNumber(n);
        if(res!=0){
            System.out.println("Number " + n + " exists in A1");
        }else{
            System.out.println("Number " + n + " does not exist in A1");
        }
        sc.close();
    }
}