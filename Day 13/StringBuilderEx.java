public class StringBuilderEx {
    
    public static void main(String[] args) {
        
        StringBuilder sb1 = new StringBuilder("Hello");
        System.out.println(sb1.append(" World!"));

        StringBuilder sb2 = new StringBuilder("Hello");
        System.out.println(sb2.insert(4, "Java"));

        System.out.println(sb1.replace(5, 6, "Welcome"));

        System.out.println(sb1.delete(0, 5));

        System.out.println(sb1.reverse());

        System.out.println(sb1.capacity());
    }
}
