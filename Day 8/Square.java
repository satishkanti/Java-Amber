public interface Square {
    
    public default void square(int a){
        System.out.println("Area of Square: " + a*a);
        cube(a);
        double n = 16;
        squareRoot(n);
    }

    private void cube(int a){
        System.out.println("Area of Cube: " + 6*a*a);
    }

    private static void squareRoot(double n){
        System.out.println("Square of " + n + " " + Math.sqrt(n));
    }
}
