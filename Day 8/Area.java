public interface Area {
    
    public default void circle(int r){
        double area = 3.14*r*r;
        System.out.println("Area of Circle: " + area);
        int l=5, w=6;
        double b=3.2, h=2.5;
        rectangle(l, w);
        triangle(b, h);
    }

    private void rectangle(int l, int w){
        // double area = l*b;
        System.out.println("Area of Rectangle: " + l*w);
    }

    private static void triangle(double b, double h){
        double area = 0.5*b*h;
        System.out.println("Area of Triangle: " + area);
    }
}
