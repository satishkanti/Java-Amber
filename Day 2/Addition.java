public class Addition {
    
    public void add(int a, int b){
        int res = a+b;
        System.out.println(res);
    }

    public void add(int a, int b, int c){
        int res = a+b+c;
        System.out.println(res);
    }

    public static void main(String[] args) {
        Addition a1 = new Addition();
        a1.add(10,3);
        a1.add(20,5,10);
    }
}
