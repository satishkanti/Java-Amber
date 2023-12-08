import java.util.*;

public class SandglassPattern {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of rows: ");
        int row = sc.nextInt();

        int i, j, k;
        for (i=0; i<row-1; i++){
            for (j=0; j<i; j++){
                System.out.print(" ");  
            }
            for (k=i; k<=row-1; k++ ){         
                System.out.print("* ");   
            }
            System.out.println("");      
        }
        
        for (i= row-1; i>= 0; i--){  
            for (j=0; j<i; j++){  
                System.out.print(" ");  
            }  
            for (k=i; k<=row-1; k++){  
                System.out.print("*" + " ");  
            }  
            System.out.println("");  
        }  
    }
}
