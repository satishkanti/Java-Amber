public class StringBufferEx {

    public static void main(String[] args) {
        
        StringBuffer sb1 = new StringBuffer("Hello");
        System.out.println(sb1.append(" World"));

        StringBuffer sb2 = new StringBuffer("Hi");
        System.out.println(sb2.insert(2, "Java"));

        System.out.println(sb1.replace(5, 6, "Welcome"));

        System.out.println(sb1.delete(0, 5));

        System.out.println(sb1.reverse());

        System.out.println(sb1.capacity());
    }
}