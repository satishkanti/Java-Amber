public class Customer extends Account {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.location = "Mysore";
        c1.email = "kantisatish@gmail.com";
        c1.info();
        System.out.println(c1.email);
        System.out.println(c1.location);
    }
}
