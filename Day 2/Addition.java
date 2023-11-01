public class Addition {
    
    public int add(int a, int b){
        int res = a+b;
        return res;
    }

    public int add(int a, int b, int c){
        int res = a+b+c;
        return res;
    }

    public static void main(String[] args) {
        Addition a1 = new Addition();
        System.out.println(a1.add(10,3));
        System.out.println(a1.add(20,5,10));
    }
}
