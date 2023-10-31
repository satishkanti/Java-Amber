import java.util.*;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the color: ");
        String color = sc.next();
        switch(color){
            case "red":
                System.out.println("The color is: " + color);
                break;
            case "orange":
                System.out.println("The color is: " + color);
                break;
            case "green":
                System.out.println("The color is: " + color);
                break;
            case "yellow":
                System.out.println("The color is: " + color);
                break;
            default:
                System.out.println("Invalid!" );
            
        }
        sc.close();
    }
}
