public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        
        KidUsers k1 = new KidUsers();
        k1.age = 18;
        k1.bookType = "fiction";
        k1.registerAccount();
        k1.requestBook();

        AdultUser a1 = new AdultUser();
        a1.age = 23;
        a1.bookType = "kids";
        a1.registerAccount();
        a1.requestBook();
    }
}
