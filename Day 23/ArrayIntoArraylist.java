import java.util.ArrayList;
import java.util.Arrays;

public class ArrayIntoArraylist {

    public static void main(String[] args) {
         String arr[] = {"HTML", "CSS", "Java", "Springboot"};

         for(String value:arr){
            System.out.println(value);
         }

         ArrayList<String> a1 = new ArrayList<>(Arrays.asList(arr));
         System.out.println(a1);
    }
}