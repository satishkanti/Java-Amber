import java.util.Arrays;
import java.util.List;

interface Operation {
    int operate( List<Integer> list);
}

public class LambdaArrayListExample {
    
    public static void main(String[] args) {
        List<Integer> n = Arrays.asList(2,4,5,3,6,8);
        Operation o1 = (list)->{
            int res = 1;
            for(int num : list){
                res*=num;
            }
            return res;
        };
        
        Operation o2 = (list)->{
            int res = 0;
            for(int num : list){
                res+=num;
            }
            return res;
        };

        System.out.println("Multiplication of List of Integers: " + o1.operate(n));
        System.out.println("Sum of List of Integers: " + o2.operate(n));

    }
}
