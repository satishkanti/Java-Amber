import java.util.*;

public class PyramidPattern {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of rows: ");
        int row = sc.nextInt();

        int i, j;
        for (i=0; i<row; i++){
            for (j=row-i; j>1; j--){
                System.out.print(" ");  
            }
            for (j=0; j<=i; j++ ){         
                System.out.print("* ");   
            }
            System.out.println();      
        }
    }
}
