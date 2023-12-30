import java.util.Scanner;

public class Product {
    int p_id;
    String p_name;
    double p_price;

    public void productDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product ID: ");
        p_id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Product Name: ");
        p_name = sc.nextLine();

        System.out.print("Enter Price: ");
        p_price = sc.nextDouble();
        
    }

    public void display(){
        System.out.println("Product ID: " + p_id);
        System.out.println("Product name: " + p_name);
        System.out.println("Product price: " + p_price);
    }

    public static void main(String[] args) {
        Product[] p = new Product[2];

        for(int i=0; i<p.length; i++){
            p[i] = new Product();
            System.out.println("Enter details for Product " + (i + 1) + ":");
            p[i].productDetails();
        }

        System.out.println("\nProduct Details:");
        for (Product product : p) {
            product.display();
            System.out.println(); 
        
        }
        
    }
    
    
}